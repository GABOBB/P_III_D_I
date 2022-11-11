package com.example.pruebaMongo.model;

import org.springframework.data.annotation.Id;

public class Avenger {
    @Id
    private Long id;

    private String name;
    private String superheroName;
    private String movie;
    private Integer age;

    public Avenger() {
    }

    public Avenger(Long id, String name, String superheroName, String movie, Integer age) {
        this.id = id;
        this.name = name;
        this.superheroName = superheroName;
        this.movie = movie;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
