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

    public ToDo findToDoById(int id) {
        return toDoRepository.findById(id).orElseThrow();
    }

    public void removeById(int id) {
        toDoRepository.deleteById(id);
    }

    public ToDo save(ToDo todo) {
        return toDoRepository.save(todo);
    }

    public ToDo updateById(int id, ToDo changedToDo) {
        ToDo existingToDo = toDoRepository.findById(id).orElseThrow();

        if (changedToDo.getTitle() != null)
            existingToDo.setTitle(changedToDo.getTitle());
        if (changedToDo.getTodo() != null)
            existingToDo.setTodo(changedToDo.getTodo());

        toDoRepository.save(existingToDo);
        return existingToDo;

    }
}

