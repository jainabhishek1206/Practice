package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome409 {
    public int longestPalindrome(String s) {
        int ans = 0, len = s.length();
        boolean flag = false;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for(Map.Entry<Character, Integer> key : map.entrySet()) {
            int res = key.getValue();
            if(res % 2 == 0) ans = ans+res;
            else {
                ans += res-1;
                flag = true;
            }
        }

        return flag ? ans +1 : ans;
    }
}
