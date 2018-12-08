package Project.中级算法.三数之和;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> lists = new ArrayList<>();
        if(nums.length < 3){
            System.out.println(lists.toString());
            return lists;
        }
        if(nums[0] == 0 && nums[1] == 0 && nums[2] == 0) {
            lists.add(Arrays.asList(0,0,0));
            return lists;
        }
        for (int i = 0, k = 0, j = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            j = i + 1;
            k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] == 0) {
                    lists.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while(nums[j] == nums[j-1] && j < k){
                        j++;
                    }
                    k--;
                    while(nums[k] == nums[k+1] && j < k){
                        k--;
                    }
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                    while(nums[k] == nums[k+1] && j < k){
                        k--;
                    }
                } else {
                    j++;
                    while(nums[j] == nums[j-1] && j < k){
                        j++;
                    }
                }
            }
            while(nums[i] == nums[i+1] && i + 1 < nums.length - 2){
                i++;
            }
        }
        return lists;
    }
}
