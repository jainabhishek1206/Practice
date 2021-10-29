package com.practice;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("output for expression 2+34-12+10"+calculate("2+34-12+10"));
        System.out.println("output for expression 2+34-12+10"+calculate("2+34-12+10"));

    }

    private static int calculate(String s) {
        int res = 0;
        //first number
        int n1 = 0;
        int i = 0;
        do {
            if(n1!=0) n1 = n1*10;
            n1 = Integer.parseInt(String.valueOf(s.charAt(i)));
            i++;
        } while (isNumber(s.charAt(i)));
        return res;
    }
    private static boolean isNumber(char c) {
        if(c>='0' && c<='9') return  true;
        return false;
    }
}
