package com.twu.biblioteca;

/**
 * Created by sunshy on 17-8-6.
 */
public class Movie {
    private String name;
    private int year;
    private String director;
    private int rating;
    private boolean state;

    public Movie(String name, int year, String director, int rating) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.state = true;
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

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
