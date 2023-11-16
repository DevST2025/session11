package com.example.practice.model;

public class Dictionary {
    private int id;
    private String imgUrl;
    private String vocabulary;
    private String desc;

    public Dictionary() {
    }

    public Dictionary(String imgUrl, String vocabulary, String desc) {
        this.imgUrl = imgUrl;
        this.vocabulary = vocabulary;
        this.desc = desc;
    }

    public Dictionary(int id, String imgUrl, String vocabulary, String desc) {
        this.id = id;
        this.imgUrl = imgUrl;
        this.vocabulary = vocabulary;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getVocabulary() {
        return vocabulary;
    }

    public void setVocabulary(String vocabulary) {
        this.vocabulary = vocabulary;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
