package mr.green.learning.linkedlist;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PalindromeLinkedListTest {

    private final PalindromeLinkedList tested = new PalindromeLinkedList();

    @Test
    void palindromeLinkedList() {
        boolean isPalindrome = tested.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(1))));

        assertThat(isPalindrome).isTrue();
    }

    @Test
    void palindromeLinkedList1() {
        boolean isPalindrome = tested.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1)))));

        assertThat(isPalindrome).isTrue();
    }

    @Test
    void notPalindromeLinkedList() {
        boolean isPalindrome = tested.isPalindrome(new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(1)))));

        assertThat(isPalindrome).isFalse();
    }
}