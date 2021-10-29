package com.leetcode;

/*Given an array of N integers, and an integer K, find the number of pairs of elements in the array whose sum is equal to K.
        Example 1:

        Input:
        N = 4, K = 6
        arr[] = {1, 5, 7, 1}
        Output: 2
        Explanation:
        arr[0] + arr[1] = 1 + 5 = 6
        and arr[1] + arr[3] = 5 + 1 = 6.*/

public class CountPairWithGivenSum {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 1, 1, 1};
        int k=2;

        System.out.println("pair value is "+countPairWithGivenSum(arr,k));
    }

    private static int countPairWithGivenSum(int arr[],int k) {
        int pair=0;
        for(int i=0;i< arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i]+arr[j]==k) {
                    pair ++;
                }
            }
        }
        return pair;
    }
}