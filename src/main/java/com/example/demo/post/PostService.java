package com.example.demo.post;

import java.util.*;

public class PostService {
    private PostRepository postRepository;

    PostService() {
        this.postRepository = new PostRepository();
    }

    List<Post> findAll() {
        return this.postRepository.findAll();
    }
}
