package com.practice.algorithms.array;

import java.util.HashMap;
import java.util.Map;

/**
 * From https://leetcode.com/problems/two-sum/description/
 * 
 * Created by manjari on 2/28/18.
 */
public class TwoSum {
    public int[] find(final int[] arr, int sum){
        if(arr == null || sum == 0){
            return null;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            if (map.containsKey(sum - arr[i])){
                return new int[]{map.get(sum - arr[i]), i};
            }else{
                map.put(arr[i], i);
            }
        }

        return null;
    }
}
