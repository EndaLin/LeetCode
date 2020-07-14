package project.algorithm.Two_Sum;

import java.util.Arrays;

/**
 * @author wt
 * @create 2019-03-15 下午7:46
 */
public class Main {
    public int[] find(int[] nums, int[] ans, int[] sort_nums) {
        int j = 0;
        int k = 0;
        int[] index = new int[2];
        for (int i = 0;i < nums.length;i++) {
            if (k < 2 && (nums[i] == sort_nums[ans[0]] || nums[i] == sort_nums[ans[1]])) index[k++] = i;
        }
        return index;
    }

    public int[] twoSum(int[] nums, int target) {
        int[] sort_nums = nums.clone();
        Arrays.sort(sort_nums);
        int i = 0, j = 0;
        int temp = target;
        for (i = sort_nums.length - 1;i > 0;i--) {
            temp = target - sort_nums[i];
            for (j = 0;j < i;j++) {
                if (temp - sort_nums[j] == 0) break;
            }
            if (temp - sort_nums[j] == 0) break;
        }
        int[] ans = new int[2];
        ans[0] = j;
        ans[1] = i;
        return find(nums, ans, sort_nums);
    }

    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        new Main().twoSum(nums, -8);
    }
}
