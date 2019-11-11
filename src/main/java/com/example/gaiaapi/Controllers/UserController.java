package com.example.gaiaapi.Controllers;

import com.example.gaiaapi.Dto.UserDto;
import com.example.gaiaapi.Models.User;
import com.example.gaiaapi.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/user")
    public List<UserDto> getAll() {
        List<User> users = userRepository.findAll();
        return UserDto.convert(users);
    }
}
