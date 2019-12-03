package project.data_structure.Linked_List.Merge_Two_Sorted_Lists;

import project.data_structure.Linked_List.ListNode;

/**
 * @author linwt
 * @date 2019/11/1 15:30
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        head.next = null;
        ListNode current = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        current.next = l1 != null ? l1 : l2;
        return head.next;
    }
}
