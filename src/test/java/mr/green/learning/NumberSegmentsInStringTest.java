package mr.green.learning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NumberSegmentsInStringTest {

    private final NumberSegmentsInString tested = new NumberSegmentsInString();

    @Test
    void emptyStringReturnZero() {
        int expectedSegment = tested.countSegments("");

        assertThat(expectedSegment).isZero();
    }

}