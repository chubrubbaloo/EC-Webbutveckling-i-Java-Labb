package com.example.spring_uppgifter.controller;

import com.example.spring_uppgifter.entities.Todo;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class ToDoController {

    List<Todo> todoList = new ArrayList<>(List.of(
            new Todo("Jobb","Sätt in 8 timmar på spring boot."),
            new Todo("Hälsa","Slå nytt pb på 3km rundan.")
    ));

    @GetMapping
    public List<Todo> returnTodos() {
        return todoList;
    }

    @GetMapping("/{id}")
    public Todo returnToDoById(@PathVariable("id") int id) {
        return todoList
                .stream()
                .filter(todo -> todo.getId() == id)
                .findFirst()
                .orElseThrow();
    }

    @PostMapping
    public Todo postTodo(@RequestBody Todo todo) {
        todoList.add(todo);
        return todo;
    }

    @DeleteMapping("/{id}")
    public void deleteToDoById(@PathVariable("id") int id) {
        todoList.removeIf(todo -> todo.getId() == id);
    }

    @PutMapping("/{id}")
    public Todo updateTodoById(@PathVariable("id") int id, @RequestBody Todo changedTodo) {
        Todo existingTodo = todoList
                .stream()
                .filter(todo -> todo.getId() == id)
                .findFirst()
                .orElseThrow();

        BeanUtils.copyProperties(changedTodo,existingTodo,"id");
        return existingTodo;
    }
}
