package com.example.gaiaapi.Controllers;

import com.example.gaiaapi.Dto.UserDto;
import com.example.gaiaapi.Models.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("/user")
    public List<UserDto> getAll() {
        User user = new User(3L, "Gabriel", "teste@teste.com", "123gabds", "1234");

        return UserDto.convert(Arrays.asList(user, user, user));
    }
}
