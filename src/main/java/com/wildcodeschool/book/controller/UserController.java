package com.wildcodeschool.book.controller;

import com.wildcodeschool.book.entity.User;
import com.wildcodeschool.book.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public User createAccount(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/user/{idUser}")
    public User readUser(@PathVariable Long idUser) {
        return userRepository.findById(idUser).get();
    }

}
