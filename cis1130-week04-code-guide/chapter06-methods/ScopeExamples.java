/*
 * ScopeExamples.java
 * CIS 1130 Week 4 Code Guide: Chapter 6, variable scope
 *
 * SCOPE is where in the code a variable exists and can be used.
 * Rule of thumb: a variable lives from where it's declared to the closing
 * brace } of the block it was declared in.
 *
 * Compile and run:
 *   javac ScopeExamples.java
 *   java ScopeExamples
 */
public class ScopeExamples {

    // A CONSTANT declared here, outside any method, can be used by every
    // method in the class.
    public static final double TAX_RATE = 0.07;

    public static void main(String[] args) {
        int score = 85;                    // local to main

        // Methods can't see main's variables. We have to PASS the value in.
        showScore(score);

        // A variable declared inside a block only exists inside that block.
        if (score > 80) {
            String message = "Great job!";  // exists only inside these braces
            System.out.println(message);
        }
        // System.out.println(message);    // ERROR: message doesn't exist here

        // A for loop's counter only exists inside the loop.
        for (int i = 1; i <= 3; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        // System.out.println(i);          // ERROR: i doesn't exist here

        // Parameters are COPIES. Changing one inside a method doesn't change
        // the original variable back in main.
        int points = 10;
        tryToChange(points);
        System.out.println("Back in main, points is still " + points);   // 10

        // To get a changed value back, RETURN it and save it.
        points = addBonus(points);
        System.out.println("After addBonus, points is " + points);       // 15

        System.out.printf("Tax on $40.00: $%.2f%n", taxOn(40.00));
    }

    public static void showScore(int value) {
        // "score" from main is not visible here, but the copy "value" is.
        System.out.println("Your score: " + value);
    }

    public static void tryToChange(int points) {
        points = 999;                       // changes only the local copy
        System.out.println("Inside the method, points is " + points);
    }

    public static int addBonus(int points) {
        return points + 5;
    }

    public static double taxOn(double amount) {
        return amount * TAX_RATE;           // the class constant is visible here
    }
}
