package questions.stock;

// problem link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
public class BestTimeToSellStockWithTransactionFee {

    public int maxProfit(int[] prices, int fee) {
        int n = prices.length;
        if (n < 2) return 0;
        int[] hold = new int[n], sold = new int[n];
        hold[0] = -prices[0];
        for (int i = 1; i < n; ++i) {
            hold[i] = Math.max(hold[i - 1], sold[i - 1] - prices[i]);
            sold[i] = Math.max(sold[i - 1], hold[i - 1] + prices[i] - fee);
        }

        return sold[n - 1];
    }

}
