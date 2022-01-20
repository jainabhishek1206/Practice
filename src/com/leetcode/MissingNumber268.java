/*Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

        Example 1:
        Input: nums = [3,0,1]
        Output: 2
        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

        Example 2:
        Input: nums = [0,1]
        Output: 2
        Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

        Example 3:
        Input: nums = [9,6,4,2,3,5,7,0,1]
        Output: 8
        Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

        Example 4:
        Input: nums = [0]
        Output: 1
        Explanation: n = 1 since there is 1 number, so all numbers are in the range [0,1]. 1 is the missing number in the range since it does not appear in nums.

        Constraints:
        n == nums.length
        1 <= n <= 104
        0 <= nums[i] <= n
        All the numbers of nums are unique.*/
package com.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber268 {
    public int missingNumber(int[] nums) {
        //sum of first n natural number is ->  n(n+1)/2
        int len = nums.length;
        int sumOfNnumbers = (len*(len+1))/2;
        int sum = 0;
        for(int i : nums)
            sum = sum + i;
        return sumOfNnumbers - sum;

        /*Set<Integer> numbers = new HashSet<>();
        for(int i=0;i<nums.length;i++) numbers.add(i);

        for(int i : nums) {
            numbers.remove(i);
        }
        return numbers.iterator().next();*/
    }
}