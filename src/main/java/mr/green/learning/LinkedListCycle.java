package mr.green.learning;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        Set<ListNode> passedNodes = new HashSet<>();
        while (head != null) {
            if (!passedNodes.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
