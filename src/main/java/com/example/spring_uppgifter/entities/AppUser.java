package com.example.spring_uppgifter.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String username;

    @OneToMany(mappedBy = "appUser")
    @JsonIgnoreProperties("appUser")
    private Set<ToDo> todos;

    public AppUser(String username) {
        this.username = username;
    }

    public AppUser() {

    }

    public Set<ToDo> getTodos() {
        return todos;
    }

    public void setTodos(Set<ToDo> todos) {
        this.todos = todos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
