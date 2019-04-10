package project.data_structure.Queue.BFS.Number_of_Islands;

/**
 * @Author: wt
 * @Date: 2019/4/10 15:55
 */
public class Main {

    public void bfs(char[][] grid, boolean[][] check, int i, int j) {
        if (i >= grid.length || j >= grid[0].length || i < 0 || j < 0 || grid[i][j] == 0) {
            return;
        } else if (grid[i][j] == '1' && check[i][j] == false) {
            check[i][j] = true;
            bfs(grid, check, i - 1, j);
            bfs(grid, check, i, j - 1);
            bfs(grid, check, i, j + 1);
            bfs(grid, check, i + 1, j);
        }
    }

    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        boolean[][] check = new boolean[grid.length][grid[0].length];

        int ans = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1' && check[i][j] == false) {
                    ans++;
                    bfs(grid, check, i, j);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
        System.out.println(new Main().numIslands(grid));
    }
}
