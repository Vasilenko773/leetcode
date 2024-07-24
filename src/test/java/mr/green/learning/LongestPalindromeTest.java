package mr.green.learning;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LongestPalindromeTest {

    private LongestPalindrome tested;

    @BeforeEach
    void initTested() {
        tested = new LongestPalindrome();
    }

    @Test
    void fillCharContainer () {
        int lengthPalindrome = tested.longestPalindrome("abcccccdd");

        assertThat(lengthPalindrome).isEqualTo(7);
    }

    @Test
    void textWithOneCharReturnOne () {
        int lengthPalindrome = tested.longestPalindrome("a");

        assertThat(lengthPalindrome).isEqualTo(1);
    }

    @Test
    void onlyOneCharIsValidPalindrome () {
        int lengthPalindrome = tested.longestPalindrome("aaaaaa");

        assertThat(lengthPalindrome).isEqualTo(6);
    }
}