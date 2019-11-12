package com.example.gaiaapi.Models;

import com.example.gaiaapi.Controllers.Forms.ChangeOrderForm;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ChangeOrder {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Menu menu;

    private String pratoPrincipal;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

    public ChangeOrder() {
    }

    public ChangeOrder(ChangeOrderForm form, User user, Menu menu) {
        this.id = form.getId();
        this.user = user;
        this.menu = menu;
        this.pratoPrincipal = form.getPratoPrincipal();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
