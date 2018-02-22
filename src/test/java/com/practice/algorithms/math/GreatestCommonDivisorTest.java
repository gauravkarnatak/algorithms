package com.practice.algorithms.math;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author gaurav_karnatak Created: 2/22/18
 */
public class GreatestCommonDivisorTest {

    private final GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();

    @Test
    public void gcd1() {
        assertEquals(4, greatestCommonDivisor.gcd(4, 8));
    }

    @Test
    public void gcd2() {
        assertEquals(4, greatestCommonDivisor.gcd(8, 4));
    }

    @Test
    public void gcd3() {
        assertEquals(6, greatestCommonDivisor.gcd(36, 6));
    }

    @Test
    public void gcd4() {
        assertEquals(6, greatestCommonDivisor.gcd(6, 36));
    }

    @Test
    public void gcd5() {
        assertEquals(6, greatestCommonDivisor.gcd(12, 30));
    }

    @Test
    public void gcd6() {
        assertEquals(6, greatestCommonDivisor.gcd(18, 30));
    }

    @Test
    public void gcd7() {
        assertEquals(18, greatestCommonDivisor.gcd(18, 36));
    }

    @Test
    public void gcd8() {
        assertEquals(1, greatestCommonDivisor.gcd(10, 7));
    }
}
