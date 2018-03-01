package com.practice.algorithms.array;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 *
 * Created by manjari on 2/28/18.
 */
public class RemoveDuplicates {

    public int remove(int[] arr){
        int i = arr.length > 0 ? 1 : 0;

        for (int n : arr){
            if(n > arr[i - 1]){
                arr[i++] = n;
            }
        }
        return i;
    }
}
