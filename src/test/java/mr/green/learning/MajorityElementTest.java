package mr.green.learning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MajorityElementTest {

    private final MajorityElement tested = new MajorityElement();

    @Test
    void majorityExist() {
        int actualMajority = tested.majorityElement(new int[]{1, 3, 3});

        assertThat(actualMajority).isEqualTo(3);
    }

    @Test
    void majorityNotExist() {
        int actualMajority = tested.majorityElement(new int[]{1, 3, 2});

        assertThat(actualMajority).isZero();
    }
}
