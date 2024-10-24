package com.example.webapp.user.service;

import com.example.webapp.user.domain.User;
import com.example.webapp.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
    }

    public User createUser(User user) {
    }
}
