/*
 * OverloadingExamples.java
 * CIS 1130 Week 4 Code Guide: Chapter 6, method overloading
 *
 * OVERLOADING means several methods share the same name but have different
 * parameter lists (a different number of parameters, or different types).
 * Java picks the right one based on the arguments you pass.
 *
 * You've already used overloading: System.out.println works with ints,
 * doubles, Strings, and more. Those are all different println methods!
 *
 * Note: the return type alone is NOT enough to overload a method.
 *
 * Compile and run:
 *   javac OverloadingExamples.java
 *   java OverloadingExamples
 */
public class OverloadingExamples {

    public static void main(String[] args) {
        System.out.println(area(5));            // calls area(double): a square
        System.out.println(area(4, 6));         // calls area(double, double): a rectangle

        System.out.println(average(80, 90));          // two values
        System.out.println(average(80, 90, 100));     // three values

        printLabel("Total");                    // uses a default width
        printLabel("Total", 20);                // uses the width you give it
    }

    // Same name, ONE parameter: area of a square.
    public static double area(double side) {
        return side * side;
    }

    // Same name, TWO parameters: area of a rectangle.
    public static double area(double length, double width) {
        return length * width;
    }

    public static double average(double a, double b) {
        return (a + b) / 2;
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    // A common trick: the shorter version calls the longer one with a default.
    public static void printLabel(String text) {
        printLabel(text, 10);
    }

    public static void printLabel(String text, int width) {
        System.out.printf("%-" + width + "s|%n", text);
    }
}
