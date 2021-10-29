package com.leetcode;

/*Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

        Notice that you may not slant the container.
        Input: height = [1,8,6,2,5,4,8,3,7]
        Output: 49
        Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.*/


public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        System.out.println("area is "+maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    private static  int maxArea(int[] height) {
        int leftPointer = 0, rightPointer = height.length-1;
        int maxArea = 0;
        do {
            int area = (rightPointer-leftPointer)*Math.min(height[leftPointer],height[rightPointer]);
            if(area>maxArea) {
                maxArea=area;
            }
            if(height[leftPointer]>height[rightPointer]) rightPointer--;
            else leftPointer ++;
        }while(leftPointer!=rightPointer);
        return maxArea;
    }
}