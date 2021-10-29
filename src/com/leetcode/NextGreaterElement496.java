package com.leetcode;

import java.util.HashMap;

public class NextGreaterElement496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[] = new int[nums1.length];
        HashMap<Integer,Integer> num = new HashMap<>();
        for(int i=0;i< nums2.length;i++) num.put(nums2[i],i);
        for(int i=0;i< nums1.length;i++) {
            boolean found = false;
            int getKey = num.get(nums1[i]);
            for(int j=getKey;j< nums2.length;j++) {
                if(nums1[i] < nums2[j]) {
                    res[i] = nums2[j];
                    found = true;
                }
            }
            if(!found) res[i] = -1;
        }
        return res;
    }
}
