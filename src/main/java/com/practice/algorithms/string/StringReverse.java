package com.practice.algorithms.string;

/**
 * Created by manjari on 2/26/18.
 */
public class StringReverse {
    public String reverse(final String str){
        char[] chars = str.toCharArray();
        int len = str.length() - 1;

        for (int i = 0; i < str.length() / 2; i++){
            char tmp = chars[i];
            chars[i] = chars[len - i];
            chars[len - i] = tmp;
        }

        return new String(chars);
    }
}
