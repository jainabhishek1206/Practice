package com.leetcode;

public class ClimbingStairs70 {

    public static void main(String[] args) {

    }

    public static int climbStairs(int n) {
        int n1 =1;
        int n2 =2;
        if(n==1) return n1;
        if(n==1) return n2;

        for(int i=0;i<n-2;i++) {
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;;
        }
        return n2;
    }
}
