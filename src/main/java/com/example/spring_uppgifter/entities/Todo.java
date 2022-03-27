package com.example.spring_uppgifter.entities;


import javax.persistence.Entity;

public class Todo {

    static int idCounter = 1;
    private final int id;
    private String title;
    private String todo;

    public Todo(String title, String todo) {
        this.title = title;
        this.todo = todo;
        this.id = idCounter;
        idCounter++;
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
