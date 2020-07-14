package project.algorithm.reOrderArray;

import java.util.Arrays;

/**
 * @author wt
 * @create 2019-03-12 上午9:19
 */
public class Main {
    public static void reOrderArray(int[] array) {
        for (int i = 0, j = 0, k = i; i < array.length && j < array.length; i++) {
            while (i < array.length && array[i] % 2 == 0) i++;
            if (i >= array.length) break;
            k = i;
            j = i - 1;
            while (j >= 0 && array[j] % 2 == 0) {
                int temp = array[k];
                array[k] = array[j];
                array[j] = temp;
                k = j;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }
}
