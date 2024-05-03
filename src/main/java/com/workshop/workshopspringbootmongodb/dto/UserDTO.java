package com.workshop.workshopspringbootmongodb.dto;

import com.workshop.workshopspringbootmongodb.domain.user.User;

import jakarta.validation.constraints.NotBlank;

public record UserDTO(String id, @NotBlank String name, @NotBlank String email) {
    public UserDTO(User user) {
        this(user.getId(), user.getName(), user.getEmail());
    }
}
