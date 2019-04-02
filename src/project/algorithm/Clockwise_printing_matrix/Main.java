package project.algorithm.Clockwise_printing_matrix;

import java.util.ArrayList;

/**
 * @author wt
 * @create 2019-04-02 下午5:55
 */
public class Main {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int col = matrix[0].length - 1;
        int row = matrix.length - 1;
        int length = col > row ? row : col;
        int index = 0;
        while (index <= length / 2) {
            int i = index;
            int j = index;
            while (j <= col) {
                ans.add(matrix[i][j]);
                j++;
            }
            j--;
            i++;
            while (i <= row) {
                ans.add(matrix[i][j]);
                i++;
            }
            i--;
            j--;
            while (j >= index && index != row) {
                ans.add(matrix[i][j]);
                j--;
            }
            i--;
            j++;
            while (i > index && index != col) {
                ans.add(matrix[i][j]);
                i--;
            }
            index++;
            col--;
            row--;

        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1},{2},{3},{4}};
        System.out.println(new Main().printMatrix(matrix).toString());
    }
}
