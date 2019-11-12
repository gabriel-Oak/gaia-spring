package com.example.gaiaapi.Dto;

public class SessionDto {
    private UserDto user;
    private String error;

    public SessionDto() {
    }

    public void setUser(UserDto user) {
        this.user = user;
    }

    public void setError(String error) {
        this.error = error;
    }

    public UserDto getUser() {
        return user;
    }

    public String getError() {
        return error;
    }
}
