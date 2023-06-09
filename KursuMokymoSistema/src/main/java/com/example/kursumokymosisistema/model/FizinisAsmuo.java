package com.example.kursumokymosisistema.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Year;

public class FizinisAsmuo extends Vartotojas implements Serializable {

    private String name;
    private String surname;
    private String position;
    private String email;
    private LocalDate birthDate;

    public FizinisAsmuo() {
    }

    public FizinisAsmuo(int id, String login, String psw, LocalDate createdDate, boolean isActive, String name, String surname) {
        super(id, login, psw, createdDate, isActive);
        this.name = name;
        this.surname = surname;
    }

    public FizinisAsmuo(int id, String login, String psw, LocalDate createdDate, boolean isActive, String name, String surname, String position, String email, LocalDate birthDate) {
        super(id, login, psw, createdDate, isActive);
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.birthDate = birthDate;
    }

    public int getAge(){
        return Year.now().getValue() - birthDate.getYear();
    }

}
