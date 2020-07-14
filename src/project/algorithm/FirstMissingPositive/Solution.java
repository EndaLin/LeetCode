package project.algorithm.FirstMissingPositive;

/**
 * @author linwt
 * @date 2020/6/27 10:57
 */
public class Solution {
    public int firstMissingPositive(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0 && num[i] < num.length && num[num[i] - 1] != num[i]) {
                swap(num, i, num[i] - 1);
                i--;
            }
        }

        for (int i = 0; i < num.length; i++) {
            if (i + 1 != num[i]) {
                return i + 1;
            }
        }

        return num.length + 1;
    }

    private void swap(int[] num, int i, int j) {
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }

    public static void main(String[] args) {
        int[] num = {-1,4,2,1,9,10};
        new Solution().firstMissingPositive(num);
    }
}
