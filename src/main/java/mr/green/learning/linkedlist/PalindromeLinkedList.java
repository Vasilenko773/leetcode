package mr.green.learning.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeLinkedList {

    public boolean isPalindrome(ListNode head) {
        Deque<Integer> values = dequeFromListNode(head);

        while (!values.isEmpty() && values.size() != 1) {
            int headVal = values.pollFirst();
            int tailVal = values.pollLast();
            if (headVal != tailVal) {
                return false;
            }
        }
        return true;
    }

    private Deque<Integer> dequeFromListNode(ListNode source) {
        Deque<Integer> deque = new LinkedList<>();

        while (source != null) {
            deque.add(source.val);
            source = source.next;
        }
        return deque;
    }
}
