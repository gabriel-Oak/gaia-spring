package com.example.gaiaapi.Controllers.Forms;

import com.example.gaiaapi.Models.User;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class UserForm {

    @NotNull @NotEmpty
    private String name;
    @NotNull @NotEmpty @Email
    private String email;
    @NotNull @NotEmpty
    private String nickName;
    @NotNull @NotEmpty
    private String password;
    @NotNull
    private Boolean admin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public User convert() {
        return new User(this);
    }
}
