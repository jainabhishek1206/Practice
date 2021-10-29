package com.leetcode.studyPlan.dynamicProgramming;

public class FibonacciNumber509 {
    private int[] res = new int[30];
    FibonacciNumber509() {
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i < 30; i++) {
            res[i] = -1;
        }
    }
    public int fib(int n) {
        if(res[n] != -1) return res[n-1];
        return res[n-1] + res[n-2];
    }
}
