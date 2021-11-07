/*You are given an integer array prices where prices[i] is the price of a given stock on the ith day.\
        On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
        Find and return the maximum profit you can achieve.

        Example 1:
        Input: prices = [7,1,5,3,6,4]
        Output: 7
        Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
        Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
        Total profit is 4 + 3 = 7.

        Example 2:
        Input: prices = [1,2,3,4,5]
        Output: 4
        Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
        Total profit is 4.

        Example 3:
        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: There is no way to make a positive profit, so we never buy the stock to achieve the maximum profit of 0.

        Constraints:
        1 <= prices.length <= 3 * 104
        0 <= prices[i] <= 104*/
package com.leetcode;

public class BestTimeToBuyAndSellStockII_122 {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockII_122 ans = new BestTimeToBuyAndSellStockII_122();
        System.out.println(ans.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(ans.maxProfit(new int[]{1,2,3,4,5}));
        System.out.println(ans.maxProfit(new int[]{1,1,0}));
/*                [7,1,5,3,6,4]
[1,2,3,4,5]
[7,6,4,3,1]*/
    }
    public int maxProfit(int[] prices) {
        if(prices.length<=1) return 0;
        int maxProfit = 0;
        int min, max = 0;
        if(prices[0]<prices[1]) {
            min = prices[0];
            max = prices[1];
            if(prices.length == 2) return max - min;
        } else {
            min = prices[1];
            max = 0;
        }

        //main login
        for(int i=2;i<prices.length;i++) {
            if(prices[i]>max) max = prices[i];
            else {
                if((max-min)>0) maxProfit = maxProfit + (max - min);
                max = 0;
                min = prices[i];
                continue;
            }

            if(prices[i]<min) min = prices[i];
        }
        if(max == prices[prices.length-1]) maxProfit = maxProfit + (max - min);
        return maxProfit;
    }
}
