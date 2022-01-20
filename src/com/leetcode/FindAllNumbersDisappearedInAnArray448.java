package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray448 {
    public static void main(String[] args) {
        int[] nums = new int[]{4,3,2,7,8,2,3,1};
        List<Integer> arrayList = new ArrayList<>();
        Arrays.sort(nums);
        int count = 1;
        for(int i : nums) {
            if(count == i) count++;
            else if(count == i-1) continue;
            else arrayList.add(count);
        }
    }
    /*public List<Integer> findDisappearedNumbers(int[] nums) {

    }*/
}
