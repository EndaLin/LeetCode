package project.data_structure.RBTree;

/**
 * 红黑白竖的特性
 * 1、每个节点不是红色就是黑色的；
 * 2、根节点总是黑色的；
 * 3、所有的叶节点都是是黑色的（红黑树的叶子节点都是空节点（NIL或者NULL））；
 * 4、如果节点是红色的，则它的子节点必须是黑色的（反之不一定）；
 * 5、从根节点到叶节点或空子节点的每条路径，必须包含相同数目的黑色节点（即相同的黑色高度）。确保没有一条路径会比其他路径长出俩倍。因而，红黑树是相对是接近平衡的二叉树。
 *
 * @author wt
 * @See http://dandanlove.com/2018/03/18/red-black-tree/
 * @create 2019-03-20 下午3:52
 */
public class RBTree<T extends Comparable<T>> {
    // 根节点
    public RBNode<T> root = null;
    public static boolean RED = true;
    public static boolean BLACK = false;

    class RBNode<T extends Comparable<T>> {
        // 颜色
        boolean color;
        // 关键值
        T key;
        // 右子节点
        RBNode<T> right;
        //左子节点
        RBNode<T> left;
        // 父节点
        RBNode<T> parent;

        public RBNode(boolean color, T key, RBNode<T> right, RBNode<T> left, RBNode<T> parent) {
            this.color = color;
            this.key = key;
            this.right = right;
            this.left = left;
            this.parent = parent;
        }

        public T getKey() {
            return key;
        }

        @Override
        public String toString() {
            return "RBNode{" +
                    "color=" + color +
                    ", key=" + key +
                    ", right=" + right +
                    ", left=" + left +
                    ", parent=" + parent +
                    '}';
        }
    }

    /*************对红黑树节点x进行左旋操作 ******************
     *
     * 左旋示意图：对节点x进行左旋
     *     p                       p
     *    /                       /
     *   x                       y
     *  / \                     / \
     * lx  y      ----->       x  ry
     *    / \                 / \
     *   ly ry               lx ly
     * 左旋做了三件事：
     * 1. 将y的左子节点赋给x的右子节点,并将x赋给y左子节点的父节点(y左子节点非空时)
     * 2. 将x的父节点p(非空时)赋给y的父节点，同时更新p的子节点为y(左或右)
     * 3. 将y的左子节点设为x，将x的父节点设为y
     */
    public void leftRotate(RBNode<T> x) {
        if (x == null) return;
        RBNode<T> y = x.right;
        if (y == null) return;
        //1. 将y的左子节点赋给x的右子节点,并将x赋给y左子节点的父节点(y左子节点非空时)
        x.right = y.left;
        y = x;


        // 2. 将x的父节点p(非空时)赋给y的父节点，同时更新p的子节点为y(左或右)
        y.parent = x.parent;
        if (x.parent == null) {
            this.root = y;
        } else {
            if (x.parent.left == x) {
                x.parent.left = y;
            } else {
                x.parent.right = y;
            }
        }


        // 3. 将y的左子节点设为x，将x的父节点设为y
        y.left = x;
        x.parent = y;
    }

    /*************对红黑树节点y进行右旋操作 ******************
     *
     * 右旋示意图：对节点x进行左旋
     *      p                 p
     *     /                 /
     *    y                 x
     *   / \               / \
     *  x  ry    ----->   lx  y
     * / \                   / \
     *lx  ly                ly  ry
     *
     * 先弄子节点,再弄父节点
     */
    public void rightRotate(RBNode<T> y) {
        if (y == null) return;
        RBNode<T> x = y.left;
        if (x == null) return;

        y.left = x.right;
        x.right = y;

        x.parent = y.parent;
        if (y.parent == null) {
            this.root = x;
        } else {
            if (y.parent.left == y) {
                y.parent.left = x;
            } else {
                y.parent.right = x;
            }
        }

        y.parent = x;

    }
}
