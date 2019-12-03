package project.data_structure.Linked_List.Reverse_Linked_List;

import project.data_structure.Linked_List.ListNode;

/**
 * @author linwt
 * @date 2019/11/1 14:52
 */

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        ListNode reverse = null;
        while (head != null) {
            ListNode temp = head;
            head = head.next;
            if (reverse == null) {
                reverse = temp;
                temp.next = null;
            } else {
                temp.next = reverse;
                reverse = temp;
            }
        }
        return reverse;
    }
}
