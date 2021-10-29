package com.practice;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial is " +calcualteFactorial(5));
    }
    private static int calcualteFactorial(int n) {
        if (n == 1) return n;
        return n * calcualteFactorial(n - 1);
    }
}
