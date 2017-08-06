package com.twu.biblioteca;

import java.util.ArrayList;

/**
 * Created by sunshy on 17-8-7.
 */
public class User {
    private String id;
    private String password;
    private boolean logState = false;
    private String name;
    private String email;
    private String phoneNumber;
    private ArrayList<String> bookList = new ArrayList<String>();
    private ArrayList<String> movieList = new ArrayList<String>();

    public User(String id, String password, String name, String email, String phoneNumber) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public boolean getLogState() {
        return logState;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<String> getBookList() {
        return bookList;
    }

    public ArrayList<String> getMovieList() {
        return movieList;
    }

    public void setLogState(boolean logState) {
        this.logState = logState;
    }

    public void setBookList(ArrayList<String> bookList) {
        this.bookList = bookList;
    }

    public void setMovieList(ArrayList<String> movieList) {
        this.movieList = movieList;
    }

    @Override
    public String toString() {
        return this.name + "\n" + this.email + "\n" + this.phoneNumber + "\n" + this.bookList + "\n" + this.movieList + "\n";
    }
}
