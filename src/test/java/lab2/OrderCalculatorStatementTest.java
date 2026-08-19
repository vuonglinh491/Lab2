package lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class OrderCalculatorStatementTest {
    private final OrderCalculator calculator = new OrderCalculator();

    @Test
    void shouldCalculateSubtotalForNormalOrder() {
        assertEquals(450_000, calculator.calculateTotal(new double[]{100_000, 150_000, 200_000}));
    }

    @Test
    void shouldExecuteDiscountStatementForLargeOrder() {
        assertEquals(1_080_000, calculator.calculateTotal(new double[]{600_000, 600_000}));
    }
}
