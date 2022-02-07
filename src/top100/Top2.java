package top100;

import project.data_structure.Linked_List.ListNode;

import java.util.Objects;

/**
 * @author linwentao
 * @date 2022/2/7 6:38 PM
 */
public class Top2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode index = head;
        boolean addOne = false;

        while (Objects.nonNull(l1) && Objects.nonNull(l2)) {
            // create next
            ListNode next = new ListNode(0);
            int temp = addOne ? l1.val + l2.val + 1 : l1.val + l2.val;
            addOne = temp > 9;
            next.val = temp % 10;
            // next one
            index.next = next;
            index = next;
            l1 = l1.next;
            l2 = l2.next;
        }

        // if l1 non null
        while (Objects.nonNull(l1)) {
            int temp = addOne ? l1.val + 1 : l1.val;
            addOne = temp > 9;

            ListNode next = new ListNode(temp % 10);
            index.next = next;
            index = next;
            l1 = l1.next;
        }

        // if l2 non null
        while (Objects.nonNull(l2)) {
            int temp = addOne ? l2.val + 1 : l2.val;
            addOne = temp > 9;

            ListNode next = new ListNode(temp % 10);
            index.next = next;
            index = next;
            l2 = l2.next;
        }

        if (addOne) {
            ListNode next = new ListNode(1);
            index.next = next;
        }

        // return
        return head.next;
    }
}
