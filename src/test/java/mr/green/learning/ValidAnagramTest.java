package mr.green.learning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ValidAnagramTest {

    private final ValidAnagram tested = new ValidAnagram();

    @Test
    void validAnagram() {
        boolean isAnagram = tested.isAnagram("anagram", "nagaram");
        assertThat(isAnagram).isTrue();
    }

    @Test
    void notValidAnagram() {
        boolean isAnagram = tested.isAnagram("ab", "a");
        assertThat(isAnagram).isFalse();
    }
}