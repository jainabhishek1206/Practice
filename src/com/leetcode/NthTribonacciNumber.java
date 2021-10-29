package com.leetcode;

public class NthTribonacciNumber {
    public static void main(String[] args) {
        System.out.println("res is -> "+tribonacci(26));
    }
    public static int tribonacci(int n) {
        if(n==0) return 0;
        if(n<3) return 1;

        int res = 0;
        int n1=0,n2=1,n3=1;
        for(int i=0;i<n-2;i++) {
            res = n1+n2+n3;
            n1=n2;
            n2=n3;
            n3 = res;
        }
        return res;
    }
}
