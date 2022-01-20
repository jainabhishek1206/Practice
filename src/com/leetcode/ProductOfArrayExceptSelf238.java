package com.leetcode;

public class ProductOfArrayExceptSelf238 {
    public static void main(String[] args) {

    }
    public int[] productExceptSelf(int[] nums) {
        if(nums!=null && nums.length<=2) return nums;
        int ans[] = new int[nums.length];
        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        // 1 2 3 4
        // 1 1 2 6
        // 24 12 4 1
        leftSum[0] = 1;
        for(int i=1;i< nums.length;i++) {
            leftSum[i] = leftSum[i-1]*nums[i-1];
        }

        rightSum[nums.length-1] = 1;
        for(int i= nums.length-2;i>=0;i--) {
            rightSum[i] = rightSum[i+1]*nums[i+1];
        }

        for(int i=0;i< nums.length;i++) ans[i] = rightSum[i] * leftSum[i];

        return ans;
    }
}
