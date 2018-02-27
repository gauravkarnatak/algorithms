package com.practice.algorithms.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by manjari on 2/26/18.
 */
public class StringReverseTest {
    private static final StringReverse REVERSE = new StringReverse();

    @Test
    public void oneChars(){
        assertEquals("G", REVERSE.reverse("G"));
    }

    @Test
    public void twoChars(){
        assertEquals("AG", REVERSE.reverse("GA"));
    }

    @Test
    public void threeChars(){
        assertEquals("UAG", REVERSE.reverse("GAU"));
    }

    @Test
    public void fourChars(){
        assertEquals("RUAG", REVERSE.reverse("GAUR"));
    }

    @Test
    public void fiveChars(){
        assertEquals("ARUAG", REVERSE.reverse("GAURA"));
    }
}
