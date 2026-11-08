/*
 * PrintDebugging.java
 * CIS 1130 Week 4 Code Guide: finding a logic error with print statements
 *
 * This program SHOULD print the average of 4, 7, and 10, which is 7.0.
 * Run it as is: it prints the wrong answer. That's a LOGIC error: no crash,
 * no compiler message, just a wrong result.
 *
 * The DEBUG lines show how to hunt the bug down:
 *   1. Print the values going INTO each step.
 *   2. Compare them to what you expect.
 *   3. The first place they differ is where the bug lives.
 *
 * Read the comments at the bottom for the fix, then remove the DEBUG lines.
 *
 * Compile and run:
 *   javac PrintDebugging.java
 *   java PrintDebugging
 */
public class PrintDebugging {

    public static void main(String[] args) {
        double avg = average(4, 7, 10);
        System.out.println("Average: " + avg);     // expected 7.0
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("DEBUG sum = " + sum);   // 21: correct so far

        double result = sum / 3 * 1.0;
        System.out.println("DEBUG result = " + result);

        return result;
    }

    /*
     * WHAT HAPPENED?
     * With these inputs the answer happens to look right (21 / 3 = 7).
     * Change the call to average(4, 7, 8). The sum is 19, so the average should
     * be 6.33, but the program prints 6.0.
     *
     * The DEBUG lines show sum is correct, so the bug is on the next line:
     *     sum / 3 * 1.0
     * Java does sum / 3 FIRST, using integer division (19 / 3 = 6), and only
     * then multiplies by 1.0. The decimal is already gone.
     *
     * FIX:   double result = sum / 3.0;
     *
     * LESSON: a test that happens to pass (4, 7, 10) can hide a bug.
     * Always test with values where the answer has a decimal part.
     */
}
