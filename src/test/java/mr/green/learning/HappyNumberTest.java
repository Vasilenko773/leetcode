package mr.green.learning;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class HappyNumberTest {

    private final HappyNumber tested = new HappyNumber();

    @ParameterizedTest
    @ValueSource(ints = {19, 7, 1111111})
    void targetIsHappyNumber(int num) {
        boolean isHappy = tested.isHappy(num);

        assertThat(isHappy).isTrue();
    }


    @Test
    void singleTargetIsNotHappyNumber() {
        boolean isHappy = tested.isHappy(2);

        assertThat(isHappy).isFalse();
    }
}
