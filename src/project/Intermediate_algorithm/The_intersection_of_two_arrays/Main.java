package project.Intermediate_algorithm.The_intersection_of_two_arrays;

import javax.naming.event.ObjectChangeListener;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author wt
 * @create 2019-03-05 下午6:39
 */
public class Main {

    public static int[] find(int[] nums1, int[] nums2) {
        ArrayList<Integer> ansList = new ArrayList<>();
        int[] ans;
        int i = 0, j = 0, k = 0;
        for (i = 0; i < nums1.length; i++) {
            for (; j < nums2.length && nums1[i] >= nums2[j]; j++) {
                if (nums1[i] == nums2[j]) {
                    ansList.add(nums1[i]);
                    while (i != nums1.length - 2 && i != nums1.length - 1 && nums1[i] == nums1[i + 1]) {
                        i++;
                    }
                    if (i == nums1.length - 2 && nums1[i] == nums1[i + 1]) {
                        i += 2;
                    }
                    break;
                }
            }
        }
        Object[] objects = ansList.toArray();
        ans = new int[objects.length];
        for (k = 0; k < objects.length; k++) {
            ans[k] = (int) objects[k];
        }
        return ans;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] ans;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if (nums1.length == 0 | nums2.length == 0) {
            return new int[0];
        }
        int flag = nums1[0] > nums2[0] ? 1 : 2;
        if (flag == 1) {
            ans = find(nums1, nums2);
        } else {
            ans = find(nums2, nums1);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num1 = {};
        int[] num2 = {1};
        int[] ans = intersection(num1, num2);
        for (int a : ans) {
            System.out.println(a + " ");
        }
    }
}
