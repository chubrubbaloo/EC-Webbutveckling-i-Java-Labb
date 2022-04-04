package com.example.spring_uppgifter;

import com.example.spring_uppgifter.entities.ToDo;
import com.example.spring_uppgifter.repositories.ToDoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringLabbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringLabbApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ToDoRepository toDoRepository) {
        return args -> {

            ToDo toDo = new ToDo("Studier", "Lär dig Spring Boot & Thymeleaf.");
            toDoRepository.save(toDo);
        };
    }

}
