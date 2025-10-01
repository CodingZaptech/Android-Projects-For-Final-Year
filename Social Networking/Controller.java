package com.example.socialnetworking.controller;

import com.example.socialnetworking.model.Model;
import com.example.socialnetworking.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Social Networking App.
 */
public class Controller {

    private Service postService;

    public Controller() {
        this.postService = new Service();
    }

    /**
     * Adds a social post.
     * @param userName User name
     * @param content Post content
     */
    public void addPost(String userName, String content) {
        long timestamp = System.currentTimeMillis();
        Model post = new Model(userName, content, timestamp);
        postService.addPost(post);
        System.out.println("Post added by: " + userName);
    }

    /**
     * Retrieves all social posts.
     * @return List of posts
     */
    public List<Model> getPosts() {
        return postService.getAllPosts();
    }

    /**
     * Clears all social posts.
     */
    public void clearPosts() {
        postService.clearPosts();
        System.out.println("All posts cleared.");
    }
}
