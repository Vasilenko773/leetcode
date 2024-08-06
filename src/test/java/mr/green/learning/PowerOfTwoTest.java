package mr.green.learning;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;


class PowerOfTwoTest {

    private final PowerOfTwo tested = new PowerOfTwo();

    @ParameterizedTest
    @ValueSource(ints = {8, 4, 16, 1})
    void squareNumberEndsWithZero(int number) {
        boolean isSquared = tested.isPowerOfTwo(number);

        assertThat(isSquared).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {9,3, 7})
    void squareNumberNotInteger(int number) {
        boolean isSquared = tested.isPowerOfTwo(number);

        assertThat(isSquared).isFalse();
    }
}