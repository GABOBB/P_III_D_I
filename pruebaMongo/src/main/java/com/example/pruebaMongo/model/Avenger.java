package com.example.pruebaMongo.model;

import org.springframework.data.annotation.Id;

public class Avenger {
    @Id
    private Long id;

    private String information;


    public Avenger() {
    }

    public Avenger(Long id, String information) {
        this.id = id;
        this.information = information;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }
}
