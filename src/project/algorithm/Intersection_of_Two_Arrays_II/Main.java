package project.algorithm.Intersection_of_Two_Arrays_II;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wt
 * @create 2019-03-13 上午8:57
 */
public class Main {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> ansList = new ArrayList<>();
        int i = 0, j = 0;
        int length1 = nums1.length, length2 = nums2.length;
        while (i < length1 && j < length2) {
            if (nums1[i] == nums2[j]) {
                ansList.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                i++;
            }
        }

        int[] ans = new int[ansList.size()];
        i = 0;
        for (int a: ansList) {
            ans[i++] = a;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        System.out.println(Arrays.toString(intersect(num1, num2)));
    }
}
