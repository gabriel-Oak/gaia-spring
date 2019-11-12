package com.example.gaiaapi.Dto;

import com.example.gaiaapi.Models.ChangeOrder;
import com.example.gaiaapi.Models.Menu;
import com.example.gaiaapi.Models.User;

import java.util.List;
import java.util.stream.Collectors;

public class ChangeOrderDto {
    private Long id;
    private Long user;
    private Long menu;
    private String pratoPrincipal;

    public ChangeOrderDto(ChangeOrder order) {
        this.id = order.getId();
        this.pratoPrincipal = order.getPratoPrincipal();
        this.user = order.getUser().getId();
        this.menu = order.getMenu().getId();
    }

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

    public Long getUser() {
        return user;
    }

    public void setUser(Long user) {
        this.user = user;
    }

    public Long getMenu() {
        return menu;
    }

    public void setMenu(Long menu) {
        this.menu = menu;
    }

    public static List<ChangeOrderDto> convert(List<ChangeOrder> orders) {
        return orders.stream().map(ChangeOrderDto::new).collect(Collectors.toList());
    }
}
