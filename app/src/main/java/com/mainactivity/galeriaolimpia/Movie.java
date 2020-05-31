package com.mainactivity.galeriaolimpia;

public class Movie {

    private int cover;
    private String title;
    private int year;

    public Movie(int cover, String title, int year) {
        this.cover = cover;
        this.title = title;
        this.year = year;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
