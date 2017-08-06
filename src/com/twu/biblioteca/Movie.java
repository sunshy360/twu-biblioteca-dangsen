package com.twu.biblioteca;

/**
 * Created by sunshy on 17-8-6.
 */
public class Movie {
    private String name;
    private int year;
    private String director;
    private int rating;
    private boolean status;

    public Movie(String name, int year, String director, int rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.status = true;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getDirector() {
        return director;
    }

    public int getRating() {
        return rating;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
