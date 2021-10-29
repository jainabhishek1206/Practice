package com.leetcode;

public class GuessNumberHigherorLower343 {

    public static void main(String[] args) {
        System.out.println("ans is "+guessNumber(10));
    }
    public  static int guess(int num) {
        int pick = 6;
        if(num > pick) return 1;
        else if (num < pick) return -1;
        else return 0;
    }
    public static int guessNumber(int n) {
        //implement the binary search
        int res = guess (n);
        if(res == 0) return n;
        int ll = 0, ul = n, pick = (ll+ul)/2;
        res = guess(pick);
        while (res != 0) {
            if(res == 1){ //number is lower then the guess number
                ll = pick;
            } else if(res == -1) { //number is greater then the guess number
                ul = pick;
            }
            pick = (ll+ul)/2;
            res = guess(pick);
        }
        return pick;
    }
}
