package project.algorithm.House_Robber;

public class Main {
    public int rob(int[] nums) {
        int rob = 0, noRob = 0;
        for (int n: nums) {
            int currentValue = noRob + n;
            noRob = Math.max(noRob, rob);
            rob = currentValue;
        }
        return Math.max(rob, noRob);
    }
}
