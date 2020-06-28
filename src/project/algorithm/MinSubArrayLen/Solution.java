package project.algorithm.MinSubArrayLen;

/**
 * @author linwt
 * @date 2020/6/28 9:25
 */
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        while (start < n) {
            while (end < n && sum < s) {
                sum += nums[end];
                end++;
            }
            if (sum >= s) {
                ans = Math.min(ans, end - start);
            }
            sum -= nums[start];
            start++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        new Solution().minSubArrayLen(7, nums);
    }
}
