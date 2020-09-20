package com.company.LC188;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockIV {
    public int maxProfit(int k, int[] prices) {
        int size = prices.length;
        if(k >= size>>1){
            int sold = 0;
            int hold = Integer.MIN_VALUE;

            for(int price: prices){
                int soldTmp = sold;
                sold = Math.max(sold, hold+price);
                hold = Math.max(hold, soldTmp-price);
            }
            return sold;
        }

        int[] holds = new int[k + 1];
        int[] solds = new int[k + 1];
//        in case out of range?
        Arrays.fill(holds, Integer.MIN_VALUE / 2);

        for (int i = 0; i < size; ++i){
            for (int j = k; j > 0; --j){
                solds[j] = Math.max(solds[j], holds[j] + prices[i]);
                holds[j] = Math.max(holds[j], solds[j - 1] - prices[i]);
            }
        }

        return solds[k];
    }
}