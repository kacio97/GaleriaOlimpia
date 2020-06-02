package com.mainactivity.galeriaolimpia;

import java.util.ArrayList;

public class Movie {

    private int cover;
    private String title;
    private String year;
    private String category;
    private String description;
    private ArrayList<String> playDay;

    public Movie(int cover, String title, String year, String category, String description, ArrayList<String> playDay) {
        this.cover = cover;
        this.title = title;
        this.year = year;
        this.category = category;
        this.description = description;
        this.playDay = playDay;
    }

    public ArrayList<String> getPlayDay() {
        return playDay;
    }

    public void setPlayDay(ArrayList<String> playDay) {
        this.playDay = playDay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
