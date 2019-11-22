package com.example.gaiaapi.Controllers;

import com.example.gaiaapi.Controllers.Forms.SessionForm;
import com.example.gaiaapi.Dto.SessionDto;
import com.example.gaiaapi.Dto.UserDto;
import com.example.gaiaapi.Models.User;
import com.example.gaiaapi.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/session")
public class SessionController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public ResponseEntity<UserDto> create(@RequestBody @Valid SessionForm form, UriComponentsBuilder uriBuilder) {
        User user = userRepository.findByEmail(form.getEmail());
        SessionDto session = new SessionDto();
        URI uri = uriBuilder.path("/").buildAndExpand().toUri();

        if( user.getPassword().compareTo(form.getPassword()) == 0) {
             session.setUser(new UserDto(user));
             return ResponseEntity.ok().body(new UserDto(user));
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
