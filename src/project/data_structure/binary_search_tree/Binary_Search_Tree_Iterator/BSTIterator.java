package project.data_structure.binary_search_tree.Binary_Search_Tree_Iterator;

import project.data_structure.sample.In;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wt
 * @create 2019-03-13 下午4:40
 */
public class BSTIterator {
    private List<Integer> treeList = new ArrayList<>();
    private int next;

    private void add(TreeNode root) {
        if (root != null) {
            this.add(root.left);
            treeList.add(root.val);
            this.add(root.right);
        }
    }

    public BSTIterator(TreeNode root) {
        this.next = -1;
        this.add(root);
    }

    /**
     * @return the next smallest number
     */
    public int next() {
        this.next = this.next + 1 == treeList.size() ? 0 : (this.next + 1);
        return treeList.get(this.next);
    }

    /**
     * @return whether we have a next smallest number
     */
    public boolean hasNext() {
        return this.next != treeList.size() - 1;
    }
}
