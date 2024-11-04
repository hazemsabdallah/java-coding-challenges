package leetcode;

/**
 * LeetCode:
 * 121. Best Time to Buy and Sell Stock
 * <a href='https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/'>
 */
public class BuyAndSellStock {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buy = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]-buy > maxProfit) {
                maxProfit = prices[i]-buy;
            } else if (prices[i] < buy) {
                buy = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main (String[] args) {
        int[] prices = new int[] {7,6,4,3,8}; // Input array
        System.out.println(maxProfit(prices));
    }
}
