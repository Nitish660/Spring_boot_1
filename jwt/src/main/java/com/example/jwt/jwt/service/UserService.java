package com.example.jwt.jwt.service;

import com.example.jwt.jwt.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private final List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Nitish", "sahnitish@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Manish", "sahnitish66@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Rohit", "sahnitish33@gmail.com"));
    }

    public List<User> getUsers() {
        return this.store;
    }
}
