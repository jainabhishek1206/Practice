package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        if(s.equals(" ")) return 1;
        int res = 0, count = 0;
        Set<Character> as = new HashSet<>();
        for(Character c: s.toCharArray()) {
            if(as.contains(c)) {
                res = Math.max(res,count);
                count = 0;
            }
            count ++;
            as.add(c);
        }
        return Math.max(res,count);
    }
}
