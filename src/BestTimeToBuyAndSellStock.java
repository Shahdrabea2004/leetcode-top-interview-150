/**
 * LeetCode 121 - Best Time to Buy and Sell Stock
 * Problem:
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int mnPrice = 0;
        int mxDiff = Integer.MIN_VALUE;
        for (int i = 1; i < prices.length; i++) {
            mnPrice = prices[i - 1];
            while (true && i < prices.length) {
                if (prices[i] - mnPrice > 0) {
                    mxDiff = Math.max(mxDiff, prices[i] - mnPrice);
                    i++;
                } else {
                    break;
                }
            }
        }

        if (mxDiff < 0) return 0;
        return mxDiff;
    }
}
