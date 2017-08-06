package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {
    private static ArrayList<Book> bookList = new ArrayList<Book>();
    private static ArrayList<Movie> movieList = new ArrayList<Movie>();

    public static void main(String[] args) {
        initBookInfo();
        initMovieInfo();
        welcomePage();
    }

    //初始化全部书籍信息
    public static void initBookInfo() {
        bookList.add(new Book("Math","John","A"));
        bookList.add(new Book("Chemical","Mike","B"));
        bookList.add(new Book("Computer","Lucy","C"));
    }

    //初始化全部电影信息
    public static void initMovieInfo() {
        movieList.add(new Movie("Titanic",1998,"Cameron",9));
        movieList.add(new Movie("Inception",2010,"Nolan",9));
    }

    //获取全部书籍列表
    public static String getAllBooksList() {
        String bookListStr = "";
        for(Book book:bookList){
            bookListStr += book.getName() + "\n";
        }
        return bookListStr;
    }

    //获取书籍详情
    public static String getBookDetail(String bookName) {
        String bookDetailStr = "";
        for(Book book:bookList){
            if(book.getName().equals(bookName)){
                bookDetailStr = bookName + "\n" +book.getAuthor() + "\n" + book.getPublish() + "\n";
                break;
            }
        }
        return bookDetailStr;
    }

    //借书
    public static String checkoutBook(String bookName) {
        for(Book book:bookList){
            if(book.getName().equals(bookName) && book.getStatus()){
                book.setStatus(false);
                return "Thank you! Enjoy the book\n";
            }
            else if(bookList.indexOf(book)==bookList.size()-1)
                break;
        }
        return "That book is not available\n";
    }

    //还书
    public static String returnBook(String bookName) {
        for(Book book:bookList){
            if(book.getName().equals(bookName) && !book.getStatus()){
                book.setStatus(true);
                return "Thank you for returning the book\n";
            }
            else if(!book.getName().equals(bookName) && bookList.indexOf(book)==bookList.size()-1)
                break;
        }
        return "That is not a valid book to return\n";
    }

    //获取书籍借阅状态
    public boolean getBookStatus(String bookName) {
        for(Book book:bookList){
            if(book.getName().equals(bookName)){
                return book.getStatus();
            }
        }
        return false;
    }

    //欢迎页面
    public static void welcomePage() {
        System.out.println("Welcome to Biblioteca!");
        while(true){
            System.out.println("select a service please:\n1:getAllBooksList\n2:getBookDetail\n3:checkoutBook\n4:returnBook\n5:quit\n");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            //选择服务类型
            switch(number) {
                case 1: {
                    System.out.println(getAllBooksList());
                    break;
                }
                case 2: {
                    System.out.println("input book name:\n");
                    sc = new Scanner(System.in);
                    String bookname = sc.nextLine();
                    System.out.println(getBookDetail(bookname));
                    break;
                }
                case 3: {
                    System.out.println("input book name:\n");
                    sc = new Scanner(System.in);
                    String bookname = sc.nextLine();
                    System.out.println(checkoutBook(bookname));
                    break;
                }
                case 4: {
                    System.out.println("input book name:\n");
                    sc = new Scanner(System.in);
                    String bookname = sc.nextLine();
                    System.out.println(returnBook(bookname));
                    break;
                }
                case 5: System.exit(1);
                default: break;
            }
        }
    }

    public String getAllMoviesList() {
        String movieListStr = "";
        for(Movie movie:movieList){
            movieListStr += movie.getName() + "\n";
        }
        return movieListStr;
    }

    public String getMovieDetail(String movieName) {
        String movieDetailStr = "";
        for(Movie movie:movieList){
            if(movie.getName().equals(movieName)){
                movieDetailStr = movieName + "\n" +movie.getYear() + "\n" + movie.getDirector()+ "\n" + movie.getRating() + "\n" + movie.getStatus() + "\n";
                break;
            }
        }
        return movieDetailStr;
    }
}
