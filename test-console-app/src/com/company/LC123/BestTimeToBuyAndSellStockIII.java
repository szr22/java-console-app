package com.company.LC123;

public class BestTimeToBuyAndSellStockIII {
    public int maxProfit(int[] prices) {
        int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE;
        int sold1 = 0, sold2 = 0;

        for(int price: prices){
            sold2 = Math.max(sold2, hold2+price);
            hold2 = Math.max(hold2, sold1-price);
            sold1 = Math.max(sold1, hold1+price);
            hold1 = Math.max(hold1, -price);
        }

        return sold2;
    }
}
