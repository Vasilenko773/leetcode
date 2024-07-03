package mr.green.learning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ContainsDuplicateTest {

    private final ContainsDuplicate tested = new ContainsDuplicate();

    @Test
    void differenceIndxDuplicatesLessTarget() {
        boolean duplicateExist = tested.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2);

        assertThat(duplicateExist).isFalse();
    }

    @Test
    void containsValidDuplicates() {
        boolean duplicateExist = tested.containsNearbyDuplicate(new int[]{1,0,1,1}, 1);

        assertThat(duplicateExist).isTrue();
    }

}