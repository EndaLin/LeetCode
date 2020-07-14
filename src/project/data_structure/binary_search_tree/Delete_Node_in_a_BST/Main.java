package project.data_structure.binary_search_tree.Delete_Node_in_a_BST;

/**
 * @author wt
 * @create 2019-03-13 下午5:34
 */
public class Main {

    private int val;

    public TreeNode deleteMin(TreeNode root) {
        if (root == null) return null;
        if (root.left == null) {
            this.val = root.val;
            return root.right;
        }
        root.left = deleteMin(root.left);
        return root;
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        else if (root.val > key) root.left = deleteNode(root.left, key);
        else if (root.val < key) root.right = deleteNode(root.right, key);
        else {
            if (root.right == null) return root.left;
            if (root.left == null) return root.right;
            root.right = deleteMin(root.right);
            root.val = this.val;
            return root;
        }
        return root;
    }
}
