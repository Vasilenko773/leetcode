package mr.green.learning;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class ValidPalindromeTest {

    private final ValidPalindrome tested = new ValidPalindrome();

    @ParameterizedTest
    @ValueSource(strings = { "abсba", " ", "A man, a plan, a canal: Panama"})
    void stringValidPalindrome(String candidate) {
        boolean isPalindrome = tested.isPalindrome(candidate);

        assertThat(isPalindrome).isTrue();
    }


    @ParameterizedTest
    @ValueSource(strings = { "0P", " ac", "ABCD"})
    void stringNotPalindrome(String candidate) {
        boolean isPalindrome = tested.isPalindrome(candidate);

        assertThat(isPalindrome).isFalse();
    }
}
