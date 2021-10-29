package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        System.out.println(intersect(new int[] {1,2,2,1}, new int[] {2,2}));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        for(int i=0,j=0;i< nums1.length&&j< nums2.length;) {
            if(nums1[i] == nums2[j]) {
                res.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]) i++;
            else j++;
        }
        System.out.println(res);

        int resArray[] = new int[res.size()];
        for(int i=0;i< res.size();i++) resArray[i] = res.get(i);
        return resArray;
    }
}