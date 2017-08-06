package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {
    private static String[] bookList= {"Math","Chemical","Computer"};
    private static String[] authorList= {"John","Mike","Lucy"};
    private static String[] publishList= {"A","B","C"};
    private static boolean[] statusList= {true,true,true};

    public static void main(String[] args) {
        welcomePage();
    }


    public static String getAllBooksList() {
        String bookListStr = "";
        for(String book:bookList){
            bookListStr += book + "\n";
        }
        return bookListStr;
    }

    public static String getBookDetail(String bookName) {
        String bookDetailStr = "";
        for(int i=0;i<bookList.length;i++){
            if(bookList[i].equals(bookName)){
                bookDetailStr = bookName + "\n" +authorList[i] + "\n" + publishList[i] + "\n";
                break;
            }
        }
        return bookDetailStr;
    }

    public static String checkoutBook(String bookName) {
        for(int i=0;i<bookList.length;i++) {
            if (bookList[i].equals(bookName) && statusList[i]) {
                statusList[i] = false;
                return "Thank you! Enjoy the book\n";
            }
            else if(!bookList[i].equals(bookName) && i==bookList.length-1)
                break;
        }
        return "That book is not available\n";
    }

    public static String returnBook(String bookName) {
        for(int i=0;i<bookList.length;i++) {
            if (bookList[i].equals(bookName) && !statusList[i]) {
                statusList[i] = true;
                return "Thank you for returning the book\n";
            }
            else if(!bookList[i].equals(bookName) && i==bookList.length-1)
                break;
        }
        return "That is not a valid book to return\n";
    }


    public boolean getBookStatus(String bookName) {
        for(int i=0;i<bookList.length;i++){
            if(bookList[i].equals(bookName)){
                return statusList[i];
            }
        }
        return false;
    }

    public static void welcomePage() {
        System.out.println("Welcome to Biblioteca!");
        while(true){
            System.out.println("select a service please:\n1:getAllBooksList\n2:getBookDetail\n3:checkoutBook\n4:returnBook\n5:quit\n");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
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
}
