package top100;

import project.data_structure.Linked_List.ListNode;

import java.util.List;

/**
 * @author linwentao
 * @date 2022/2/17 6:41 PM
 */
public class Top14 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        } else if (lists.length == 1) {
            return lists[0];
        }

        ListNode head = mergeTwoLists(lists[0], lists[1]);
        for (int i = 2;i < lists.length;i++) {
            ListNode temp = mergeTwoLists(head, lists[i]);
            head = temp;
        }

        return head;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        if (list1 != null) {
            cur.next = list1;
        }

        if (list2 != null) {
            cur.next = list2;
        }

        return head.next;
    }
}
