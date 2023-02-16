package com.codeup.codeupspringblog;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class PostController {
    @GetMapping("/post")
    @ResponseBody
    public String viewAllPosts(){
        return "<h1> All Posts </h1>";
    }

    @GetMapping("/post/{id}")
    @ResponseBody
    public String viewIndPosts(){
        return "<h1> Individual Posts </h1>";
    }

    @GetMapping("/post/create")
    @ResponseBody
    public String getCreatePost(){
        return "<h1> Create Post Get </h1>";
    }

    @PostMapping("/post/create")
    @ResponseBody
    public String postCreatePost(){
        return "<h1> Create Post Post </h1>";
    }
}
