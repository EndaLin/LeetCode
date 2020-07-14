package project.algorithm.quick_sort;

public class Main {
    public void quick_sort(int[] nums, int low, int high) {
        int i = low, j = high;
        int temp = nums[i];
        while (i < j) {
            while (i < j && temp <= nums[j]) j--;
            if (i < j) {
                nums[i] = nums[j];
                i++;
            }
            while (i < j && temp > nums[i]) i++;
            if (i < j) {
                nums[j] = nums[i];
                j--;
            }
        }
        nums[i] = temp;
        if (low < i) quick_sort(nums, low, i - 1);
        if (i < high) quick_sort(nums, i + 1, high);
    }
}
