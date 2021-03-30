package project.algorithm.Search_Matrix;

/**
 * @author linwentao
 * @date 2021/3/30 8:08 下午
 */
public class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int low = 0, high = n * m - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int x = matrix[mid / n][mid % n];
            if (x == target) {
                return true;
            } else if (x < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int[][] b = {{1,2}};
        System.out.println(searchMatrix(b, 3));
    }
}
