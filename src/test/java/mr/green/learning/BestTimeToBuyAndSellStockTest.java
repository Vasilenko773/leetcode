package mr.green.learning;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BestTimeToBuyAndSellStockTest {

    BestTimeToBuyAndSellStock tested = new BestTimeToBuyAndSellStock();

    @Test
    void maxByIsNotEqualsZero() {
        int actualBuy = tested.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertThat(actualBuy).isEqualTo(5);
    }

    @Test
    void maxByIsEqualsZero() {
        int actualBuy = tested.maxProfit(new int[]{7,6,4,3,1});
        assertThat(actualBuy).isZero();
    }
}