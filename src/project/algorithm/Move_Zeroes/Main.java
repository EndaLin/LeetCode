package project.algorithm.Move_Zeroes;

/**
 * @author wt
 * @create 2019-03-14 上午8:50
 */
public class Main {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 0, k = 0;
        while (k < nums.length && nums[k] != 0) k++;
        if (k == nums.length) return;
        i = k + 1;
        while (i < nums.length) {
            if (nums[i] != 0) {
                j = i;
                while (j > k) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    j--;
                }
                k = j + 1;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        new Main().moveZeroes(nums);
    }
}
