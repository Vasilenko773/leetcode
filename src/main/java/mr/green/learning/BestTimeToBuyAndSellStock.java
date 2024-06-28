package mr.green.learning;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int benefit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            benefit = Math.max(prices[i] - minPrice, benefit);
        }
        return benefit;
    }
}
