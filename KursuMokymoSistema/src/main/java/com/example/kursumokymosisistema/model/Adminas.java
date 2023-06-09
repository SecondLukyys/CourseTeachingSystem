package com.example.kursumokymosisistema.model;

import java.io.Serializable;

public class Adminas extends Vartotojas implements Serializable {

    private String privilegijos; // more to be added...

    public Adminas(String login, String psw, String privilegijos) {
        super(login, psw);
        this.privilegijos = privilegijos;
    }



}
