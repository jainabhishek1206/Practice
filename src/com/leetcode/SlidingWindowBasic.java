package com.leetcode;

/*The Goal is to find the maximum sum of k consecutive integers in an array*/

public class SlidingWindowBasic {
    public static void main(String[] args) {
        //take array as an input
        int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
        //take value of k as an input
        int k=4;
        int maxSum = findMaxSumOfKConsecutiveIntegers(arr,k);
        System.out.println("Maximum sum is"+maxSum);
    }

    private static int findMaxSumOfKConsecutiveIntegers(int arr[],int k) {
        int maxSum = 0;
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum = sum + arr[i];
        }
        maxSum = sum;
        for(int i=1;i< arr.length-k+1;i++) {
            sum = sum - arr[i-1] + arr[i+k-1];
            maxSum = sum > maxSum ? sum : maxSum;
        }
        return maxSum;
    }
}
