package com.example.webapp.user.controller;

import com.example.webapp.user.domain.User;
import com.example.webapp.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping
    ResponseEntity<List<User>> getUsers(){
        List<User> users = userService.getAllUsers();

        return ResponseEntity.ok(users);
    }

    @PostMapping
    ResponseEntity<User> createUser(@RequestBody User user){
        User createdUser = userService.createUser(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
    }

}
