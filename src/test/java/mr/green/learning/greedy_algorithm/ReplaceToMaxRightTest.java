package mr.green.learning.greedy_algorithm;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReplaceToMaxRightTest {

    private final ReplaceToMaxRight tested = new ReplaceToMaxRight();

    @Test
    void replaceNonSortedArray() {
        int[] actual = tested.replaceElements(new int[]{17, 18, 5, 4, 6, 1});

        assertThat(actual).isEqualTo(new int[]{18, 6, 6, 6, 1, -1});
    }

}