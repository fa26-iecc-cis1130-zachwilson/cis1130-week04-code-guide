import java.util.Scanner;

/*
 * ReturnValueExamples.java
 * CIS 1130 Week 4 Code Guide: Chapter 6, methods that return values
 *
 * A method that returns a value is like a small calculator: you give it
 * inputs (arguments), and it hands back one answer (the return value).
 *
 * Good habit: methods that CALCULATE should return the answer, and let
 * main decide what to print. That makes them reusable and easy to test.
 *
 * Compile and run:
 *   javac ReturnValueExamples.java
 *   java ReturnValueExamples
 */
public class ReturnValueExamples {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit: ");
        double f = input.nextDouble();

        double c = toCelsius(f);                       // save the returned value
        System.out.printf("%.1f F is %.1f C%n", f, c);
        System.out.println("Freezing? " + isFreezing(c));
        System.out.println("Description: " + describe(c));

        // Returned values can be passed straight into another method.
        System.out.printf("Back to Fahrenheit: %.1f%n", toFahrenheit(toCelsius(f)));

        System.out.println("Larger of 8 and 13: " + larger(8, 13));
    }

    // Returns a double.
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double toFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    // Returns a boolean: perfect for yes/no questions.
    public static boolean isFreezing(double celsius) {
        return celsius <= 0;
    }

    // Returns a String. Every path through the method must return something.
    public static String describe(double celsius) {
        if (celsius <= 0) {
            return "freezing";
        } else if (celsius < 20) {
            return "cool";
        } else if (celsius < 30) {
            return "warm";
        } else {
            return "hot";
        }
    }

    // Two parameters, one return value.
    public static int larger(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }
}
