package com.practice.algorithms.string;

import java.util.HashSet;
import java.util.Set;

/**
 * String possible combinations using backtracking.
 *
 * @author gaurav_karnatak Created: 2/24/18
 */
final class StringCombinations {

    public Set<String> combinations(final String str){
        return combinations(str, 0, str.length() -1);
    }
    private Set<String> combinations(final String str, int l, int r) {
        Set<String> combinations = new HashSet<>();
        if (l == r) {
            combinations.add(str);
        }
        else {
            for (int i = l; i <= r; i++) {
                String s = swap(str, i, l);
                combinations.addAll(combinations(s, l + 1, r));
            }
        }
        return combinations;
    }

    private static String swap(final String str, final int i, final int j) {
        char[] chars = str.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return new String(chars);
    }
}
