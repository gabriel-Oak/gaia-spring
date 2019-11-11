package com.example.gaiaapi.Controllers;

import com.example.gaiaapi.Controllers.Forms.UserForm;
import com.example.gaiaapi.Dto.UserDto;
import com.example.gaiaapi.Models.User;
import com.example.gaiaapi.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<UserDto> getAll() {
        List<User> users = userRepository.findAll();
        return UserDto.convert(users);
    }

    @PostMapping
    public User create(@RequestBody UserForm form) {
        User user = form.convert();
        return userRepository.save(user);
    }
}
