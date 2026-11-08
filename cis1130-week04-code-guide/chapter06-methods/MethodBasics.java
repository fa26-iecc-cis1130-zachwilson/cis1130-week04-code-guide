/*
 * MethodBasics.java
 * CIS 1130 Week 4 Code Guide: Chapter 6, defining and calling methods
 *
 * A METHOD is a named block of code that does one job. You define it once
 * and call it (run it) as many times as you need.
 *
 *   public static returnType methodName(parameters) {
 *       // body
 *   }
 *
 * For now, every method you write is "public static". You'll learn exactly
 * what those words mean in Week 6.
 *
 * Compile and run:
 *   javac MethodBasics.java
 *   java MethodBasics
 */
public class MethodBasics {

    // main is a method too! It's where every program starts.
    public static void main(String[] args) {

        // ---------- Calling a method with no parameters ----------
        printDivider();
        System.out.println("Welcome to Week 4!");
        printDivider();

        // ---------- Calling a method with parameters ----------
        // The values in the parentheses are ARGUMENTS. They are copied into
        // the method's PARAMETERS, in order.
        greet("Jordan");
        greet("Priya");

        printBox("Methods", 3);

        // ---------- Calling a method that RETURNS a value ----------
        // A return value comes back to where the method was called.
        // Save it in a variable or use it directly.
        int doubled = doubleIt(21);
        System.out.println("doubleIt(21) returned " + doubled);
        System.out.println("doubleIt(5) + 1 = " + (doubleIt(5) + 1));
    }

    // A void method does a job but returns nothing.
    public static void printDivider() {
        System.out.println("------------------------------");
    }

    // One parameter: a String called name.
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Two parameters, separated by a comma. Each needs its own type.
    public static void printBox(String label, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("[ " + label + " ]");
        }
    }

    // Returns an int. "return" sends the value back and ends the method.
    public static int doubleIt(int number) {
        return number * 2;
    }
}
