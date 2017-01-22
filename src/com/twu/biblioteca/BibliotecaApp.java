package com.twu.biblioteca;

import java.util.ArrayList;

public class BibliotecaApp {

    public static ArrayList<Book> bookList = new ArrayList<>();

    static {
        fillLibrary();
    }

    public static void main(String[] args) {
        welcome();
        mainMenu();
    }

    protected static void welcome() {
        System.out.println(" +=========================+\n || Welcome to Biblioteca ||\n +=========================+");
    }

    protected static void displayAvailableBooks() {
        System.out.println("Title  ||  Author  ||  Year Published\n");
        for (int i = 0; i <= 3; i++) {
            System.out.println(bookList.get(i).displayBookDetails());
        };
    }

    protected static void mainMenu() {
        System.out.println("What would you like to do?\n" +
                "These are the following options:\n" +
                "1: See the list of available books\n" +
                "2: Quit");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int option = scanner.nextInt();
        switch(option) {
            case 1:
                displayAvailableBooks();
            case 2:
                break;

            default:
                System.out.println("Invalid option!");
                mainMenu();
        }
        System.out.println("Goodbye!");
    }

    protected static void fillLibrary() {
        bookList.add(new Book("Treasure Island", "Robert Louis Stevenson", 1910,false));
        bookList.add(new Book("Fight Club", "Chuck Palahnuik", 1996,false));
        bookList.add(new Book("Treasure Island", "Robert Louis Stevenson", 1910,false));
    }
}
