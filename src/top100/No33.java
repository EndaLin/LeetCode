package top100;

/**
 * @author linwentao
 * @date 2022/2/22 7:07 PM
 */
public class No33 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;

        int result = -1;
        while (left <= right) {
            mid = (left + right) >> 1;
            if (nums[left] <= nums[mid]) {
                result = find(nums, left, mid, target);
                if (result != -1) {
                    return result;
                }
                left = mid + 1;
            } else {
                result = find(nums, mid, right, target);
                if (result != -1) {
                    return result;
                }
                right = mid - 1;
            }
        }
        return result;
    }

    private static int find(int[] nums, int left, int right, int target) {
        if (left > right) {
            return -1;
        } else if (left == right) {
            return nums[left] == target ? left : -1;
        }
        int mid = (left + right) >> 1;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return find(nums, left, mid - 1, target);
        } else {
            return find(nums, mid + 1, right, target);
        }
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{0}, 0));
    }
}
