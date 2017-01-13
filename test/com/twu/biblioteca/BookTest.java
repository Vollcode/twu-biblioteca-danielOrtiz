package com.twu.biblioteca;


import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testbookisanobject() { assertTrue(new Book("bookie", "Daniel") != null); }

    @Test
    public void testbookhasatitle() {
        Book bookie = new Book("bookie", "Daniel");
        assertEquals(bookie.getFull_title(), "bookie");
    }

    @Test
    public void testbookhasauthor() {
        Book bookie = new Book("bookie", "Daniel");
        assertEquals(bookie.getAuthorName(), "Daniel");
    }
}
