package com.workshop.workshopspringbootmongodb.dto;

import com.workshop.workshopspringbootmongodb.domain.user.User;

import jakarta.validation.constraints.NotBlank;

public record AuthorDTO(String id, @NotBlank String name) {
    public AuthorDTO(User user) {
        this(user.getId(), user.getName());
    }
}
