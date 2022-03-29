package com.example.spring_uppgifter;

import com.example.spring_uppgifter.entities.AppUser;
import com.example.spring_uppgifter.entities.ToDo;
import com.example.spring_uppgifter.repositories.AppUserRepository;
import com.example.spring_uppgifter.repositories.ToDoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringUppgifterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringUppgifterApplication.class, args);
    }

    @Bean
    CommandLineRunner init(ToDoRepository toDoRepository, AppUserRepository appUserRepository) {
        return args -> {

            AppUser appUser = new AppUser("Gunnar");
            appUserRepository.save(appUser);

            ToDo toDo = new ToDo("Studier", "Lär dig Spring Boot & Thymeleaf.", appUser);
            toDoRepository.save(toDo);
            ToDo secondToDo = new ToDo("Hälsa","Få in 30 minuters motion för dagen.",appUser);
            toDoRepository.save(secondToDo);


        };
    }

}
