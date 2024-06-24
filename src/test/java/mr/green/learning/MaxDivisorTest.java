package mr.green.learning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxDivisorTest {

    private final MaxDivisor tested = new MaxDivisor();

    @Test
    void test1() {
        int max = tested.max(18, 35);
        assertThat(max).isEqualTo(1);
    }

    @Test
    void test2() {
        int max = tested.max(14159572, 63967072);
        assertThat(max).isEqualTo(4);
    }

}