package com.example.spring_uppgifter.dto;

import com.example.spring_uppgifter.entities.AppUser;
import com.example.spring_uppgifter.entities.ToDo;
import com.example.spring_uppgifter.repositories.AppUserRepository;
import org.springframework.stereotype.Service;

@Service
public class ToDoConverterDTO {

    AppUserRepository appUserRepository;
    public ToDoConverterDTO(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public ToDo todoRequestDTOToEntity(ToDoRequestDTO toDoRequestDTO) {

        AppUser appUser = appUserRepository.findById(toDoRequestDTO.getAppuser_id()).orElseThrow();

        return new ToDo(toDoRequestDTO.getTitle(),toDoRequestDTO.getTodo(),appUser);
    }

    public ToDoResponseDTO entityToDoResponseDTO(ToDo toDo) {

        return new ToDoResponseDTO(toDo.getId(),toDo.getTitle(),toDo.getMessage(),toDo.getAppUser().getId());

    }

}
