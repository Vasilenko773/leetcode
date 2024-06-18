package mr.green.learning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlusOneTest {

    private final PlusOne tested = new PlusOne();

    @Test
    void increaseSizeIfLastNumNine() {
        int[] actual = tested.plusOne(new int[]{9, 9});

        assertThat(actual).isEqualTo(new int[]{1, 0, 0});
    }

    @Test
    void arraySizeIncrementIfTargetContainsThreeNines() {
        int[] actual = tested.plusOne(new int[]{9, 9, 9});

        assertThat(actual).isEqualTo(new int[]{1, 0, 0,0});
    }

    @Test
    void increaseSizeIfLastNumNine1() {
        int[] actual = tested.plusOne(new int[]{1, 2, 9, 9});

        int[] expected = new int[]{1, 3, 0, 0};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void increaseSizeIfLastNumNineAndFirstNotNine() {
        int[] actual = tested.plusOne(new int[]{1, 9});

        int[] expected = new int[]{2, 0};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void increaseSizeIfLastNumNineAndFirstNotNine1() {
        int[] actual = tested.plusOne(new int[]{2, 3, 4, 8, 3, 9});

        int[] expected = new int[]{2, 3, 4, 8, 4, 0};

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void arrayContainsOnlyNineSizeTwo() {
        int[] actual = tested.plusOne(new int[]{9});

        int[] expected = new int[]{1, 0};

        assertThat(actual).isEqualTo(expected);
    }
}
