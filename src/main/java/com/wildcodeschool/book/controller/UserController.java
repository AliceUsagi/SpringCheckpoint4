package com.wildcodeschool.book.controller;

import com.wildcodeschool.book.entity.User;
import com.wildcodeschool.book.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public List<User> read() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{userId}")
    public User read(@PathVariable Long userId) {
        return userRepository.findById(userId).get();
    }

    @PostMapping("/user")
    public User create(@RequestBody User user) {
        return userRepository.save(user);
    }

}
