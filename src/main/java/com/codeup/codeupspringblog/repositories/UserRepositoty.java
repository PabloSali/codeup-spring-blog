package com.codeup.codeupspringblog.repositories;

import com.codeup.codeupspringblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.JavaBean;

public interface UserRepositoty extends JpaRepository<User, Long> {

}
