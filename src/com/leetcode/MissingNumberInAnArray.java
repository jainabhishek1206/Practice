package com.leetcode;

public class MissingNumberInAnArray {
    public static void main(String[] args) {
        //take input
        int arr[] = new int[]{2,3,4,1,6,7};
        System.out.println("Missing number is "+MissingNumber(arr,arr.length));
    }
    private static  int MissingNumber(int array[], int n) {
        int missingNumber  = 0;
        if(array.length == 1)
            if(array[0]==1)
                return 2;
            else
                return 1;
        for(int i=1;i< array.length;i++) {
            if(array[i] != array[i-1]+1)
                return array[i-1]+1;
        }
        return  0;
    }
}
