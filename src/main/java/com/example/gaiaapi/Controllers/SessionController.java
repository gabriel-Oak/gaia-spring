package com.example.gaiaapi.Controllers;

import com.example.gaiaapi.Controllers.Forms.SessionForm;
import com.example.gaiaapi.Dto.SessionDto;
import com.example.gaiaapi.Dto.UserDto;
import com.example.gaiaapi.Models.User;
import com.example.gaiaapi.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/session")
public class SessionController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    public SessionDto create(@RequestBody @Valid SessionForm form) {
        User user = userRepository.findByEmail(form.getEmail());
        SessionDto session = new SessionDto();

        if( user.getPassword().compareTo(form.getPassword()) == 0) {
             session.setUser(new UserDto(user));
        } else {
            session.setError("Senha incompatível!");
        }
        return session;
    }
}
