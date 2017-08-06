package com.twu.biblioteca;

/**
 * Created by sunshy on 17-8-6.
 */
public class Book {
    private String name;
    private String author;
    private String publish;
    private boolean status;

    public Book(String name, String author, String publish) {
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.status = true;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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
        return this.getName() + "\n" + this.getAuthor() + "\n" + this.getPublish() + "\n" + this.getStatus() + "\n";
    }
}
