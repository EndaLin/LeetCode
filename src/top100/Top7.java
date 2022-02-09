package top100;

/**
 * @author linwentao
 * @date 2022/2/9 7:26 PM
 */
public class Top7 {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int leftNum = height[left];
            int rightNum = height[right];
            int stepLength = right - left;
            // 双指针、贪心
            int area = leftNum <= rightNum ? leftNum * stepLength : rightNum * stepLength;
            maxArea = Math.max(maxArea, area);
            if (leftNum <= rightNum) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));;
    }
}
