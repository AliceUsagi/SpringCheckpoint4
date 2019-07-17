package com.wildcodeschool.book.repository;

import com.wildcodeschool.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
