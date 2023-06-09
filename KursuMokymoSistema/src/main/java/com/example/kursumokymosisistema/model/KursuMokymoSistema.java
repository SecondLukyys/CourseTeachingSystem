package com.example.kursumokymosisistema.model;

import java.io.Serializable;
import java.util.ArrayList;

public class KursuMokymoSistema implements Serializable {

    private int id;
    private String version;
    private ArrayList<Vartotojas> allSysUsers;
    private ArrayList<Kursas> allSysCourses;

    public KursuMokymoSistema(int id, String version, ArrayList<Vartotojas> allSysUsers, ArrayList<Kursas> allSysCourses) {
        this.id = id;
        this.version = version;
        this.allSysUsers = allSysUsers;
        this.allSysCourses = allSysCourses;
    }

    public KursuMokymoSistema() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ArrayList<Vartotojas> getAllSysUsers() {
        return allSysUsers;
    }

    public void setAllSysUsers(ArrayList<Vartotojas> allSysUsers) {
        this.allSysUsers = allSysUsers;
    }

    public ArrayList<Kursas> getAllSysCourses() {
        return allSysCourses;
    }

    public void setAllSysCourses(ArrayList<Kursas> allSysCourses) {
        this.allSysCourses = allSysCourses;
    }
}
