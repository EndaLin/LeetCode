package project.algorithm.Best_Time_to_Buy_and_Sell_Stock;

/**
 * @author wt
 * @create 2019-04-07 下午3:10
 */
public class Main {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1;i < prices.length;i++) {
            if (prices[i] > prices[i-1]) {
                ans = ans > prices[i] - prices[i-1] ? ans : prices[i] - prices[i-1];
                prices[i] = prices[i-1];
            }
        }
        return ans;
    }
}
