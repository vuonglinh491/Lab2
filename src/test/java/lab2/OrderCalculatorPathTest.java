package lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class OrderCalculatorPathTest {
    private final OrderCalculator calculator = new OrderCalculator();

    @Test
    void emptyOrderTakesNoDiscountPath() {
        assertEquals(0, calculator.calculateTotal(new double[]{}));
    }

    @Test
    void orderBelowDiscountThresholdTakesFalseBranch() {
        assertEquals(999_999, calculator.calculateTotal(new double[]{500_000, 499_999}));
    }

    @Test
    void orderExactlyAtThresholdTakesDiscountBranch() {
        assertEquals(900_000, calculator.calculateTotal(new double[]{1_000_000}));
    }

    @Test
    void largeMultiItemOrderLoopsSeveralTimesAndTakesDiscountBranch() {
        assertEquals(1_080_000, calculator.calculateTotal(new double[]{400_000, 300_000, 500_000}));
    }
}
