package ru.javaprojects.leetcode_tasks.final_prices_with_a_special_discount_in_a_shop;

class Solution {
    public int[] finalPrices(int[] prices) {
        int[] finalPrices = new int[prices.length];
        finalPrices[finalPrices.length - 1] = prices[prices.length - 1];
        pricesLoop:
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    finalPrices[i] = prices[i] - prices[j];
                    continue pricesLoop;
                }
            }
            finalPrices[i] = prices[i];
        }
        return finalPrices;
    }
}
