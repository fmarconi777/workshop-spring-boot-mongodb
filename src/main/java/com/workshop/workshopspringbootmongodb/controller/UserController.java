package com.workshop.workshopspringbootmongodb.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.workshopspringbootmongodb.domain.user.User;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User maria = new User();
        User alex = new User();
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, alex));
        return ResponseEntity.ok(list);
    }
}
