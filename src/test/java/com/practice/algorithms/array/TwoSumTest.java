package com.practice.algorithms.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by manjari on 2/28/18.
 */
public class TwoSumTest {

    private static final TwoSum TWO_SUM = new TwoSum();

    @Test
    public void positive1(){
        assertArrayEquals(new int[]{0, 1}, TWO_SUM.find(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void positive2(){
        assertArrayEquals(new int[]{1, 2}, TWO_SUM.find(new int[]{2, 7, 11, 15}, 18));
    }

    @Test
    public void positive3(){
        assertArrayEquals(new int[]{2, 3}, TWO_SUM.find(new int[]{2, 7, 11, 15}, 26));
    }

    @Test
    public void positive4(){
        assertArrayEquals(null, TWO_SUM.find(new int[]{2, 7, 11, 15}, 1));
    }

    @Test
    public void positive5(){
        assertArrayEquals(null, TWO_SUM.find(new int[]{2, 7, 11, 15}, 0));
    }

    @Test
    public void positive6(){
        assertArrayEquals(null, TWO_SUM.find(null, 3));
    }

}
