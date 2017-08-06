package com.twu.biblioteca;

public class BibliotecaApp {
    private static String[] bookList= {"Math","Chemical","Computer"};
    private static String[] authorList= {"John","Mike","Lucy"};
    private static String[] publishList= {"A","B","C"};
    private static boolean[] statusList= {true,true,true};

    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }


    public String getAllBooksList() {
        String bookListStr = "";
        for(String book:bookList){
            bookListStr += book + "\n";
        }
        return bookListStr;
    }

    public String getBookDetail(String bookName) {
        String bookDetailStr = "";
        for(int i=0;i<bookList.length;i++){
            if(bookList[i].equals(bookName)){
                bookDetailStr = bookName + "\n" +authorList[i] + "\n" + publishList[i] + "\n";
                break;
            }
        }
        return bookDetailStr;
    }

    public String checkoutBook(String bookName) {
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

    public String returnBook(String bookName) {
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

}
