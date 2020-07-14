package project.data_structure.binary_search_tree.Insert_into_a_Binary_Search_Tree;

/**
 * @author wt
 * @create 2019-03-13 下午5:02
 */
public class Main {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (root.val < val) root.right = insertIntoBST(root.right, val);
        else if (root.val > val) root.left = insertIntoBST(root.left, val);
        return root;
    }
}
