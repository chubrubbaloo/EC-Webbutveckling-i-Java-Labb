package com.example.spring_uppgifter;

import com.example.spring_uppgifter.entities.ToDo;
import com.example.spring_uppgifter.repositories.ToDoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class SpringLabbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLabbApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ToDoRepository toDoRepository) {
        return args -> {

            ToDo toDo = new ToDo("Studier", "Lär dig Spring Boot & Thymeleaf.");
            toDo.setCreatedPostTime(new Date(120,01,15,18,30,10));
            toDoRepository.save(toDo);
        };
    }

}
