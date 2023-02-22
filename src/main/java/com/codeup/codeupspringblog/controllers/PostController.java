package com.codeup.codeupspringblog.controllers;

import com.codeup.codeupspringblog.repositories.PostRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class PostController {

    private PostRepository postDao;

    public PostRepository getPostDao() { return postDao; }

    public void setPostDao(PostRepository postDao) { this.postDao = postDao; }

    @GetMapping("posts/index")
    @ResponseBody
    public String viewAllPosts(){
        return "<h1> All Posts </h1>";
    }

    @GetMapping("posts/show")
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
