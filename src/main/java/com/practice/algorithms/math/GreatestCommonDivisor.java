package com.practice.algorithms.math;

/**
 * Greatest common divisor using Euclid's algorithm <a href="https://en.wikipedia.org/wiki/Greatest_common_divisor#Using_Euclid's_algorithm">Euclid's Algorithm</a>.
 *
 * @author gaurav_karnatak Created: 2/22/18
 */
final class GreatestCommonDivisor {

    public int gcd(final int a, final int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
