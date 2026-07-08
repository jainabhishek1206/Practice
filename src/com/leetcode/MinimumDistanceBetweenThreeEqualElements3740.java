package com.leetcode;

public class MinimumDistanceBetweenThreeEqualElements3740 {
    public int minimumDistance(int[] nums) {
        int len = nums.length, ans = Integer.MAX_VALUE;
        if(nums.length < 3) return -1;
        // find for every element if tuple exist or not
        for(int i=0; i<len; i++) {
            for(int j= i+1; j<len; j++) {
                if(nums[i] != nums[j]) continue;
                for(int k=j+1; k<len; k++) {
                    if(nums[i] == nums[k]) {
                        int temp = (j-i) + (k-j) + (k-i);
                        ans = Math.min(ans, temp);
                    }
                }
            }
        }
        ans = ans == Integer.MAX_VALUE ? -1 : ans;
        return ans;
    }
}
