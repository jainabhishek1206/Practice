package com.leetcode;

/*Given an array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.

        Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.

        The tests are generated such that there is exactly one solution. You may not use the same element twice.

        Example 1:
        Input: numbers = [2,7,11,15], target = 9
        Output: [1,2]
        Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.

        Example 2:
        Input: numbers = [2,3,4], target = 6
        Output: [1,3]*/

public class TwoSum167 {

    public static void main(String[] args) {
        int arr[] = twoSum(new int[]{-1,0},-1);
        System.out.println("output is "+arr[0]+" "+arr[1]);
    }
    public static  int[] twoSum(int[] numbers, int target) {
        int leftPointer = 0, rightPointer = numbers.length-1;
        int sum = 0;
        do{
            sum = numbers[leftPointer]+numbers[rightPointer];
            if(sum>target)
                rightPointer--;
            else if(sum<target)
                leftPointer++;
            else if(sum==target){
                return new int[]{leftPointer+1,rightPointer+1};
            }
        }while(leftPointer!=rightPointer);
        return null;
    }
}
