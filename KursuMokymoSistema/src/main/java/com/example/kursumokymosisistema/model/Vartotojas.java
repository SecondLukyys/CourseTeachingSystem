package com.example.kursumokymosisistema.model;

import java.io.Serializable;
import java.time.LocalDate;

public abstract class Vartotojas implements Serializable {

    private int id;
    private String login;
    private String psw;
    private LocalDate createdDate;
    private boolean isActive;

    public Vartotojas() {
    }

    public Vartotojas(int id, String login, String psw) {
        this.id = id;
        this.login = login;
        this.psw = psw;
    }

    public Vartotojas(String login, String psw) {
        this.login = login;
        this.psw = psw;
        this.createdDate = LocalDate.now();
        this.isActive = true;
    }

    public Vartotojas(String login, String psw, LocalDate createdDate, boolean isActive) {
        this.login = login;
        this.psw = psw;
        this.createdDate = createdDate;
        this.isActive = isActive;
    }

    public Vartotojas(int id, String login, String psw, LocalDate createdDate, boolean isActive) {
        this.id = id;
        this.login = login;
        this.psw = psw;
        this.createdDate = createdDate;
        this.isActive = isActive;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPsw() {
        return psw;
    }

    public void setPws(String psw) {this.psw = psw;}

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
