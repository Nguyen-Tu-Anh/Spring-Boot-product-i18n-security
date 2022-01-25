package com.codegym.vn.model;

public class Language {
    private String home;
    private String language;
    private String vietnamese;
    private String english;
    private String name;
    private String price;
    private String img;
    private String category;
    private String action;
    public Language() {
    }

    public Language(String home, String language, String vietnamese, String english, String name, String price, String img, String category, String action) {
        this.home = home;
        this.language = language;
        this.vietnamese = vietnamese;
        this.english = english;
        this.name = name;
        this.price = price;
        this.img = img;
        this.category = category;
        this.action = action;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getVietnamese() {
        return vietnamese;
    }

    public void setVietnamese(String vietnamese) {
        this.vietnamese = vietnamese;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
