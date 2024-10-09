package com.example.webapp.user.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    Long id;
    String name;
    String email;

}
