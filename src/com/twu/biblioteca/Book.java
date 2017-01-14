package com.twu.biblioteca;

public class Book {

    String full_title;
    String author_name;
    int year_published;

    public Book(String title, String author, int year) {

         full_title = title;
         author_name = author;
         year_published = year;
    }

    public String getFull_title() {

        return full_title;
    }

    public String getAuthorName() {

        return author_name;
    }

    public int getYearPublished() {
        return year_published;
    }
}
