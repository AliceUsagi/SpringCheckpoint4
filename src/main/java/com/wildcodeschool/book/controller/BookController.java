package com.wildcodeschool.book.controller;

import com.wildcodeschool.book.entity.Book;
import com.wildcodeschool.book.entity.User;
import com.wildcodeschool.book.repository.BookRepository;
import com.wildcodeschool.book.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/book")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @PostMapping("/user/{userId}/book")
    public Book createRecipe(@PathVariable Long userId,
                               @RequestBody Book book) {
        User user = userRepository.findById(userId).get();
        book.setUser(user);
        return bookRepository.save(book);
    }
}
