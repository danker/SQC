import java.math.BigDecimal;

/**
 * If you pay $4.00 for a latte that costs
 * $3.10, how much change do you get?
 */
public class Change {
    public static void main(String args[]) {
        System.out.println("$" + new BigDecimal("4.00").subtract(new BigDecimal("3.10")));
    }
}