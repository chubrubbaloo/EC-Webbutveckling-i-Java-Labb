package com.example.spring_uppgifter.dto;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class ToDoResponseDTO {

    private int id;
    private String title;
    private String todo;
    private int appUserId;

    public ToDoResponseDTO(int id, String title, String todo, int appUserId) {
        this.id = id;
        this.title = title;
        this.todo = todo;
        this.appUserId = appUserId;
    }

    public ToDoResponseDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public int getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(int appUserId) {
        this.appUserId = appUserId;
    }
}
