package com.twu.biblioteca;

public class Book {

    String fullTitle;
    String authorName;
    int yearPublished;
    Boolean checkedOut;

    public Book(String title, String author, int year, Boolean check) {

         fullTitle = title;
         authorName = author;
         yearPublished = year;
         checkedOut = check;
    }

    public String getFullTitle() {

        return fullTitle;
    }

    public String getAuthorName() {

        return authorName;
    }

    public int getYearPublished() {

        return yearPublished;
    }

    public Boolean getIfCheckedOut() {
        return checkedOut;
    }
}
