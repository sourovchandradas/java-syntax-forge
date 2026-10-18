# Java Control Flow: The continue Statement

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

1. [Basic Syntax and Control Transfer Mechanics](https://www.google.com/search?q=%23basic-syntax-and-control-transfer-mechanics)
2. [Execution Flow Across Loop Types](https://www.google.com/search?q=%23execution-flow-across-loop-types)
3. [Foundational Usage Examples](https://www.google.com/search?q=%23foundational-usage-examples)
4. [Nested Loops and Labeled continue](https://www.google.com/search?q=%23nested-loops-and-labeled-continue)
5. [Break vs. Continue Comparison](https://www.google.com/search?q=%23break-vs-continue-comparison)
6. [Enterprise Implementation Examples](https://www.google.com/search?q=%23enterprise-implementation-examples)
7. [Common Mistakes and Code Smells](https://www.google.com/search?q=%23common-mistakes-and-code-smells)
8. [Technical Interview Questions & Answers](https://www.google.com/search?q=%23technical-interview-questions--answers)
9. [Exercises and Complete Solutions](https://www.google.com/search?q=%23exercises-and-complete-solutions)
10. [Quick Reference](https://www.google.com/search?q=%23quick-reference)
11. [Related Topics](https://www.google.com/search?q=%23related-topics)
12. [Why This Matters](https://www.google.com/search?q=%23why-this-matters)
13. [Additional Resources](https://www.google.com/search?q=%23additional-resources)

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
```[cite: 1]

#### Output

```text
0 1 2 4 5 
```[cite: 1]

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
```[cite: 1]

#### Output

```text
0 1 2 4 5 
```[cite: 1]

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
```[cite: 1]

#### Output

```text
0 1 2 4 5 
```[cite: 1]

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
```[cite: 1]

#### Output

```text
1.1  1.2  1.3  
2.1  2.2  2.3  
3.1  3.3  
4.1  4.2  4.3  
```[cite: 1]

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

## Break vs. Continue Comparison

`break` and `continue` serve distinct flow control purposes within Java loops:

* **`break`:** Exits the loop structure completely, transferring execution to the statement immediately following the loop.


* **`continue`:** Bypasses only the current iteration step and moves directly to the next cycle.



### Combined Implementation Example

```java
public class BreakAndContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // Skip processing when i is 3
            if (i == 3) {
                continue; // Skips printing 3
            }
          
            // Halt loop completely when i reaches 7
            if (i == 7) {
                break; // Terminates loop execution
            }
          
            System.out.print(i + " ");
        }
    }
}
```[cite: 1]

#### Output

```text
1 2 4 5 6 
```[cite: 1]

---

## Enterprise Implementation Examples

### Example 1: Data Pipeline Batch Processing with Incomplete Record Filtering

In production data processing pipelines, `continue` is used to skip malformed or corrupted records without halting the entire batch job.

```java
import java.util.Arrays;
import java.util.List;

public class DataBatchIngestionPipeline {

    public static void main(String[] args) {
        List<String> rawPayloads = Arrays.asList(
            "PAYLOAD_001:VALID",
            "PAYLOAD_002:CORRUPT",
            "PAYLOAD_003:VALID",
            "NULL",
            "PAYLOAD_005:VALID"
        );

        int processedCount = 0;
        int skippedCount = 0;

        for (String payload : rawPayloads) {
            // Filter out null or corrupt entries
            if (payload == null || payload.equals("NULL") || payload.contains("CORRUPT")) {
                System.out.println("Skipping invalid record: [" + payload + "]");
                skippedCount++;
                continue; // Immediately process next record
            }

            // Ingest valid record into pipeline
            System.out.println("Ingesting payload into database: " + payload);
            processedCount++;
        }

        System.out.println("Pipeline Summary: Processed = " + processedCount + ", Skipped = " + skippedCount);
    }
}

```

#### Output

```text
Ingesting payload into database: PAYLOAD_001:VALID
Skipping invalid record: [PAYLOAD_002:CORRUPT]
Ingesting payload into database: PAYLOAD_003:VALID
Skipping invalid record: [NULL]
Ingesting payload into database: PAYLOAD_005:VALID
Pipeline Summary: Processed = 3, Skipped = 2

```

---

## Common Mistakes and Code Smells

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

## Technical Interview Questions & Answers

### Q1: What happens under the hood in Java Bytecode when a `continue` statement is executed?

**Answer:**
At the Java Bytecode level, the `continue` statement compiles into an unconditional jump instruction, typically **`goto`**. The target instruction address of the `goto` depends on the loop type:

* In a **`for` loop**, the `goto` points to the instruction sequence executing the update step (e.g., `iinc`).
* In a **`while` or `do-while` loop**, the `goto` points directly to the evaluation instruction sequence checking the loop's boolean expression.

---

### Q2: How does `continue` behave within a `try-catch-finally` block inside a loop?

**Answer:**
If a `continue` statement is executed within a `try` or `catch` block inside a loop, the **`finally` block is guaranteed to execute** prior to control jumping to the loop's update step or condition check.

```java
for (int i = 1; i <= 3; i++) {
    try {
        if (i == 2) {
            continue;
        }
        System.out.println("Processing: " + i);
    } finally {
        System.out.println("Finally block executed for i = " + i);
    }
}

```

#### Output

```text
Processing: 1
Finally block executed for i = 1
Finally block executed for i = 2
Processing: 3
Finally block executed for i = 3

```

---

## Exercises and Complete Solutions

### Exercise 1: Skipping Odd Numbers

**Task:** Write a program named `EvenNumberPrinter` that loops from 1 to 10 and uses `continue` to print only even numbers.

```java
public class EvenNumberPrinter {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue; // Skip odd numbers
            }
            System.out.print(i + " ");
        }
    }
}

```

#### Output

```text
2 4 6 8 10 

```

---

### Exercise 2: Matrix Negative Number Sanitizer

**Task:** Write a program named `MatrixSanitizer` with a 2D integer array. Use nested loops and `continue` to process and print only positive matrix values.

```java
public class MatrixSanitizer {
    public static void main(String[] args) {
        int[][] matrix = {
            { 1, -2,  3 },
            {-4,  5, -6 },
            { 7,  8, -9 }
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    continue; // Skip negative numbers
                }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

```

#### Output

```text
1 3 
5 
7 8 
```

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
* `break` exits the loop completely, whereas `continue` skips only the current iteration cycle.
* `finally` blocks in `try-catch-finally` structures always execute, even if a `continue` is triggered within the `try` or `catch` block.

---

*Last Modified : October 18, 2026*
