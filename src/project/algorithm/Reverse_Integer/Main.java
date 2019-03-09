package project.algorithm.Reverse_Integer;

/**
 * @author wt
 * @create 2019-03-09 上午10:34
 */
public class Main {
    public static int reverse(int x) {
        int ans = x % 10;
        int temp = x;
        while ((temp /= 10) != 0) {
            if (ans > Integer.MAX_VALUE/10 || ans < Integer.MIN_VALUE/10) {
                return 0;
            }
            ans = ans * 10 + temp % 10;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(reverse(-120));
    }
}
