package lab2;

public class OrderCalculator {
    /**
     * Calculates the total price of an order.
     * A 10% discount is applied when the subtotal reaches 1,000,000 VND.
     */
    public double calculateTotal(double[] prices) {
        double subtotal = 0;

        for (double price : prices) {
            subtotal += price;
        }

        if (subtotal >= 1_000_000) {
            return subtotal * 0.90;
        }

        return subtotal;
    }
}
