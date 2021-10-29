package com.leetcode;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println("res is -> "+findMaxConsecutiveOnes(new int[] {1,0,1,1,0,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int count = 0;
        for(int i : nums) {
            if(i==1) count++;
            else {
                res = res>count ? res : count;
                count = 0;
            }
        }
        return res;
    }
}
