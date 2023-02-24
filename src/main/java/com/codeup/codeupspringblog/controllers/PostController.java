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

    public PostController(){}

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
//------------- Create ------------------------
    @GetMapping("/post/create")
    @ResponseBody
    public String createPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/post/create")
    @ResponseBody
    public String createPost(@ModelAttribute Post post) {
        User user = userDao.getReferenceById(1L);
        post.setUser(user);
        postDao.save(post);
        return "redirect:/posts";
    }
//-------------- Edit --------------------------
    @GetMapping("/post/{id}/edit")
    @ResponseBody
    public String editPost(@ModelAttribute Post post) {
        User user = userDao.getReferenceById(1L);
        post.setUser(user);
        postDao.save(post);
        return "redirect:/posts";
    }

    @PostMapping("/post/edit")
    @ResponseBody
    public String editPost(@ModelAttribute Post post) {
        User user = userDao.getReferenceById(1L);
        post.setUser(user);
        postDao.save(post);
        return "redirect:/posts";
    }

}
