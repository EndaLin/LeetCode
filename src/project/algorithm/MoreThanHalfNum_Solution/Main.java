package project.algorithm.MoreThanHalfNum_Solution;

import java.util.Arrays;

/**
 * @author wt
 * @create 2019-04-02 下午6:55
 */
public class Main {
    public int MoreThanHalfNum_Solution(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        if (length == 1) return array[0];
        int num = 1;
        for (int i = 1; i < length; i++) {
            if (array[i] == array[i - 1]) {
                num++;
            } else {
                num = 1;
            }
            if (num > length / 2) {
                return array[i];
            }
        }
        return 0;
    }
}
