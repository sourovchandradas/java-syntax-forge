# Continue Statement in Java

## Overview

In Java, the **`continue` statement** is a control transfer statement used inside iteration loops (`for`, `while`, and `do-while`) to skip the execution of the remaining statements in the current iteration cycle and jump directly to the next iteration.

This guide covers:
* **Syntax and mechanics** - control transfer behavior across different loop constructs
* **Jump target differences** - control flow targeting update statements versus boolean expressions
* **Foundational usage examples** - skipping specific iterations in `for`, `while`, and `do-while` loops
* **Nested loops & labeled `continue**` - controlling execution pathways across outer and inner loops
* **`break` vs. `continue` comparison** - contrasting loop termination with iteration skipping
* **Common mistakes and pitfalls** - preventing infinite loops caused by skipped counter increments
* **Technical interview Q&A** - JVM bytecode jump mechanics and best practices

---

## Table of Contents

1. [Basic Syntax and Control Transfer Mechanics](#basic-syntax-and-control-transfer-mechanics)
2. [Execution Flow Across Loop Types](#execution-flow-across-loop-types)
3. [Foundational Usage Examples](#foundational-usage-examples)
4. [Nested Loops and Labeled continue](#nested-loops-and-labeled-continue)
5. [Common Mistakes](#common-mistakes)
6. [Exercises](#exercises)
7. [Quick Reference](#quick-reference)
8. [Related Topics](#related-topics)
9. [Why This Matters](#why-this-matters)
10. [Additional Resources](#additional-resources)

---

## Basic Syntax and Control Transfer Mechanics

### What is the continue Statement?

The `continue` keyword instructs the Java Virtual Machine (JVM) to immediately bypass any remaining code statements within the current iteration body of a loop and re-evaluate the loop's continuation state for the subsequent cycle.

### Syntax

```java
// Unlabeled continue
continue;

// Labeled continue (used in nested loops)
continue labelName;
```

### Jump Targets by Loop Construct

The destination control path triggered by `continue` varies depending on the loop structure in which it resides:
* **`for` loop:** Control jumps directly to the **update statement** (e.g., `i++`), after which the termination condition is re-evaluated.
* **`while` loop:** Control jumps directly to the **boolean condition expression** at the top of the loop.
* **`do-while` loop:** Control jumps directly to the **boolean condition expression** evaluated at the bottom of the loop.

---

## Execution Flow Across Loop Types

### Control Flow Diagram (`for` loop with `continue`)

```text
       [1. Loop Condition Check] ---- (false) ----> [Exit Loop]
                 |
              (true)
                 v
       [2. Execute Body Statements]
                 |
        (if condition met)
                 |
                 +---> [continue;]
                 |         |
                 v         v
       [3. Bypassed Code]  +-----> [4. Update Statement (i++)]
                                            |
                                            v
                                 [Re-evaluate Condition Check]
```

---

## Foundational Usage Examples

### 1. `continue` Inside a `for` Loop

In a `for` loop, hitting `continue` skips the remainder of the loop body and transfers control directly to the loop's update step.

```java
public class ForContinueDemo {
    public static void main(String[] args) {      
        // Iterating from 0 to 5
        for (int i = 0; i <= 5; i++) {
            // Skip execution when i equals 3
            if (i == 3) {
                continue; // Control jumps directly to i++
            }
          
            System.out.print(i + " ");
        }
    }
}
```

#### Output

```text
0 1 2 4 5 
```

---

### 2. `continue` Inside a `while` Loop

In a `while` loop, hitting `continue` jumps directly to the boolean condition check[cite: 1]. Therefore, loop counter variables must be updated **before** invoking `continue` to avoid infinite loop cycles[cite: 1].

```java
public class WhileContinueDemo {
    public static void main(String[] args) {
        int c = 0;
      
        // While loop iteration
        while (c <= 5) {          
            // Skip execution when c equals 3
            if (c == 3) {
                c++; // Increment counter prior to continue to prevent infinite loop
                continue; // Control jumps directly to (c <= 5)
            }

            System.out.print(c + " ");
            c++;
        }
    }
}
```

#### Output
```text
0 1 2 4 5 
```

---

### 3. `continue` Inside a `do-while` Loop

In a `do-while` loop, executing `continue` transfers control immediately to the boolean evaluation condition at the bottom of the structure[cite: 1].

```java
public class DoWhileContinueDemo {
    public static void main(String[] args) {        
        int i = 0;

        do {           
            // Skip execution when i equals 3
            if (i == 3) {
                i++; // Increment counter prior to continue
                continue; // Control jumps to while (i <= 5)
            }

            System.out.print(i + " ");
            i++;

        } while (i <= 5);
    }
}
```

#### Output
```text
0 1 2 4 5 
```

---

## Nested Loops and Labeled continue

### Standard Unlabeled `continue` in Inner Loops

When used inside an inner nested loop, an unlabeled `continue` statement affects only the execution of that specific inner loop[cite: 1].

```java
public class NestedLoopContinueDemo {
    public static void main(String[] args) {       
        // Outer loop
        for (int i = 1; i <= 4; i++) {
            // Inner loop
            for (int j = 1; j <= 3; j++) {               
                // Skip inner loop print statement when i == 3 and j == 2
                if (i == 3 && j == 2) {
                    continue; // Skips printing 3.2 and jumps to j++
                }

                System.out.print(i + "." + j + "  ");
            }
            
            System.out.println();
        }
    }
}
```

#### Output

```text
1.1  1.2  1.3  
2.1  2.2  2.3  
3.1  3.3  
4.1  4.2  4.3  
```

---

### Labeled `continue` for Outer Loop Control

A labeled `continue` allows an inner loop to skip the remainder of its execution and force the specified **outer loop** to jump directly to its update step.

```java
public class LabeledContinueDemo {
    public static void main(String[] args) {
        outerLoop: // Label attached to outer loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("\nSkipping remaining inner iterations for outer cycle i = " + i);
                    continue outerLoop; // Jumps directly to outer loop's i++
                }
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}
```

#### Output

```text
(1,1) (1,2) (1,3) 
(2,1) 
Skipping remaining inner iterations for outer cycle i = 2
(3,1) (3,2) (3,3) 
```

---

## Common Mistakes

### Mistake 1: Infinite Loops in `while` and `do-while` Loops

The most frequent bug when using `continue` inside `while` or `do-while` loops is forgetting to increment the iterator variable prior to executing `continue`.

```java
// INCORRECT: Causes an Infinite Loop
int i = 0;
while (i < 5) {
    if (i == 3) {
        continue; // Control jumps to (i < 5) without incrementing i! i remains 3 forever.
    }
    System.out.println(i);
    i++;
}
```

### Mistake 2: Unreachable Code Directly Following `continue`

Placing code directly after an unconditional `continue` statement results in a compilation error.

```java
for (int i = 0; i < 5; i++) {
    continue;
    System.out.println(i); // Compilation Error: Unreachable statement
}
```

---

## Exercises

### Exercise 1: Skipping Odd Numbers

Write a program named `EvenNumberPrinter` that loops from 1 to 10 and uses `continue` to print only even numbers.

* **Solution:** [Exercise 01: Skipping Odd Numbers](labs/exercise-01.skipping_odd_numbers.java)

---

### Exercise 2: Matrix Negative Number Sanitizer

Write a program named `MatrixSanitizer` with a 2D integer array. Use nested loops and `continue` to process and print only positive matrix values.

* **Solution:** [Exercise 02: Matrix Negative Number Sanitizer](labs/exercise-02.matrix_negative_number_sanitizer.java)

---

## Quick Reference

| Loop Type | `continue` Jump Target | Critical Requirement |
| --- | --- | --- |
| `for` Loop | Update Expression (e.g., `i++`) | Counter updates automatically before next condition evaluation |
| `while` Loop | Boolean Condition Evaluation | Counter **must** be updated manually before calling `continue`<br> |
| `do-while` Loop | Boolean Condition Evaluation | Counter **must** be updated manually before calling `continue`<br> |
| Labeled `continue` | Specified Outer Loop's Update/Condition Step | Outer loop label must be defined directly above the target loop |

---

## Related Topics

* [Break Statement](../break_statement/break_statement.md)
* [Return Statement](../return_statement/return_statement.md)
* [Introduction to Array](../../introduction_to_array/introduction_to_array.md)

---

## Why This Matters

The `continue` statement provides fine-grained control over loop execution paths. By bypassing unnecessary statement execution within invalid or edge-case iterations, `continue` keeps main loop logic cleanly structured and avoids deeply nested `if` conditionals within iteration bodies.

---

## Additional Resources

* [GeeksforGeeks: Java Continue Statement](https://www.geeksforgeeks.org/java/continue-statement-in-java/)

---

## Key Takeaways

* `continue` skips the remaining body statements of the current iteration and jumps directly to the next cycle.
* In `for` loops, control transfers to the update statement; in `while`/`do-while` loops, control transfers to the boolean condition check.
* Always update loop counter variables before calling `continue` in `while` or `do-while` loops to avoid infinite loops.
* `finally` blocks in `try-catch-finally` structures always execute, even if a `continue` is triggered within the `try` or `catch` block.

---

*Last Modified : October 18, 2026*
