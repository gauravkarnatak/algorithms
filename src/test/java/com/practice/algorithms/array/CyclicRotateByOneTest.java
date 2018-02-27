package com.practice.algorithms.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by manjari on 2/27/18.
 */
public class CyclicRotateByOneTest {

    private static final CyclicRotateByOne TEST = new CyclicRotateByOne();

    @Test
    public void rotate1(){
        assertArrayEquals(new int[]{3, 1, 2}, TEST.rotate(new int[]{1, 2, 3}));
    }

    @Test
    public void rotate2(){
        assertArrayEquals(new int[]{1}, TEST.rotate(new int[]{1}));
    }
}
