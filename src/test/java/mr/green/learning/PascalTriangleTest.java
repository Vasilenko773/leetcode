package mr.green.learning;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PascalTriangleTest {

    private final PascalTriangle tested = new PascalTriangle();


    @Test
    void rowsNotEmpty() {
        List<Integer> actualRow = tested.getRow(2);

        assertThat(actualRow).isEqualTo(List.of(1, 2, 1));
    }


    @Test
    void getValidRowsWithIndexThree() {
        List<Integer> actualRow = tested.getRow(3);

        assertThat(actualRow).isEqualTo(List.of(1, 3, 3, 1));
    }
}
