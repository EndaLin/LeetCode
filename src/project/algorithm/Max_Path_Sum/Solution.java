package project.algorithm.Max_Path_Sum;


import java.util.Arrays;

/**
 * @author linwt
 * @date 2020/6/21 9:29
 */
public class Solution {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private int val = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        dfs(root);
        return val;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = Math.max(0, dfs(root.left));
        int right = Math.max(0, dfs(root.right));
        int val1 = root.val + left + right;
        int val2 = root.val + Math.max(0, Math.max(left, right));
        val = Math.max(val, val1);
        return val2;
    }

    public static void main(String[] args) {
        int[] data = {7, 5, 3};
        Arrays.sort(data);
        System.out.println(data[data.length - 1]);
    }
}
