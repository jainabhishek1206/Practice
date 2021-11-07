package com.leetcode;

public class BestTimeToBuyAndSellStock121 {
    public static void main(String[] args) {

    }
    public int maxProfit(int[] prices) {
        //find min and find max
        if(prices== null || prices.length == 0) return 0;
        int min = prices[0], maxProfit = 0;
        for(int i=1;i<prices.length;i++) {
            int profit = prices[i] - min;
            if(profit>0 && maxProfit<profit) maxProfit = profit;
            else if(profit < 0) min = prices[i];
        }
        return maxProfit;

        /*int maxProfit = 0;
        for(int i=0;i< prices.length-1;i++) {
            for(int j=i+1;j<prices.length;j++) {
                if(prices[j]-prices[i] > 0 && prices[j]-prices[i] > maxProfit) maxProfit = prices[j]-prices[i];
            }
        }
        return maxProfit;*/
    }
}
