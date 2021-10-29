package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println("res is"+threeSum(new int[]{0,0,0,0}));
    }

    //logic of the code
    private static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);

        //writting the logic
        for(int i=0;i<nums.length-2;i++) {
            int leftPointer= i+1, rightPointer = nums.length-1;
            if(i>0 && nums[i] == nums[i-1]) continue;
            do {
                int sum = nums[i]+nums[leftPointer]+nums[rightPointer]; //-4, -1, -1, 0, 1, 2
                if(sum>0) rightPointer --;
                else if(sum<0) leftPointer ++;
                else {
                    List<Integer> arrayList = new ArrayList<>();
                    arrayList.add(nums[i]);
                    arrayList.add(nums[leftPointer]);
                    arrayList.add(nums[rightPointer]);
                    list.add(arrayList);

                    while(leftPointer<rightPointer && nums[leftPointer]==nums[leftPointer+1])  leftPointer++;
                    while(leftPointer<rightPointer && nums[rightPointer]==nums[rightPointer-1])  rightPointer--;

                    leftPointer++;
                    rightPointer= nums.length-1;
                }
            }while (leftPointer<rightPointer);
        }
        return  list;
    }
}