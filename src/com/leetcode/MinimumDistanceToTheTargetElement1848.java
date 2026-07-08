package com.leetcode;

public class MinimumDistanceToTheTargetElement1848 {
    public int getMinDistance(int[] nums, int target, int start) {
        for(int i=start; i< nums.length; i++)
            if(nums[i] == target) return i - start;

        for(int i=0; i<start; i++)
            if(nums[i] == target) return start - i;

        return -1;
    }
}
