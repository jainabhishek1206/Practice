package com.geeksforgeeks;

import java.util.ArrayList;
import java.util.HashSet;

/*Ugly numbers are numbers whose only prime factors are 2, 3 or 5. The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. By convention, 1 is included.
        Given a number n, the task is to find n’th Ugly number.

        https://www.geeksforgeeks.org/ugly-numbers/*/
public class UglyNumbers {
    private static ArrayList<Integer> uglyNumber = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("check ugly number "+ isUglyNumber(17));
        System.out.println("check ugly number "+ isUglyNumber(24));
    }
    private static int calculateUglyNumber(int n) {
        return 0;
    }

    //check if number is ugly
    private static boolean isUglyNumber(int n) {
        n = maxDivisibleby(n,2);
        n = maxDivisibleby(n,3);
        n= maxDivisibleby(n,5);

        return n == 1 ? true : false;
    }
    private static int maxDivisibleby(int a, int b) {
        while (a%b == 0) a= a/b;
        return a;
    }
}
