package com.example.practice.model;

public class News {
    private String imageUrl;
    private String content;
    private String title;
    private String author;

    public News() {
    }

    public News(String imageUrl, String content, String title, String author) {
        this.imageUrl = imageUrl;
        this.content = content;
        this.title = title;
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
