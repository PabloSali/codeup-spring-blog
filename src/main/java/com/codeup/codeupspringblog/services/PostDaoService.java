package com.codeup.codeupspringblog.services;

import com.codeup.codeupspringblog.repositories.PostRepository;
import com.codeup.codeupspringblog.repositories.UserRepositoty;
import org.springframework.stereotype.Service;

@Service
public class PostDaoService {

    private final PostRepository postRepository;
    private final UserRepositoty userRepository;

    public PostDaoService(PostRepository postRepository, UserRepositoty userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    // Create
    public void savePost(){
        post.setUser(userDao.findbyID(1L).get());
        postRepository.save(post);
    }
    // Read

    // Update

    // Delete
}
