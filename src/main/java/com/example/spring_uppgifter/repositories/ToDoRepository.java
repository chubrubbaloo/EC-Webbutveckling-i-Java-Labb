package com.example.spring_uppgifter.repositories;

import com.example.spring_uppgifter.entities.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends JpaRepository<ToDo,Integer> {
}
