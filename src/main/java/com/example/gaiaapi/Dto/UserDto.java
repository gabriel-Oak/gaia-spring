package com.example.gaiaapi.Dto;

import com.example.gaiaapi.Models.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class UserDto {
    private Long id;
    private String name;
    private String nickName;
    private String email;

    public UserDto(User user) {
        this.id = user.getId();
        this.name = user.getName();
        this.nickName = user.getNickName();
        this.email = user.getEmail();
    }

    public static List<UserDto> convert(List<User> users) {
        return users.stream().map(UserDto::new).collect(Collectors.toList());
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
