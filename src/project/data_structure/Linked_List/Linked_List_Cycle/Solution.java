package project.data_structure.Linked_List.Linked_List_Cycle;

import project.data_structure.Linked_List.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author linwt
 * @date 2019/11/1 15:15
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head)) return true;
            else set.add(head);
            head = head.next;
        }
        return false;
    }
}
