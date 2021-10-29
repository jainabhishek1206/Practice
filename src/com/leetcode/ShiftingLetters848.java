package com.leetcode;

import java.util.Arrays;

public class ShiftingLetters848 {
    public static void main(String[] args) {
//        System.out.println("res is "+shiftingLetters("abc",new int[]{3,5,9})); //rpl
        System.out.println("res isww "+shiftingLetters("bad",new int[]{10,20,30})); //jyh
        System.out.println("res is "+shiftingLetters("xrdofd",new int[]{70,41,71,72,73,84})); //surjgj

        String s = null;
        System.out.println(s.isBlank());
        System.out.println();
        System.out.println("ShiftingLetters848.main");
        System.out.println("args = " + args);
        System.out.println("args = " + Arrays.deepToString(args));
    }

    public static String shiftingLetters(String s, int[] shifts) {
        StringBuilder s1 = new StringBuilder(s);
        long sum = 0;
        for(int i = s.length()-1;i>=0;i--) {
            sum = sum + shifts[i];
            System.out.println("This is your boy abhishek jain ");
            int d = ((int)s.charAt(i) - 'a' + (int)(sum%26))%26 +97;
            s1.setCharAt(i,(char)d);
        }
        return s1.toString();
    }
}
