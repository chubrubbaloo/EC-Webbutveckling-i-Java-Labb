package com.example.spring_uppgifter.entities;


import javax.persistence.*;
import java.util.Date;

@Entity
public class ToDo {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String title;

    @Column
    private Date createdPostTime;

    @Column
    private String message;


    public ToDo(String title, String message) {
        this.title = title;
        this.createdPostTime = new Date();
        this.message = message;
    }

    public ToDo() {

    }

    public Date getCreatedPostTime() {
        return createdPostTime;
    }

    public void setCreatedPostTime(Date createdPostTime) {
        this.createdPostTime = createdPostTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
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
