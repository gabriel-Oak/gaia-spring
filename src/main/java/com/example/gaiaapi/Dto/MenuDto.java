package com.example.gaiaapi.Dto;

import com.example.gaiaapi.Models.Menu;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class MenuDto {
    private Long id;
    private String pratoPrincipal;
    private String opcao1;
    private String opcao2;
    private String guarnicao1;
    private String guarnicao2;
    private String salada;
    private String sobremesa;
    private Date date;

    public MenuDto(Menu menu) {
        this.id = menu.getId();
        this.pratoPrincipal = menu.getPratoPrincipal();
        this.opcao1 = menu.getOpcao1();
        this.opcao2 = menu.getOpcao2();
        this.guarnicao1 = menu.getGuarnicao1();
        this.guarnicao2 = menu.getGuarnicao2();
        this.salada = menu.getSalada();
        this.sobremesa = menu.getSobremesa();
        this.date = menu.getDate();
    }

    public static List<MenuDto> convert(List<Menu> menus) {
        return menus.stream().map(MenuDto::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPratoPrincipal() {
        return pratoPrincipal;
    }

    public void setPratoPrincipal(String pratoPrincipal) {
        this.pratoPrincipal = pratoPrincipal;
    }

    public String getOpcao1() {
        return opcao1;
    }

    public void setOpcao1(String opcao1) {
        this.opcao1 = opcao1;
    }

    public String getOpcao2() {
        return opcao2;
    }

    public void setOpcao2(String opcao2) {
        this.opcao2 = opcao2;
    }

    public String getGuarnicao1() {
        return guarnicao1;
    }

    public void setGuarnicao1(String guarnicao1) {
        this.guarnicao1 = guarnicao1;
    }

    public String getGuarnicao2() {
        return guarnicao2;
    }

    public void setGuarnicao2(String guarnicao2) {
        this.guarnicao2 = guarnicao2;
    }

    public String getSalada() {
        return salada;
    }

    public void setSalada(String salada) {
        this.salada = salada;
    }

    public String getSobremesa() {
        return sobremesa;
    }

    public void setSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
