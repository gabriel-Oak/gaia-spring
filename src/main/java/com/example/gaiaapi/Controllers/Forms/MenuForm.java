package com.example.gaiaapi.Controllers.Forms;

import com.example.gaiaapi.Models.Menu;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class MenuForm {
    @NotNull
    private Long id;
    @NotNull @NotEmpty
    private String pratoPrincipal;
    @NotNull @NotEmpty
    private String opcao1;
    @NotNull @NotEmpty
    private String opcao2;
    @NotNull @NotEmpty
    private String guarnicao1;
    @NotNull @NotEmpty
    private String guarnicao2;
    @NotNull @NotEmpty
    private String salada;
    @NotNull @NotEmpty
    private String sobremesa;
    @NotNull @Future
    private Date date;

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

    public Menu convert() {
        return new Menu(this);
    }
}
