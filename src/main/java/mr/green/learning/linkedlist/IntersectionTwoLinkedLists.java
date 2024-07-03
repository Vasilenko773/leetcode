package mr.green.learning.linkedlist;

public class IntersectionTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode linkToHeadB = headB;

        while (linkToHeadB != null) {
            ListNode linkToHeadA = headA;

            while (linkToHeadA != null) {
                if (linkToHeadB == linkToHeadA) {
                    return linkToHeadA;
                }
                linkToHeadA = linkToHeadA.next;
            }
            linkToHeadB = linkToHeadB.next;
        }
        return null;
    }
}
