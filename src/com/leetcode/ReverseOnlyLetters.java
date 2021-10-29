package com.leetcode;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        System.out.println("ans is "+reverseString("hod"));
        System.out.println("reverse only letters" +reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
    public static String reverseOnlyLetters(String s) {
        char reveseArray[] = s.toCharArray();
        int lastelement = s.length()-1;
        for(int i=0;i<s.length();i++) {
            if(Character.isLetter(s.charAt(i))) {
                while (!Character.isLetter(s.charAt(lastelement))) {
                    lastelement --;
                }
                reveseArray[i] = s.charAt(lastelement);
                lastelement--;
            }
        }
        return new String(reveseArray);
    }

    public static String reverseString(String s) {
        char reverseArray[] = s.toCharArray();
        for(int i=0;i<s.length()/2;i++) {
            reverseArray[i] = s.charAt(s.length()-1-i);
            reverseArray[s.length()-1-i] = s.charAt(i);
        }
        String reverseString = new String(reverseArray);
        return reverseString;
    }
}