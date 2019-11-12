package com.example.gaiaapi.Controllers.Forms;

import com.example.gaiaapi.Models.ChangeOrder;
import com.example.gaiaapi.Models.Menu;
import com.example.gaiaapi.Models.User;

public class ChangeOrderForm {
    private Long id;
    private Long user_id;
    private Long menu_id;
    private String pratoPrincipal;

    public String getPratoPrincipal() {
        return pratoPrincipal;
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
