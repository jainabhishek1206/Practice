package com.leetcode;

//Red -> 0, White -> 1, Blue -> 2
public class SortColors75 {
    public static void main(String[] args) {
        sortColor(new int[] {2,0,2,1,1,0});
    }
    public static void sortColor(int[] nums) {
        int countRed=0, countWhite=0, countBlue = 0;
        for(int i : nums) {
            if(i==0) countRed++;
            else if (i==1) countWhite++;
            else if(i == 2) countBlue++;
        }
        int i=0;
        while (countRed!=0) {
            nums[i] = 0;
            countRed--;
            i++;
        }
        while (countWhite!=0) {
            nums[i] = 1;
            countWhite--;
            i++;
        }
        while (countBlue!=0) {
            nums[i] = 2;
            countBlue--;
            i++;
        }
        int del[] = new int[5];
        for(int d : del) System.out.println("val is "+d);
    }
}