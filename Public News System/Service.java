package com.example.publicnews.service;

import com.example.publicnews.model.Model;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class to manage public news articles.
 */
public class Service {

    private List<Model> newsList;

    public Service() {
        this.newsList = new ArrayList<>();
    }

    /**
     * Adds a new news article.
     * @param news News model
     */
    public void addNews(Model news) {
        newsList.add(news);
    }

    /**
     * Returns all news articles.
     * @return List of news
     */
    public List<Model> getAllNews() {
        return newsList;
    }

    /**
     * Clears all news articles.
     */
    public void clearNews() {
        newsList.clear();
    }
}
