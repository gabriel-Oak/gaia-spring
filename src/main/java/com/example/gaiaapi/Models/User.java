package com.example.gaiaapi.Models;

import com.example.gaiaapi.Controllers.Forms.UserForm;
import com.example.gaiaapi.Dto.UserDto;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;


    private String email;
    private String nickName;
    private String password;

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    private Boolean admin;

    public User() {
    }

    public User(UserForm form) {
        this.name = form.getName();
        this.email = form.getEmail();
        this.nickName = form.getNickName();
        this.password = form.getPassword();
        this.admin = form.getAdmin();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
    
}
