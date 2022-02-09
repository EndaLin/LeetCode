package top100;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author linwentao
 * @date 2022/2/9 8:02 PM
 */
public class Top8 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> answer = new LinkedList<>();
        if (nums.length < 3) {
            return answer;
        }

        // 参数初始化、排序
        Arrays.sort(nums);
        int first = -1;
        // 具体逻辑
        while (++first <= nums.length - 3) {
            // 重复值直接跳过
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            // 双指针走起
            int target = nums[first] * -1;
            int second = first + 1;
            int third = nums.length - 1;
            while (second < third) {
                // third 左移动
                while (second < third && nums[second] + nums[third] > target) {
                    third--;
                }
                // third 右移动
                while (second < third && nums[second] + nums[third] < target) {
                    second++;
                }
                if (second != third && nums[second] + nums[third] == target) {
                    List<Integer> temp = new LinkedList<>();
                    temp.add(nums[first]);
                    temp.add(nums[second]);
                    temp.add(nums[third]);
                    answer.add(temp);
                    // second 右移动
                    while (second < third && nums[++second] == nums[second - 1]) {
                        // 如果second出现重复，继续++
                    }
                    third = nums.length - 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4}));
    }
}
