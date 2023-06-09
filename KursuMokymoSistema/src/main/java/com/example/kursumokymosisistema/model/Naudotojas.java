package com.example.kursumokymosisistema.model;

public interface Naudotojas {
    String login = null;
    String password = null;
    String email = null;

    public abstract void changeAccountPsw();
    public abstract void blockUser();
}
