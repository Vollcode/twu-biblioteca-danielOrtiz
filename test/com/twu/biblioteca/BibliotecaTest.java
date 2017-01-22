package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static com.twu.biblioteca.BibliotecaApp.bookList;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


    @Test
    public void testWelcomeBiblioteca() {
        BibliotecaApp.welcome();
        assertEquals(" +=========================+\n || Welcome to Biblioteca ||\n +=========================+\n", outContent.toString());
    }

    @Test
    public void testLibraryHasBooks() {
        assertEquals(bookList.size(), 3 );
    }

}
