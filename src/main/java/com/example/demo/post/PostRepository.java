package com.example.demo.post;

import java.util.*;

public class PostRepository {
    List<Post> posts;

    PostRepository() {
        this.posts = new ArrayList<>();
        this.posts.add(new Post(1, "title1", "body1 - hello java1", "Summer1"));
        this.posts.add(new Post(2, "title2", "body2 - hello java2", "Max2"));
        this.posts.add(new Post(3, "title3", "body3 - hello java3", "Paul3"));
        this.posts.add(new Post(4, "title4", "body4 - hello java4", "Isa4"));
    }

    List<Post> findAll() {
        return this.posts;
    }
}
