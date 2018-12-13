package project.高级算法.N皇后;

import java.util.ArrayList;
import java.util.List;

public class Queen {

    public static void add(int[] data, int n, List<String> ans) {
        int i, j;
        StringBuffer str = new StringBuffer();
        for (i = 0; i < n; i++) {
            str.delete(0, str.length());
            for (j = 0; j < n; j++) {
                if (j == data[i]) {
                    str.append("Q");
                } else {
                    str.append(".");
                }
            }
            ans.add(str.toString());
        }
    }

    public static boolean check_queen_valid(int row, int column, int[] data) {
        int i;
        if (row == 0 && column == 0) {
            return true;
        }
        for (i = 0; i < row; i++) {
            if (data[i] == column) {
                return false;
            } else if (i + data[i] == row + column) {
                return false;
            } else if (i - data[i] == row - column) {
                return false;
            }
        }
        return true;
    }

    public static void find(int row, int[] data, int maxRow, List<List<String>> list) {
        int i;
        if (row == maxRow) {
            return;
        }
        for (i = 0; i < maxRow; i++) {
            if (check_queen_valid(row, i, data)) {
                data[row] = i;
                if (row == maxRow - 1) {
                    List<String> ans = new ArrayList<>();
                    add(data, maxRow,ans);
                    list.add(ans);
                } else {
                    find(row + 1, data, maxRow, list);
                }
            }
        }
    }

    public static List<List<String>> solveNQueens(int n)  {
        int[] data = new int[100];
        List<List<String>> list = new ArrayList<>();
        find(0, data, n, list);
        return list;

    }

    public static void main(String[] args) {
        System.out.print(solveNQueens(4).toString());
    }
}
