package mr.green.learning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LinkedListCycleTest {

    private final LinkedListCycle tested = new LinkedListCycle();

    @Test
    void listContainsCycleLink() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        first.next = second;
        second.next = first;

        boolean isCycle = tested.hasCycle(first);

        assertThat(isCycle).isTrue();
    }

    @Test
    void listContainsCycleLink1() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        first.next = second;
        second.next = third;
        third.next = second;

        boolean isCycle = tested.hasCycle(first);

        assertThat(isCycle).isTrue();
    }

    @Test
    void listNotContainsCycleLink(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);

        first.next = second;

        boolean isCycle = tested.hasCycle(first);

        assertThat(isCycle).isFalse();
    }
}
