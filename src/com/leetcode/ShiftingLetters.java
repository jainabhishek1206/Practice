package com.leetcode;

import java.util.Arrays;

public class ShiftingLetters {
    public static void main(String[] args) {
//        System.out.println("res is "+shiftingLetters("abc",new int[]{3,5,9})); //rpl
//        System.out.println("res is "+shiftingLetters("bad",new int[]{10,20,30})); //jyh
        System.out.println("res is "+shiftingLetters("xrdofd",new int[]{70,41,71,72,73,84})); //surjgj
    }
    public static String shiftingLetters(String s, int[] shifts) {
        int length = shifts.length;
        long sum = 0;
        for(int i=0;i<length;i++) sum += shifts[i];

        //implement the logic
        //ascii value of a is 097 and ascii value of z is 122
        char chararray[] = s.toCharArray();
        for(int i=0;i< length;i++) {
            long ascii = 0;
            ascii = chararray[i];
            ascii = ascii + sum;
            while (ascii > 122) {
                long diff = ascii % 122;//ascii = 531 115
                ascii = 96+diff;
            }
            int newAsci = (int)ascii;
            chararray[i] = (char) newAsci;
            sum = sum - shifts[i];
        }
        String s1 = new String(chararray);
        return s1;
    }
}