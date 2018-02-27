package com.practice.algorithms.string;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by manjari on 2/26/18.
 */
public class StringCombinationsTest {
    private static final StringCombinations COMBINATIONS = new StringCombinations();

    @Test
    public void oneChars(){
        assertTrue(COMBINATIONS.combinations("G").containsAll(Arrays.asList("G")));
    }

    @Test
    public void twoChars(){
        assertTrue(COMBINATIONS.combinations("GA").containsAll(Arrays.asList("GA", "AG")));
    }

    @Test
    public void threeChars(){
        assertTrue(COMBINATIONS.combinations("ABC").containsAll(Arrays.asList("ABC", "ACB", "BAC", "BCA", "CBA", "CAB")));
    }
}
