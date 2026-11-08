import java.util.Scanner;

/*
 * ShippingCalculator.java
 * CIS 1130 Homework 3, Program 2 STARTER CODE
 *
 * This program is SUPPOSED to:
 *   - Ask for the order subtotal, the package weight in pounds, and the
 *     shipping zone (1, 2, or 3).
 *   - Keep asking for the zone until it is 1, 2, or 3.
 *   - Charge a base rate by zone (zone 1 = $5.00, zone 2 = $7.50,
 *     zone 3 = $10.00) plus $0.75 per pound.
 *   - Give FREE shipping when the subtotal is $50.00 or more.
 *   - Print the shipping cost and the order total, each with 2 decimal places.
 *
 * It contains 5 bugs: at least one syntax error, one runtime problem, and
 * several logic errors. Your job is to find and fix all of them.
 * See the Homework 3 page in Canvas for what to submit.
 */
public class ShippingCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Order subtotal: $");
        double subtotal = input.nextDouble();

        System.out.print("Package weight (lbs): ");
        double weight = input.nextDouble();

        System.out.print("Shipping zone (1, 2, or 3): ");
        int zone = input.nextInt();
        while (zone < 1 || zone > 3) {
            System.out.println("Zone must be 1, 2, or 3.");
            System.out.print("Shipping zone (1, 2, or 3): ");
        }

        double shipping = calculateShipping(weight, zone);
        shipping = applyFreeShipping(subtotal, shipping);

        System.out.printf("Shipping: $%.2f%n", shipping);
        System.out.printf("Total:    $%.2f%n", subtotal + shipping);
    }

    // Returns the base rate for a zone.
    public static double getBaseRate(int zone) {
        double base;
        switch (zone) {
            case 1:
                base = 5.00;
            case 2:
                base = 7.50;
                break;
            default:
                base = 10.00;
        }
        return base;
    }

    // Returns the base rate plus the per-pound charge.
    public static double calculateShipping(double weight, int zone) {
        double perPound = 3 / 4;
        return getBaseRate(zone) + perPound * weight
    }

    // Returns 0 if the order qualifies for free shipping; otherwise the
    // original shipping cost.
    public static double applyFreeShipping(double subtotal, double shipping) {
        if (subtotal > 50.00) {
            return 0.00;
        }
        return shipping;
    }
}
