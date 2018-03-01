package com.practice.algorithms.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by manjari on 2/28/18.
 */
public class RemoveDuplicatesTest {

    private static final RemoveDuplicates TEST = new RemoveDuplicates();

    @Test
    public void test1(){
        assertEquals(2, TEST.remove(new int[]{1, 1, 2}));
    }

    @Test
    public void test2(){
        assertEquals(3, TEST.remove(new int[]{1, 1, 2, 3, 3}));
    }

    @Test
    public void test3(){
        assertEquals(0, TEST.remove(new int[]{}));
    }
}
