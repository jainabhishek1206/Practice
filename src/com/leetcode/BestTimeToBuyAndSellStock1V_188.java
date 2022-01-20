package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class BestTimeToBuyAndSellStock1V_188 {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStock1V_188 obj = new BestTimeToBuyAndSellStock1V_188();
//        System.out.println(obj.maxProfit(2,new int[]{3,3,5,0,0,3,1,4}));
        System.out.println(obj.maxProfit(2,new int[]{1,2,4,2,5,7,2,4,9,0}));
    }

    public int maxProfit(int k, int[] prices) {
        if(prices.length<=1) return 0;
        int maxProfit = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
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
                if((max-min)>0) {
                    maxProfit =  (max - min);
                    arrayList.add(maxProfit);
                }
                max = 0;
                min = prices[i];
                continue;
            }

            if(prices[i]<min) min = prices[i];
        }

        if(max == prices[prices.length-1]) {
            maxProfit =  (max - min);
            arrayList.add(maxProfit);
        }

        Collections.sort(arrayList, Collections.reverseOrder());
        int sum = 0;
        for(int i=0;i<k&&i< arrayList.size();i++) {
            sum = sum + arrayList.get(i);
        }
        return sum;

    }
}
