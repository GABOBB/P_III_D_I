package com.example.pruebaMongo.model;

import org.springframework.data.annotation.Id;

public class MatrixIns {
    @Id
    private Long id;

    private String information;


    public MatrixIns() {
    }

<<<<<<< HEAD:pruebaMongo/src/main/java/com/example/pruebaMongo/model/Avenger.java
    public Avenger(Long id, String information) {
=======
    public MatrixIns(Long id, String name, String superheroName, String movie, Integer age) {
>>>>>>> arturo:pruebaMongo/src/main/java/com/example/pruebaMongo/model/MatrixIns.java
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
