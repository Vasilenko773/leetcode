package mr.green.learning.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntersectionTwoLinkedListsTest {

    private final IntersectionTwoLinkedLists tested = new IntersectionTwoLinkedLists();

    @Test
    void intersectionExist() {
        ListNode four = new ListNode(4);
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        two.next = three;
        one.next = two;
        four.next = three;

        ListNode actualIntersection = tested.getIntersectionNode(one, four);

        assertThat(actualIntersection).isEqualTo(three);
    }
}