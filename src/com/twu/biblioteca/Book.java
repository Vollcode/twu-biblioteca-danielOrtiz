package com.twu.biblioteca;

public class Book {

    String fullTitle;
    String authorName;
    int yearPublished;
    Boolean checkedOut;

    protected Book(String title, String author, int year, Boolean check) {

         fullTitle = title;
         authorName = author;
         yearPublished = year;
         checkedOut = check;
    }

    protected String getFullTitle() {

        return fullTitle;
    }

    protected String getAuthorName() {

        return authorName;
    }

    protected int getYearPublished() {

        return yearPublished;
    }

    protected Boolean getIfCheckedOut() {
        return checkedOut;
    }

    protected String displayBookDetails() {
        return ( this.getFullTitle() + " || "+ this.getAuthorName() + " || "+ this.getYearPublished());
    }

    public void checkOut() {
        checkedOut = true;
    }
}
