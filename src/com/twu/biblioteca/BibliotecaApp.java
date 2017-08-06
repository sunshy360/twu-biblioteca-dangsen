package com.twu.biblioteca;

public class BibliotecaApp {
    private String[] bookList= {"Math","Chemical","Computer"};
    private String[] authorList= {"John","Mike","Lucy"};
    private String[] publishList= {"A","B","C"};

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
}
