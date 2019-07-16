package com.wildcodeschool.book.repository;

import com.wildcodeschool.book.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
