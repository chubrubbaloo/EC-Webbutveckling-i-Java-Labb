package com.example.spring_uppgifter.entities;


import javax.persistence.*;

@Entity
public class ToDo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String title;

    @Column
    private String message;


    public ToDo(String title, String message) {
        this.title = title;
        this.message = message;
    }

    public ToDo() {

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

}
