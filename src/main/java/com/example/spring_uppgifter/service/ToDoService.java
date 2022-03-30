package com.example.spring_uppgifter.service;

import com.example.spring_uppgifter.entities.ToDo;
import com.example.spring_uppgifter.repositories.ToDoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToDoService {

    ToDoRepository toDoRepository;

    public ToDoService(ToDoRepository toDoRepository) {
        this.toDoRepository = toDoRepository;
    }

    public List<ToDo> findAll() {
        return toDoRepository.findAll();
    }

    public void removeById(int id) {
        toDoRepository.deleteById(id);
    }


    public ToDo save(ToDo todo) {
        return toDoRepository.save(todo);
    }

}

