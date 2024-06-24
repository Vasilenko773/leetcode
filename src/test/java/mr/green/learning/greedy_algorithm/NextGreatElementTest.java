package mr.green.learning.greedy_algorithm;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class NextGreatElementTest {

    private final NextGreatElement tested = new NextGreatElement();

    @Test
    void maxElementNext() {
        int[] actual = tested.nextGreaterElement(new int[]{4,1,2}, new int[] {1,3,4,2});
        assertThat(actual).isEqualTo(new int[]{-1,3,-1});
    }

    @Test
    void maxElementAtTheEndOfArray() {
        int[] actual = tested.nextGreaterElement(new int[]{1,3,5,2,4}, new int[] {6,5,4,3,2,1,7});
        assertThat(actual).isEqualTo(new int[]{7,7,7,7,7});
    }
}
