package Project.中级算法.矩阵置零;

public class Main {
    public static void setZeroes(int[][] matrix) {
        int flag = 1, flag2 = 2, i = 0, j = 0;
        for(i = 0;i < matrix[0].length;i++){
            if(matrix[0][i] == 0) {
                flag = 0;
                break;
            }
        }
        for(i = 0;i < matrix.length;i++){
            if(matrix[i][0] == 0) {
                flag2 = 0;
                break;
            }
        }
        for(i = 1;i < matrix.length;i++) {
            for(j = 1;j < matrix[i].length;j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for(i = 1;i < matrix.length;i++) {
            for(j = 1;j < matrix[i].length;j++) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if(flag == 0) {
            for(i = 0;i < matrix[0].length;i++) {
                matrix[0][i] = 0;
            }
        }
        if(flag2 == 0) {
            for(i = 0;i < matrix.length;i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
