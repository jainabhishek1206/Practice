/*Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.
        Example 1:
        Input: temperatures = [73,74,75,71,69,72,76,73]
        Output: [1,1,4,2,1,1,0,0]

        Example 2:
        Input: temperatures = [30,40,50,60]
        Output: [1,1,1,0]

        Example 3:
        Input: temperatures = [30,60,90]
        Output: [1,1,0]

        Constraints:
        1 <= temperatures.length <= 105
        30 <= temperatures[i] <= 100*/

package com.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class DailyTemperatures739 {
    public static void main(String[] args) {
        DailyTemperatures739 obj = new DailyTemperatures739();
        int arr[] = obj.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
        for(int i : arr) System.out.println(i);
    }
    /*Working Solution using Monotonic Stack  -->>*/
    public int[] dailyTemperatures(int[] temperatures) {
        int ans [] = new int [temperatures.length];
        Deque<Integer> stack = new ArrayDeque<>();
        int len = temperatures.length;
        for(int i =0;i< len;i++) {
            if(stack.isEmpty()) stack.push(i);
            //warmer case
            while((!stack.isEmpty())&& temperatures[stack.peek()] < temperatures[i]) {
                int dev = stack.pop();
                ans[dev] = i - dev;
            }
            stack.push(i);
        }
        return ans;
    }

    /*Brute Force Approach ((Working code))  - ---->>>   */
    /*public int[] dailyTemperatures(int[] temperatures) {
        boolean flag = false;
        int count = 0;
        int len = temperatures.length;
        for(int i=0;i<len;i++) {
            flag = false;
            count = 1;
            for(int j=i+1;j<len;j++) {
                if(temperatures[i] < temperatures[j]) {
                    temperatures[i] = count;
                    flag = true;
                    break;
                }
                else {
                    count++;
                }
            }
            if(flag) temperatures[i] = count;
            else temperatures[i] = 0;
        }
        return temperatures;
    }*/
}
