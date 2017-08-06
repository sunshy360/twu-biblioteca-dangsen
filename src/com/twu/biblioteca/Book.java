package com.twu.biblioteca;

/**
 * Created by sunshy on 17-8-6.
 */
public class Book {
    private String name;
    private String author;
    private String publish;
    private boolean state;

    public Book(String name, String author, String publish) {
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.state = true;
    }

    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublish() {
        return publish;
    }

    @Override
    public String toString() {
        return this.name + "\n" + this.author + "\n" + this.publish + "\n" + this.state + "\n";
    }
}
