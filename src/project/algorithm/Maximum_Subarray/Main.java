package project.algorithm.Maximum_Subarray;

public class Main {
    public int maxSubArray(int[] nums) {
        int maxNow = nums[0], maxEnd = maxNow;
        for (int i = 1;i < nums.length;i++) {
            maxNow = Math.max(maxNow + nums[i], nums[i]);
            maxEnd = Math.max(maxNow, maxEnd);
        }
        return maxEnd;
    }
}
