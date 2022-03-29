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
    private String todo;

    @ManyToOne
    @JoinColumn(name = "appuser_id")
    private AppUser appUser;


    public ToDo(String title, String todo, AppUser appUser) {
        this.title = title;
        this.todo = todo;
        this.appUser = appUser;
    }

    public ToDo() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public AppUser getAppUser() {
        return appUser;
    }

    public void setAppUser(AppUser appUser) {
        this.appUser = appUser;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getTodo() {
        return todo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
}
