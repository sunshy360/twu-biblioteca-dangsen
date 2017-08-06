package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {
    private static ArrayList<Book> bookList = new ArrayList<Book>();
    private static ArrayList<Movie> movieList = new ArrayList<Movie>();
    private static ArrayList<User> userList = new ArrayList<User>();

    public static void main(String[] args) {
        initBookInfo();
        initMovieInfo();
        initUserInfo();
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

    //初始化用户信息
    public static void initUserInfo() {
        userList.add(new User("123-4567","password","Jack","jack@gmail.com","1300000"));
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
            if(book.getName().equals(bookName) && book.getState()){
                book.setState(false);
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
            if(book.getName().equals(bookName) && !book.getState()){
                book.setState(true);
                return "Thank you for returning the book\n";
            }
            else if(bookList.indexOf(book)==bookList.size()-1)
                break;
        }
        return "That is not a valid book to return\n";
    }

    //获取书籍借阅状态
    public boolean getBookStatus(String bookName) {
        for(Book book:bookList){
            if(book.getName().equals(bookName)){
                return book.getState();
            }
        }
        return false;
    }

    //获取电影列表
    public static String getAllMoviesList() {
        String movieListStr = "";
        for(Movie movie:movieList){
            movieListStr += movie.getName() + "\n";
        }
        return movieListStr;
    }

    //获取电影详情
    public static String getMovieDetail(String movieName) {
        String movieDetailStr = "";
        for(Movie movie:movieList){
            if(movie.getName().equals(movieName)){
                movieDetailStr = movieName + "\n" +movie.getYear() + "\n" + movie.getDirector()+ "\n" + movie.getRating() + "\n" + movie.getState() + "\n";
                break;
            }
        }
        return movieDetailStr;
    }

    //借电影
    public static String checkoutMovie(String movieName) {
        for(Movie movie:movieList){
            if(movie.getName().equals(movieName) && movie.getState()){
                movie.setState(false);
                return "Thank you! Enjoy the movie\n";
            }
            else if(movieList.indexOf(movie)==movieList.size()-1)
                break;
        }
        return "That movie is not available\n";
    }

    //还电影
    public static String returnMovie(String movieName) {
        for(Movie movie:movieList){
            if(movie.getName().equals(movieName) && !movie.getState()){
                movie.setState(true);
                return "Thank you for returning the movie\n";
            }
            else if(movieList.indexOf(movie)==movieList.size()-1)
                break;
        }
        return "That is not a valid movie to return\n";
    }

    //获取电影借阅状态
    public boolean getMovieStatus(String movieName) {
        for(Movie movie:movieList){
            if(movie.getName().equals(movieName)){
                return movie.getState();
            }
        }
        return false;
    }

    //用户登录
    public static boolean userSignIn(String id, String password) {
        for(User user:userList){
            if(user.getId().equals(id) && user.getPassword().equals(password)){
                user.setLogState(true);
                return true;
            }
        }
        return false;
    }

    //用户登出
    public static boolean userSignOut(String id) {
        for(User user:userList){
            if(user.getId().equals(id)){
                user.setLogState(false);
                return true;
            }
        }
        return false;
    }

    //用户信息查询
    public static boolean userInfoQuery(String id, String password) {
        for(User user:userList){
            if(user.getId().equals(id) && user.getPassword().equals(password) && user.getLogState()){
                System.out.println(user.toString());
                return true;
            }
        }
        System.out.println("invalid");
        return false;
    }

    //欢迎页面
    public static void welcomePage() {
        System.out.println("Welcome to Biblioteca!");
        while(true){
            System.out.println("select a service please:\n1:getAllBooksList\n2:getBookDetail\n3:checkoutBook\n4:returnBook\n" +
                    "5:getAllMoviesList\n6:getMovieDetail\n7:checkoutMovie\n8:returnMovie\n" +
                    "9:userSignIn\n10:userSignOut\n11:UserInfoQuery\n" +
                    "12:quit\n");
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
                case 5: {
                    System.out.println(getAllMoviesList());
                    break;
                }
                case 6: {
                    System.out.println("input movie name:\n");
                    sc = new Scanner(System.in);
                    String movieName = sc.nextLine();
                    System.out.println(getMovieDetail(movieName));
                    break;
                }
                case 7: {
                    System.out.println("input movie name:\n");
                    sc = new Scanner(System.in);
                    String movieName = sc.nextLine();
                    System.out.println(checkoutMovie(movieName));
                    break;
                }
                case 8: {
                    System.out.println("input movie name:\n");
                    sc = new Scanner(System.in);
                    String movieName = sc.nextLine();
                    System.out.println(returnMovie(movieName));
                    break;
                }
                case 9: {
                    System.out.println("input user_id and password(enter for seperate):\n");
                    sc = new Scanner(System.in);
                    String user_id = sc.nextLine();
                    String password = sc.nextLine();
                    System.out.println(userSignIn(user_id,password));
                    break;
                }
                case 10: {
                    System.out.println("input user_id:\n");
                    sc = new Scanner(System.in);
                    String user_id = sc.nextLine();
                    System.out.println(userSignOut(user_id));
                    break;
                }
                case 11: {
                    System.out.println("input user_id and password(enter for seperate):\n");
                    sc = new Scanner(System.in);
                    String user_id = sc.nextLine();
                    String password = sc.nextLine();
                    userInfoQuery(user_id,password);
                    break;
                }
                case 12: System.exit(1);
                default: break;
            }
        }
    }
}
