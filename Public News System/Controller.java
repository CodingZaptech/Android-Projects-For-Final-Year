package com.example.publicnews.controller;

import com.example.publicnews.model.Model;
import com.example.publicnews.service.Service;
import java.util.List;

/**
 * Controller class to handle interactions for Public News App.
 */
public class Controller {

    private Service newsService;

    public Controller() {
        this.newsService = new Service();
    }

    /**
     * Adds a news article.
     * @param title News title
     * @param content News content
     * @param author Author name
     * @param date Publication date
     */
    public void addNews(String title, String content, String author, String date) {
        Model news = new Model(title, content, author, date);
        newsService.addNews(news);
        System.out.println("News added: " + title);
    }

    /**
     * Retrieves all news articles.
     * @return List of news
     */
    public List<Model> getNews() {
        return newsService.getAllNews();
    }

    /**
     * Clears all news articles.
     */
    public void clearNews() {
        newsService.clearNews();
        System.out.println("All news cleared.");
    }
}
