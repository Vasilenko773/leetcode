package mr.green.learning;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SummaryRangesTest {

    private final SummaryRanges tested = new SummaryRanges();

    @Test
    void rangesSizeThree() {
        List<String> actualRanges = tested.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});

        assertThat(actualRanges)
                .isNotEmpty()
                .containsAll(List.of("0->2", "4->5", "7"));
    }

    @Test
    void rangesSizeThree1() {
        List<String> actualRanges = tested.summaryRanges(new int[]{0,2,3,4,6,8,9});

        assertThat(actualRanges)
                .isNotEmpty()
                .containsAll(List.of("0", "2->4", "6", "8->9"));
    }

    @Test
    void rangesSizeThree2() {
        List<String> actualRanges = tested.summaryRanges(new int[]{0,1,2});

        assertThat(actualRanges)
                .isNotEmpty()
                .containsAll(List.of("0->2"));
    }
}
