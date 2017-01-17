package com.twu.biblioteca;


import org.junit.Test;

import org.junit.BeforeClass;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class BookTest {

    Book bookie = new Book("bookie", "Daniel", 1989, false);

    @Test
    public void testBookIsAnObject() { assertTrue(bookie != null); }

    @Test
    public void testBookHasTitle() {
        assertEquals(bookie.getFullTitle(), "bookie");
    }

    @Test
    public void testBookHasAuthor() {
        assertEquals(bookie.getAuthorName(), "Daniel");
    }

    @Test
    public void testBookHasYearPublished() {
        assertEquals(bookie.getYearPublished(), 1989);
    }

    @Test
    public void testBookCanBeCheckedOut() {
        assertEquals(bookie.getIfCheckedOut(), false);
    }
}
