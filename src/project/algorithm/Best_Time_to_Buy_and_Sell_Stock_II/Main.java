package project.algorithm.Best_Time_to_Buy_and_Sell_Stock_II;

/**
 * @author wt
 * @create 2019-03-09 上午9:44
 */
public class Main {
    public static int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            maxProfit += Math.max(0, prices[i] - prices[i - 1]);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
