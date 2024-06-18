package mr.green.learning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RomanToIntegerTest {
    
    private final RomanToInteger converter = new RomanToInteger();

    @Test
    void onlySingleNumbers() {
        int convertedNumber = converter.romanToInt("III");

        assertThat(convertedNumber).isEqualTo(3);
    }

    @Test
    void onlyBinaryNumbers() {
        int convertedNumber = converter.romanToInt("IX");

        assertThat(convertedNumber).isEqualTo(9);
    }

    @Test
    void binaryAndSingleNumber() {
        int convertedNumber = converter.romanToInt("MCMXCIV");

        assertThat(convertedNumber).isEqualTo(1994);
    }
}
