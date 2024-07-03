package mr.green.learning.linkedlist;

import lombok.ToString;

@ToString
public class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
