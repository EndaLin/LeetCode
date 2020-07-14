package project.data_structure.binary_search_tree.Search_in_a_Binary_Search_Tree;

/**
 * @author wt
 * @create 2019-03-13 下午4:55
 */
public class Main {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        if (root.val < val) return searchBST(root.right, val);
        else return searchBST(root.left, val);
    }
}
