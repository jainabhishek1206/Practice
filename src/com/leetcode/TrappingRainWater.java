package com.leetcode;

import org.jetbrains.annotations.NotNull;

public class TrappingRainWater {
    public static void main(String[] args) {
        System.out.println(trap (new int[]{4,2,0,3,2,5}));
//        System.out.println(trap (new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
    public static int trap(int @NotNull [] height) {
        int res =0;
        boolean elmentGreaterThan2 = true;
        System.out.println("Length if an array is"+height.length);
        int initial =0;
        int end = height.length-1;
        for (int i=0;elmentGreaterThan2;i++) {
            int count =0;
            for (int j=initial;j< end+1;j++) {
                while (height[initial] == 0) {
                    initial = initial +1;
                    j=initial;
                }
                while (height[end] == 0) {
                    end = end -1;
                }

                if(elmentGreaterThan2) {
                    //decrease the size of the array
                    if(height[j] == 0) {
                        res++;
                    } else if(height[j] !=0) {
                        height[j] = height[j]-1;
                        if(height[j]==0) {
                            res++;
                        }
                    }
                    if (height[j]>2) {
                        count++;
                    }
                }
            }
            if(count > 0) {
                elmentGreaterThan2 = true;
            } else
                elmentGreaterThan2 = false;
        }
        return res;
    }
}
