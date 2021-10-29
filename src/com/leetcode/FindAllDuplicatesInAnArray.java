package com.leetcode;

/*Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.
        You must write an algorithm that runs in O(n) time and uses only constant extra space.

        Example 1:
        Input: nums = [4,3,2,7,8,2,3,1]
        Output: [2,3]

        Example 2:
        Input: nums = [1,1,2]
        Output: [1]

        Example 3:
        Input: nums = [1]
        Output: []

        Constraints:

        n == nums.length
        1 <= n <= 105
        1 <= nums[i] <= n
        Each element in nums appears once or twice.*/

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

/*Pro tip : Read the constrains very carefully, it will lead to an easy solution like mentioned below*/
public class FindAllDuplicatesInAnArray {

    public static void main(String[] args) {
        System.out.println("ArrayList is "+findDuplicates(new int[]{4,3,2,7,8,2,3,1}));
    }
    /*My working Solution*/
    /*public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);

        ArrayList<Integer> arraylist = new ArrayList<>();
        for(int i = 0;i<nums.length-1;i++) {
            if(nums[i] == nums[i+1]) arraylist.add(nums[i]);
        }
        return arraylist;
    }*/

    /*Leetcode Solutiom*/
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        int n = nums.length;
        boolean[] visit = new boolean[n + 1];
        for (int i = 0; i < n; ++i) {
            if (visit[nums[i]]) {
                res.add(nums[i]);
            }
            visit[nums[i]] = true;
        }
        return res;
    }
}
