package project.algorithm.Rotate_Array;

/**
 * @author wt
 * @create 2019-03-11 上午8:55
 */
public class Main {
    public  static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        if (k == 0) return;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0,  k-1);
        reverse(nums, k, nums.length - 1);
    }
    public static void main(String[] args) {

    }
}
