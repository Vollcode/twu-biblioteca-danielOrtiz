package com.twu.biblioteca;

public class Book {

    String full_title;
    String author_name;

    public Book(String title, String author) {

         full_title = title;
         author_name = author;
    }

    public String getFull_title() {

        return full_title;
    }

    public String getAuthorName() {

        return author_name;
    }
}
