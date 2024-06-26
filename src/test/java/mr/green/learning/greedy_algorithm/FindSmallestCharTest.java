package mr.green.learning.greedy_algorithm;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FindSmallestCharTest {

    private final FindSmallestChar tested = new FindSmallestChar();

    @Test
    void firstCharSmallest() {
        char actualMin = tested.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'c');

        assertThat(actualMin).isEqualTo('f');
    }

}