package com.practice.algorithms.array;

/**
 * Created by manjari on 2/27/18.
 */
public class CyclicRotateByOne {

    public int[] rotate(int arr[]){
        int len = arr.length - 1;
        int temp = arr[len];
        for (int i = 0; i < arr.length - 1; i++){
            arr[len - i] = arr[len - i - 1];
        }
        arr[0] = temp;
        return arr;
    }
}
