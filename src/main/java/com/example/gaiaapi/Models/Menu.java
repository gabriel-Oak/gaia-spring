package com.example.gaiaapi.Models;

import com.example.gaiaapi.Controllers.Forms.MenuForm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Menu {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String pratoPrincipal;
    private String opcao1;
    private String opcao2;
    private String guarnicao1;
    private String guarnicao2;
    private String salada;
    private String sobremesa;
    private Date date;

    public Menu() { }

    public Menu(MenuForm form) {
        this.pratoPrincipal = form.getPratoPrincipal();
        this.opcao1 = form.getOpcao1();
        this.id = form.getId();
        this.opcao2 = form.getOpcao2();
        this.guarnicao1 = form.getGuarnicao1();
        this.guarnicao2 = form.getGuarnicao2();
        this.salada = form.getSalada();
        this.sobremesa = form.getSobremesa();
        this.date = form.getDate();
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
