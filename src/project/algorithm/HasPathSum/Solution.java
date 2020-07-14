package project.algorithm.HasPathSum;

/**
 * @author linwt
 * @date 2020/7/7 10:13
 */
public class Solution {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        return hasPathSum(root, 0, sum);
    }

    public static boolean hasPathSum(TreeNode root, int sum, int target) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return sum + root.val == target;
        }

        sum += root.val;
        return hasPathSum(root.left, sum, target) || hasPathSum(root.right, sum, target);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = null;
        root.left = new TreeNode(2);
        root.left.left = null;
        root.left.right = null;
        System.out.println(hasPathSum(root, 1));
    }
}
