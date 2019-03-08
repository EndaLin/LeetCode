package project.Intermediate_algorithm.Remove_Duplicates_from_Sorted_Array;

import java.util.Arrays;

/**
 * @author wt
 * @create 2019-03-08 上午8:39
 */
public class Main {
    public static int removeDuplicates(int[] nums) {
        int num = 0;
        if (nums.length == 1) {
            return 1;
        } else if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                num = 1;
            } else if (nums[i] == nums[i - 1]) {
                while (i != nums.length - 1 && nums[i] == nums[i - 1]) {
                    i++;
                }
                if (nums[i] != nums[num - 1]) {
                    nums[num] = nums[i];
                    num++;
                }
            } else {
                nums[num] = nums[i];
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
        System.out.println(Arrays.toString(nums));
    }
}
