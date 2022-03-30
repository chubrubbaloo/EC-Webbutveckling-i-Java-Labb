package com.example.spring_uppgifter.controller;

import com.example.spring_uppgifter.entities.ToDo;
import com.example.spring_uppgifter.service.ToDoService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class ToDoController {

    ToDoService toDoService;
    public ToDoController(ToDoService toDoService) {
        this.toDoService = toDoService;
    }

    // Hämtar alla todos.
    @GetMapping
    public String returnTodos(Model model) {
        List <ToDo> todoList = toDoService.findAll();
        model.addAttribute("todoList",todoList);
        return "todo";
    }

    @GetMapping("/addTodoForm")
    public String addTodo() {
        return "addTodoForm";
    }




    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteToDoById(@PathVariable("id") int id) {
        toDoService.removeById(id);
        return ResponseEntity.status(303).header("Location","/todo").build();
    }



    @PostMapping
    public String postTodo(@ModelAttribute ToDo toDo) {
        toDoService.save(toDo);
        return "redirect:/todo";
    }



}
