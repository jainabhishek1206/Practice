package com.leetcode;

import java.util.Arrays;
import java.util.Collections;

public class MaximumNumberOfBallons {
    public static void main(String[] args) {
        System.out.println("Min ballon is "+maxNumberOfBalloons("leetcode"));
    }
    //balloon
    public static int maxNumberOfBalloons(String text) {
        int res = 0;
        if(text.length()<7) return 0;
        int countArray[] = new int[5];

        for(Character c: text.toCharArray()) {
            switch (c) {
                case 'a': countArray[0]++;
                break;

                case 'b': countArray[1]++;
                break;

                case 'l': countArray[2]++;
                break;

                case 'o': countArray[3]++;
                break;

                case 'n': countArray[4]++;
                break;
            }
        }

        //res will be min of count of the above chars
        countArray[2] =countArray[2]/2;
        countArray[3] =countArray[3]/2;
        Arrays.sort(countArray);
        /*for (int i : countArray)
            System.out.println("arrays elements are "+i);*/
        res = countArray[0];
        return res;
    }
}
