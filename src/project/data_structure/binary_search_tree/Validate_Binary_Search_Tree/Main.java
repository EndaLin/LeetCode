package project.data_structure.binary_search_tree.Validate_Binary_Search_Tree;

/**
 * * Definition for a binary tree node.
 * * public class TreeNode {
 * *     int val;
 * *     TreeNode left;
 * *     TreeNode right;
 * *     TreeNode(int x) { val = x; }
 *
 * @author wt
 * @create 2019-03-13 上午11:50
 */
public class Main {

    public boolean isValid(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val <= min || root.val >= max) return false;
        return isValid(root.left, min, Math.min(root.val, max)) && isValid(root.right, Math.max(root.val, min), max);
    }

    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
