package project.Intermediate_algorithm.Find_the_single_one;

/**
 * @author wt
 * @create 2019-03-06 下午3:50
 */
public class Main {
    public static int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            // bitwise xor
            ans ^= num;
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
