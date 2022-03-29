package com.example.spring_uppgifter.dto;

public class ToDoRequestDTO {

    private String title;
    private String todo;
    private int appuser_id;

    public ToDoRequestDTO(String title, String todo, int appuser_id) {
        this.title = title;
        this.todo = todo;
        this.appuser_id = appuser_id;
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

    public int getAppuser_id() {
        return appuser_id;
    }

    public void setAppuser_id(int appuser_id) {
        this.appuser_id = appuser_id;
    }
}
