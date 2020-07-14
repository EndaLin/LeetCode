package project.algorithm.Merge_Sorted_Array;

/**
 * @author wt
 * @create 2019-04-03 上午8:49
 */
public class Main {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                ans[k] = nums1[i];
                i++;
                k++;
            } else {
                ans[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            ans[k++] = nums1[i++];
        }
        while (j < n) {
            ans[k++] = nums2[j++];
        }
        for (i = 0;i < ans.length;i++) {
            nums1[i] = ans[i];
        }
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,0,0,0};
        int[] num2 = {2,5,6};
        new Main().merge(num1, 3, num2, 3);
    }
}
