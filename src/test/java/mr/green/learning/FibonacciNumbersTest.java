package mr.green.learning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FibonacciNumbersTest {

    private final FibonacciNumbers tested = new FibonacciNumbers();

    @Test
    void testFibonacci() {
        int actual = tested.fib(4);

        assertThat(actual).isEqualTo(3);
    }

    @Test
    void testFibonacci1() {
        int actual = tested.fib(2);

        assertThat(actual).isEqualTo(1);
    }

    @Test
    void testFibonacci2() {
        int actual = tested.fib(3);

        assertThat(actual).isEqualTo(2);
    }
}
