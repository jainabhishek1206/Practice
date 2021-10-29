package com.leetcode;

import java.util.Arrays;

public class RotateAnArrayByOne {
    public static void main(String[] args) {
        //take array as input
        int arr[] = new int[]{12,34,354,34,21,456,54};  // 6,1,2,4,5
        //call a function to rotate an array
        rotoateAnArrayByOne(arr);
    }
    private static void rotoateAnArrayByOne(int arr[]) {
        int lastElement =  arr[arr.length-1];
        int firstElement = arr[0];
        for(int i=arr.length-1;i>0;i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = lastElement;
        System.out.print(Arrays.toString(arr));
    }
}