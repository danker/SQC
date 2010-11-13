import java.math.BigDecimal;

/**
 * If you pay $4.00 for a latte that costs
 * $3.10, how much change do you get?
 */
public class Change {

    public static String displayCalculatedChange(BigDecimal amountTendered, BigDecimal itemCost) {

        BigDecimal change = amountTendered.subtract(itemCost);

        if (change.doubleValue() < 0.00) {
            return "Insufficient funds: $" + change.abs() + " more is needed.";
        } else {
            return "$" + change;
        }

    }

    public static void main(String args[]) {
        System.out.println(Change.displayCalculatedChange(new BigDecimal("4.00"), new BigDecimal("3.10")));
        System.out.println(Change.displayCalculatedChange(new BigDecimal("4.00"), new BigDecimal("5.10")));
    }
}