package com.leetcode;

public class ConsecutiveCharacters1446 {
    public int maxPower(String s) {
        int maxcount = 0;
        int currentCount = 0;
        char prevChar = s.charAt(0);
        for(int i=1;i<s.length();i++) {
            if(prevChar == s.charAt(i)) {
                currentCount ++;
                maxcount = Math.max(maxcount,currentCount);
            } else {
                currentCount = 0;
                prevChar = s.charAt(i);
            }
        }
        return maxcount;
    }
}
