package project.algorithm.Symmetric_Tree;

public class Main {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    static StringBuilder leftString = new StringBuilder();

    public static void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        leftString.append(root.val);
        inOrder(root.right);
    }


    public boolean isSymmetric(TreeNode root) {
        inOrder(root);
        System.out.println(leftString.toString());
        return leftString.equals(leftString.reverse());
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(2);
        t1.left.left = new TreeNode(3);
        t1.left.right = new TreeNode(4);
        t1.right.left = new TreeNode(4);
        t1.right.right = new TreeNode(3);
        new Main().isSymmetric(t1);
    }
}
