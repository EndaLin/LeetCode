package project.algorithm.Contains_Duplicate;

import java.util.Arrays;

/**
 * @author wt
 * @create 2019-03-13 上午8:49
 */
public class Main {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1;i < nums.length;i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }
        return  false;
    }
}
