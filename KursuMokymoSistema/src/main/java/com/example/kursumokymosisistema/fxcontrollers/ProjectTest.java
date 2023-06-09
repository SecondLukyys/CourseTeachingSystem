package com.example.kursumokymosisistema.fxcontrollers;

import java.time.LocalDate;
import java.util.Date;

public class ProjectTest {

    private String name;
    private String description;
    private LocalDate dateCreated;

    public ProjectTest(String name, String description, LocalDate dateCreated) {
        this.name = name;
        this.description = description;
        this.dateCreated = dateCreated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Override
    public String toString() {
        return name;
    }
}
