package com.twu.biblioteca;


import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testBookIsAnObject() { assertTrue(new Book("bookie", "Daniel", 1989) != null); }

    @Test
    public void testBookHasTitle() {
        Book bookie = new Book("bookie", "Daniel", 1989);
        assertEquals(bookie.getFull_title(), "bookie");
    }

    @Test
    public void testBookHasAuthor() {
        Book bookie = new Book("bookie", "Daniel", 1989);
        assertEquals(bookie.getAuthorName(), "Daniel");
    }

    @Test
    public void testBookHasYearPublished() {
        Book bookie = new Book("bookie", "Daniel", 1989);
                assertEquals(bookie.getYearPublished(), 1989);
    }
}
