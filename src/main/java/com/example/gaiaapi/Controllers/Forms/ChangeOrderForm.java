package com.example.gaiaapi.Controllers.Forms;

import com.example.gaiaapi.Models.ChangeOrder;
import com.example.gaiaapi.Models.Menu;
import com.example.gaiaapi.Models.User;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

public class ChangeOrderForm {
    private Long id;

    @NotNull
    private Long user_id;
    @NotNull
    private Long menu_id;
    @NotNull @NotEmpty
    private String pratoPrincipal;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt = LocalDateTime.now();

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public Long getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(Long menu_id) {
        this.menu_id = menu_id;
    }
}
