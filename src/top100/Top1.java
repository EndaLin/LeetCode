package top100;

import java.util.HashMap;
import java.util.Map;

/**
 * @author linwentao
 * @date 2022/2/7 6:32 PM
 */
public class Top1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        map.put(target - nums[0], 0);
        for (int i = 1; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{i, map.get(nums[i])};
            }
            map.put(target - nums[i], i);
        }
        return new int[]{0, 0};
    }
}
