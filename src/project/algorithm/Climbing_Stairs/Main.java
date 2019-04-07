package project.algorithm.Climbing_Stairs;

/**
 * @author wt
 * @create 2019-04-07 下午3:08
 */
public class Main {
    public int climbStairs(int n) {
        int a = 1;
        int b = 2;
        if (n == 0) return 0;
        if (n == 1) return a;
        if (n == 2) return b;
        while (n >= 3) {
            int temp = a + b;
            a = b;
            b = temp;
            n--;
        }
        return b;
    }
}
