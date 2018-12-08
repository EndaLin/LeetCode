package Project.中级算法.N皇后;

public class Queen {
    private static int[] data = new int[100];
    private static int n;

    public static void show() {
        int i, j;
        System.out.print("[");
        for (i = 0; i < n; i++) {
            System.out.print("\"");
            for (j = 0; j < n; j++) {
                if (j == data[i]) {
                    System.out.print("Q");
                } else {
                    System.out.print(".");
                }
            }
            if (i != n - 1) {
                System.out.println("\",");
            } else {
                System.out.println("\"]");
            }
        }
    }

    public static boolean check_queen_valid(int row, int column) {
        int i;
        for (i = 0; i < row; i++) {
            if (data[i] == column) {
                return false;
            } else if (data[i] + i == row + column) {
                return false;
            } else if (data[i] - i == row - column) {
                return false;
            }
        }
        return true;
    }

    public static void find_suitable_queen(int row) {
        int i;
        if (row == n) {
            return;
        }
        for (i = 0; i < n; i++) {
            if (check_queen_valid(row, i)) {
                data[row] = i;
                if (row == n - 1) {
                    show();
                } else {
                    find_suitable_queen(row + 1);
                }
            }
        }
        data[row] = 0;
    }

    public static void main(String[] args) {
        n = 3;
        find_suitable_queen(0);
    }
}
