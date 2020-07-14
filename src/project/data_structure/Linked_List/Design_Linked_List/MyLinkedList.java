package project.data_structure.Linked_List.Design_Linked_List;

/**
 * @author wt
 * @create 2019-04-07 下午3:18
 */
public class MyLinkedList {

    // Definition for singly-linked list.
    class SinglyListNode {
        int val;
        SinglyListNode next;

        SinglyListNode(int x) {
            val = x;
        }
    }

    private SinglyListNode node;

    private int size;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        this.size = 0;
        this.node = null;
    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index + 1 > this.size) {
            return -1;
        } else {
            SinglyListNode cur = this.node;
            while (--index >= 0) {
                cur = cur.next;
            }
            return cur.val;
        }
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        SinglyListNode node = new SinglyListNode(val);
        if (this.node == null) {
            this.node = node;
        } else {
            node.next = this.node;
            this.node = node;
        }
        this.size++;
    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        SinglyListNode node = new SinglyListNode(val);
        if (this.node == null) {
            this.node = node;
        } else {
            SinglyListNode cur = this.node;
            int index = this.size;
            while (--index > 0) {
                cur = cur.next;
            }
            cur.next = node;
        }
        this.size++;
    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > this.size) {
            return;
        } else if (index == this.size) {
            addAtTail(val);
        } else if (index == 0) {
            addAtHead(val);
        } else {
            SinglyListNode pre = this.node;
            SinglyListNode cur = pre.next;
            while (--index > 0) {
                pre = cur;
                cur = cur.next;
            }
            pre.next = new SinglyListNode(val);
            pre.next.next = cur;
            this.size++;
        }
    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        if (index + 1 > this.size) {
            return;
        } else if (index == 0) {
            this.node = this.node.next;
        } else {
            SinglyListNode pre = this.node;
            SinglyListNode cur = pre.next;
            while (--index > 0) {
                pre = cur;
                cur = cur.next;
            }
            pre.next = cur.next;
        }
        this.size--;
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
        System.out.println(linkedList.get(1));            // returns 2
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.get(2));             // returns 3
    }
}
