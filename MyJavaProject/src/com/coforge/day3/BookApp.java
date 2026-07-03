package com.coforge.day3;

public class BookApp {


    int bookId;
    String title;
    String author;
    double price;


    void setDetails(int id, String t, String a, double p) {
        bookId = id;
        title = t;
        author = a;
        price = p;
    }


    void displayDetails() {
        System.out.println("Book ID    : " + bookId);
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Price      : " + price);
    }


    public static void main(String[] args) {

        BookApp b1 = new BookApp();

        b1.setDetails(101, "Java Programming", "James Gosling", 599.50);

        b1.displayDetails();
    }
}