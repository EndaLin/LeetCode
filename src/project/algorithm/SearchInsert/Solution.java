package project.algorithm.SearchInsert;

/**
 * @author linwentao 8373
 * @date 2020/7/17 8:36 上午
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0;i < nums.length;i++) {
            if (target <= nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
