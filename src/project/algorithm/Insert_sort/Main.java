package project.algorithm.Insert_sort;

public class Main {
    public void insertSort(int[] nums) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            int temp = nums[i + 1];
            int j = i;
            while (j > -1 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
    }
}
