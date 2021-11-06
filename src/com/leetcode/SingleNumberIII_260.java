/*Given an integer array nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once. You can return the answer in any order.

        You must write an algorithm that runs in linear runtime complexity and uses only constant extra space.

        Example 1:
        Input: nums = [1,2,1,3,2,5]
        Output: [3,5]
        Explanation:  [5, 3] is also a valid answer.

        Example 2:
        Input: nums = [-1,0]
        Output: [-1,0]

        Example 3:
        Input: nums = [0,1]
        Output: [1,0]

        Constraints:
        2 <= nums.length <= 3 * 104
        -231 <= nums[i] <= 231 - 1
        Each integer in nums will appear twice, only two integers will appear once.*/
package com.leetcode;

import java.util.HashMap;
import java.util.Map;
public class SingleNumberIII_260 {
    public static void main(String[] args) {
        SingleNumberIII_260 sn = new SingleNumberIII_260();
        sn.singleNumber(new int[]{1,2,1,3,2,5});
    }

    public int[] singleNumber(int[] nums) {
        int diff = 0;
        for(int i : nums) {
            diff ^= i;
        }
        int ans[] = new int[2];
        int elementWithLowestBitSet = Integer.lowestOneBit(diff);
        for(int i : nums) {
            if((elementWithLowestBitSet & i) == 0) {
                ans[0] ^= i;
            } else {
                ans[1] ^=i;
            }
        }
        return ans;
    }

    /*public int[] singleNumber(int[] nums) {
        if(nums.length == 2) return nums;
        int res[] = new int[2];
        Map<Integer,Integer> list = new HashMap<>();
        for(int i:nums) {
            if(list.containsKey(i)) {
                list.replace(i,2);
            } else {
                list.put(i,1);
            }
        }
        int j=0;
        for(Integer i : list.keySet()) {
            if(list.get(i) == 1) {
                res[j] = i;
                j++;
            }
        }
        return res;
    }*/
}
