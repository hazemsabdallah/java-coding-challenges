package leetcode;

/**
 * LeetCode:
 * 122. Best Time to Buy and Sell Stock
 * <a href='https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/'>
 */
public class BuyAndSellStockII {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i] < prices[i+1]) {
                maxProfit += prices[i+1] - prices[i];
            }
        }
        return maxProfit;
    }

    public static void main (String[] args) {
        int[] prices = new int[] {7,1,5,3,6,4}; // Input array
        System.out.println(maxProfit(prices));
    }
}
