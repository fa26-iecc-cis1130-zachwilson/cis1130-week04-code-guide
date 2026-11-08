/*
 * TestingMethods.java
 * CIS 1130 Week 4 Code Guide: testing methods one at a time
 *
 * Professional developers test small pieces of code on their own before
 * putting them together. This is called UNIT TESTING.
 *
 * Here's a simple way to do it without any special tools: call a method with
 * inputs where you already KNOW the right answer, and compare.
 *
 * For each method, test three kinds of input:
 *   NORMAL  - a typical value
 *   EDGE    - the boundaries, like exactly 20.00 or exactly 0
 *   INVALID - values that shouldn't happen, like a negative quantity
 *
 * Compile and run:
 *   javac TestingMethods.java
 *   java TestingMethods
 */
public class TestingMethods {

    public static void main(String[] args) {
        System.out.println("=== Testing discountFor ===");
        check("normal: $10 order", discountFor(10.00), 0.00);
        check("edge: exactly $25", discountFor(25.00), 2.50);
        check("normal: $40 order", discountFor(40.00), 4.00);
        check("edge: just under $25", discountFor(24.99), 0.00);
        check("invalid: negative", discountFor(-5.00), 0.00);

        System.out.println("=== Testing lineTotal ===");
        check("normal: 3 x $2.50", lineTotal(2.50, 3), 7.50);
        check("edge: quantity 0", lineTotal(2.50, 0), 0.00);
        check("invalid: negative qty", lineTotal(2.50, -2), 0.00);
    }

    // The methods being tested ------------------------------------------

    // 10% off orders of $25.00 or more. Invalid (negative) orders get no discount.
    public static double discountFor(double subtotal) {
        if (subtotal >= 25.00) {
            return subtotal * 0.10;
        }
        return 0.00;
    }

    // Price times quantity. Quantities below 0 are treated as 0.
    public static double lineTotal(double price, int quantity) {
        if (quantity < 0) {
            return 0.00;
        }
        return price * quantity;
    }

    // A tiny test helper -------------------------------------------------
    // Compares money values to the nearest cent and prints PASS or FAIL.
    public static void check(String testName, double actual, double expected) {
        boolean passed = Math.abs(actual - expected) < 0.005;
        String result = passed ? "PASS" : "FAIL";
        System.out.printf("%-4s  %-26s expected %7.2f  got %7.2f%n",
                result, testName, expected, actual);
    }
}
