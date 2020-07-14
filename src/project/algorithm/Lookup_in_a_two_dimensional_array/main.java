package project.algorithm.Lookup_in_a_two_dimensional_array;

/**
 * @author wt
 * @create 2019-03-11 下午6:59
 */
public class main {
    public static boolean Find(int target, int[][] array) {
        int row = 0;
        int col = array.length - 1;
        while (row < array[0].length && col >= 0) {
            if (array[col][row] == target) return true;
            else if (array[col][row] > target) {
                col --;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}, {1, 2, 3, 4, 5, 6, 7, 8, 9}};
        int target = 7;
        if (Find(target, array)) System.out.println(true);
        else System.out.println(false);
    }
}
