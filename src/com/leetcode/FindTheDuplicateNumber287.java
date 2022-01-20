/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
        There is only one repeated number in nums, return this repeated number.
        You must solve the problem without modifying the array nums and uses only constant extra space.

        Example 1:
        Input: nums = [1,3,4,2,2]
        Output: 2

        Example 2:
        Input: nums = [3,1,3,4,2]
        Output: 3

        Example 3:
        Input: nums = [1,1]
        Output: 1

        Example 4:
        Input: nums = [1,1,2]
        Output: 1

        Constraints:
        1 <= n <= 105
        nums.length == n + 1
        1 <= nums[i] <= n
        All the integers in nums appear only once except for precisely one integer which appears two or more times.

        Follow up:
        How can we prove that at least one duplicate number must exist in nums?
        Can you solve the problem in linear runtime complexity?*/
package com.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber287 {
    public static void main(String[] args) {
        FindTheDuplicateNumber287 obj = new FindTheDuplicateNumber287();
        System.out.println("Ans is -> "+obj.findDuplicate(new int[]{1,3,4,2,2}));
    }
    public int findDuplicate(int[] nums) {
        //Approach 1 -> sort the array and compare the elements
        /*Arrays.sort(nums);
        for(int i=1;i<nums.length;i++) {
            if(nums[i] == nums[i-1])
                return nums[i];
        }
        return nums[0];*/

        //Approah 2 -> Add element in the set and check if element exists in the set
        /*Set<Integer> seen = new HashSet<>();
        int duplicate = -1;
        for(int i : nums) {
            if(seen.contains(i)) return i;
            seen.add(i);
        }
        return duplicate;*/

        //Approah 3 -> Negative Marking -> make each index element as negative
        /*for(int i=0;i< nums.length;i++) {
            int index = Math.abs(nums[i]);
            if(nums[index] < 0) return i;
            else nums[index] = nums[index] * -1;
        }
        return -1;*/

        //Approach 4 -> Swapping
        while (nums[0] != nums[nums[0]]) {
            int nxt = nums[nums[0]];
            nums[nums[0]] = nums[0];
            nums[0] = nxt;
        }
        return nums[0];


    }
}
