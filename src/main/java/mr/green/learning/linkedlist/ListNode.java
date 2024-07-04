package mr.green.learning.linkedlist;

import lombok.ToString;

@ToString
public class ListNode {

    int val;
    ListNode next;

      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
