package com.example.socialnetworking.service;

import com.example.socialnetworking.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage social posts.
 */
public class Service {

    private List<Model> posts;

    public Service() {
        this.posts = new ArrayList<>();
    }

    /**
     * Adds a new post.
     * @param post Post model
     */
    public void addPost(Model post) {
        posts.add(post);
    }

    /**
     * Returns all posts.
     * @return List of posts
     */
    public List<Model> getAllPosts() {
        return posts;
    }

    /**
     * Clears all posts.
     */
    public void clearPosts() {
        posts.clear();
    }
}
