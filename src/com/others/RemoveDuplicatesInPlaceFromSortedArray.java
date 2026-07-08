package com.others;

import java.util.Arrays;

public class RemoveDuplicatesInPlaceFromSortedArray {
    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,2,2,3,3,4});
        removeDuplicates(new int[]{1,2,3,3,4,5});
        removeDuplicates(new int[]{1,2,3,4,5});
    }

    private static void removeDuplicates(int[] arr) {
        int len = arr.length, curr=0;
        for(int i=1; i<len; i++){
            if(arr[i] != arr[curr]) {
                arr[curr+1] = arr[i];
                curr++;
            }
        }
        curr++;
        while(curr<len){
            arr[curr] = -1;
            curr++;
        }

        System.out.println(Arrays.toString(arr));
    }
}