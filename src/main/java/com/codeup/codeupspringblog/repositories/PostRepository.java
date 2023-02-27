package com.codeup.codeupspringblog.repositories;

import com.codeup.codeupspringblog.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository <Post, Long>{}
