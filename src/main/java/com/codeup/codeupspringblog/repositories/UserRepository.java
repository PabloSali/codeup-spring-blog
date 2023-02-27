package com.codeup.codeupspringblog.repositories;

import com.codeup.codeupspringblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
