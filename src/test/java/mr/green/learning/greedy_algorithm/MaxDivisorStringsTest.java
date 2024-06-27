package mr.green.learning.greedy_algorithm;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxDivisorStringsTest {

    private final MaxDivisorStrings tested = new MaxDivisorStrings();

    @Test
    void targetStringContainedThreeChars() {
        String actual = tested.gcdOfStrings("ABCABC", "ABC");

        assertThat(actual).isEqualTo("ABC");
    }

    @Test
    void secondStringNotReturnResultGreaterFirst() {
        String actual = tested.gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX");

        assertThat(actual).isEqualTo("TAUXX");
    }

    @Test
    void targetStringContainedThreeChars1() {
        String actual = tested.gcdOfStrings("ABABABAB", "ABAB");

        assertThat(actual).isEqualTo("ABAB");
    }
}
