package project.algorithm.Valid_Sudoku;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0;i < board.length;i++) {
            for (int j = 0;j < board[i].length;j++) {
                char c = board[i][j];
                if (c != '.' && (!seen.add(c + "in row " + i) || !seen.add(c + "in column " + j) || !seen.add(c + "in sub-boxes " + i / 3 + j / 3))) {
                    return false;
                }
            }
        }
        return true;
    }
}
