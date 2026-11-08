# CIS 1130 Week 4 Code Guide: Methods, Debugging, and Testing

Runnable, fully commented Java examples for **Week 4** of CIS 1130 Intro to Computer Science (IECC Online). Every file goes with a Week 4 Learning Guide in Canvas. Read the comments, run the program, then change something and run it again.

## How to use this repository

1. Open the course JupyterHub and start a **Terminal**.
2. Copy this repository into your workspace (you only need to do this once):

   ```
   git clone https://github.com/fa26-iecc-cis1130-zachwilson/cis1130-week04-code-guide.git
   cd cis1130-week04-code-guide
   ```

3. Move into a folder, then compile and run any example:

   ```
   cd chapter06-methods
   javac MethodBasics.java
   java MethodBasics
   ```

You can also just read the files here on GitHub. Select a file name to view it.

## What's inside

### Chapter 6: Methods

| File | What it shows | Try this |
|------|---------------|----------|
| `MethodBasics.java` | Defining and calling methods, parameters vs. arguments, void vs. returning methods | Write a method that prints your name inside a box of stars. |
| `ReturnValueExamples.java` | Methods that return double, boolean, and String; passing one method's result into another | Add a method that returns `true` if a temperature is a fever (above 100.4 F). |
| `ScopeExamples.java` | Where variables live, class constants, why parameters are copies, returning a changed value | Uncomment one of the ERROR lines and read the compiler message. |
| `OverloadingExamples.java` | Same method name with different parameter lists; a shorter version calling a longer one | Add an `area` method for a triangle. What problem do you run into? |

### Debugging and Testing

| File | What it shows | Try this |
|------|---------------|----------|
| `TestingMethods.java` | Unit testing methods with normal, edge, and invalid inputs, plus a PASS/FAIL helper | Break `discountFor` on purpose (change `>=` to `>`) and see which test catches it. |
| `PrintDebugging.java` | Tracking down a logic error with DEBUG print statements | Change the call to `average(4, 7, 8)` and follow the comments to fix the bug. |

### Homework 3 Starter Code

| File | What it is |
|------|------------|
| `homework3-starter/ShippingCalculator.java` | The buggy program for **Homework 3, Program 2**. Copy it into your own `hw03` repository and follow the instructions on the Homework 3 page in Canvas. |

## A note on your own work

These examples teach the concepts. They are **not** homework or project solutions, and your graded work must be written by you. See the Course Policies page in Canvas for the full academic integrity and AI rules.

Questions? Email Professor Wilson at wilsonz@iecc.edu.
