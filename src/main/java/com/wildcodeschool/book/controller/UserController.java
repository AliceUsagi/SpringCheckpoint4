package com.wildcodeschool.book.controller;

import com.wildcodeschool.book.entity.Book;
import com.wildcodeschool.book.entity.User;
import com.wildcodeschool.book.repository.BookRepository;
import com.wildcodeschool.book.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/user")
    public User createAccount(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/user/{email}/{password}")
    public User signIn (@PathVariable String email, @PathVariable String password) {
        return userRepository.findUserByEmailIgnoreCaseAndPassword(email, password);
    }

    @GetMapping("/user/{idUser}")
    public User readIdUser (@PathVariable Long idUser) {
        return userRepository.findById(idUser).get();
    }
}
