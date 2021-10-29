package com.leetcode;
/*SOLVED*/
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = twoSum(new int[]{3,2,4},6);
        System.out.println("output is "+arr[0]+" "+arr[1]);
    }
    public static  int[] twoSum(int[] nums, int target) {
        //create a hashMap of value and index
        //Hashmap<Value,Index>
        HashMap<Integer,Integer> hashMap = new HashMap();
        for(int i=0;i<nums.length;i++)
            hashMap.put(nums[i],i);

        //taking the values from map
        for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i]) && hashMap.get(target-nums[i]) != i)
                return new int[] {i,hashMap.get(target-nums[i])};
        }
        return null;
    }
}
    