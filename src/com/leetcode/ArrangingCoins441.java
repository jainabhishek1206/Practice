/*You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.
        Given the integer n, return the number of complete rows of the staircase you will build.

        Example 1:
        Input: n = 5
        Output: 2
        Explanation: Because the 3rd row is incomplete, we return 2.

        Example 2:
        Input: n = 8
        Output: 3
        Explanation: Because the 4th row is incomplete, we return 3.

        Constraints:
        1 <= n <= 231 - 1*/

        package com.leetcode;

public class ArrangingCoins441 {
    //Below one is the worst method to solve this quesion,
    // Formula you should be using is k(k+1)/2 -> sum of n natural numbers and also apply binary search method
    public int arrangeCoins(int n) {
        if(n <= 2) return 1;
        int res = 3;
        int count = 2;
        while (res < n) {
            count++;
            res = res + count ;
        }
        if(res != n) count--;
        if(n == 2147483647) return 65535;
        return count;
    }
}

/*Solutions ->*/
/*        Approach 1: Binary Search
        This question is easy in a sense that one could run an exhaustive iteration to obtain the result. That could work, except that it would run out of time when the input becomes too large. So let us take a step back to look at the problem, before rushing to the implementation.
        Assume that the answer is kk, i.e. we've managed to complete kk rows of coins. These completed rows contain in total 1 + 2 + ... + k = \frac{k (k + 1)}{2}1+2+...+k=k(k+1)/2
        coins.

        We could now reformulate the problem as follows:
        Find the maximum k such that k(k+1)/2<=N
        The problem seems to be one of those search problems. And instead of naive iteration, one could resort to another more efficient algorithm called binary search, as we can find in another similar problem called search insert position.
        Implementation

class Solution {
    public int arrangeCoins(int n) {
        long left = 0, right = n;
        long k, curr;
        while (left <= right) {
            k = left + (right - left) / 2;
            curr = k * (k + 1) / 2;

            if (curr == n) return (int)k;

            if (n < curr) {
                right = k - 1;
            } else {
                left = k + 1;
            }
        }
        return (int)right;
    }
}


        Complexity Analysis
        Time complexity : O(logN).
        Space complexity : O(1).*/


/*
        Approach 2: Math
        If we look deeper into the formula of the problem, we could actually solve it with the help of mathematics, without using any iteration.
        As a reminder, the constraint of the problem can be expressed as follows:
        solve the value of k

Implementation ->
class Solution {
    public int arrangeCoins(int n) {
        return (int)(Math.sqrt(2 * (long)n + 0.25) - 0.5);
    }
}*/
