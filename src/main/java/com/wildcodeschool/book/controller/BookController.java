package com.wildcodeschool.book.controller;

import com.wildcodeschool.book.entity.Book;
import com.wildcodeschool.book.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/book")
    public Book createBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/book")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}
