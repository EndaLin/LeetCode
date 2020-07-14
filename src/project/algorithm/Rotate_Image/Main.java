package project.algorithm.Rotate_Image;

import java.util.Arrays;

/**
 * @author wt
 * @create 2019-03-15 下午8:30
 */
public class Main {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int k = 0; k < n / 2; k++) {
            int a = matrix[k][k];
            int b = matrix[k][n - 1 - k];
            int c = matrix[n - 1 - k][n - 1 - k];
            int d = matrix[n - 1 - k][k];

            matrix[k][k] = d;
            matrix[k][n - 1 - k] = a;
            matrix[n - 1 - k][k] = c;
            matrix[n - 1 - k][n - 1 - k] = b;

            for (int i = k + 1; i < n - 1 - k; i++) {
                int e = matrix[k][i];
                int f = matrix[i][n - k - 1];
                int g = matrix[n - k - 1][n - i - 1];
                int h = matrix[n - i - 1][k];

                matrix[k][i] = h;
                matrix[i][n - k - 1] = e;
                matrix[n - k - 1][n - i - 1] = f;
                matrix[n - i - 1][k] = g;
            }
        }
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        new Main().rotate(nums);
    }
}
