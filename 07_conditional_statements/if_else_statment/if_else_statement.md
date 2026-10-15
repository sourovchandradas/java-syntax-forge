# if-else Statement in Java

## Overview

The `if-else` statement in Java programming language is a core decision-making tool used to control program execution flow based on runtime conditions. It allows your code to branch into two pathways: executing one block of code if a condition evaluates to `true`, and an alternative block if it evaluates to `false`. Additionally, `if-else` constructs can be nested within one another to evaluate multi-layered logical criteria.

This guide covers:

* **Basic `if-else` syntax** - executing alternative code paths based on boolean evaluation
* **Execution flow mechanics** - step-by-step logic paths for conditional branching
* **Nested `if-else` statements** - layering conditional checks for complex decision trees
* **The dangling else rule** - understanding how `else` blocks pair with `if` statements
* **Common mistakes and errors** - preventing syntax, scope, and logical errors

---

## Table of Contents

1. [Basic Syntax and Working](#basic-syntax-and-working)
2. [Implementation Example](#implementation-example)
3. [Execution Flow Mechanics](#execution-flow-mechanics)
4. [Nested if-else Statements](#nested-if-else-statements)
5. [The Dangling Else Rule](#the-dangling-else-rule)
6. [Common Mistakes and Errors](#common-mistakes-and-errors)
7. [Exercises](#exercises)
8. [Quick Reference](#quick-reference)
9. [Related Topics](#related-topics)
10. [Why This Matters](#why-this-matters)
11. [Additional Resources](#additional-resources)

---

## Basic Syntax and Working

### What is an if-else Statement?

While a simple `if` statement only executes code when a condition is met, an `if-else` statement provides a fallback pathway. If the expression inside the parentheses evaluates to `true`, the `if` block runs. If it evaluates to `false`, the `else` block runs instead.

### Syntax

```java
if (condition) {
    // Executes if condition is true
} else {
    // Executes if condition is false
}
```

---

## Implementation Example

### Basic if-else Control Flow

```java
public class if_else_statement {
    public static void main(String[] args) {
        int n = 10;

        if (n > 5) {
            System.out.println("The number is greater than 5.");
        } else {
            System.out.println("The number is 5 or less.");
        }
    }
}
```

### Output

```text
The number is greater than 5.
```

### Explanation

* The program declares an integer variable `n` initialized to `10`.
* The condition `n > 5` evaluates to `true` (since `10 > 5`), so Java executes the code inside the `if` block.
* The statements inside the `else` block are completely skipped.

---

## Execution Flow Mechanics

### Step-by-Step Control Flow

When Java processes an `if-else` statement, execution follows a deterministic sequence:

1. **Control Arrival:** Program execution enters the `if-else` structure.
2. **Condition Evaluation:** Java evaluates the boolean expression inside the condition `()`.
3. **Branch Selection:**
* If `true`, execution jumps directly to the `if` block body.
* If `false`, execution skips the `if` block and jumps to the `else` block body.


4. **Block Execution:** The statements within the selected block run sequentially.
5. **Resume Execution:** Program flow exits the `if-else` construct and continues with the subsequent lines of code.

---

## Nested if-else Statements

### What are Nested if Statements?

A nested `if` statement is an `if` construct placed inside the block of another `if` or `else` statement. This structure allows programs to evaluate dependent conditions sequentially.

### Syntax

```java
if (condition1) {
    if (condition2) {
        // Executes only when both condition1 and condition2 are true
    }
}
```

### Implementation Example

```java
public class NestedIf {
    public static void main(String[] args) {
        int a = 25;
        double w = 65.5;

        if (a >= 18) {
            if (w >= 50.0) {
                System.out.println("You are eligible to donate blood.");
            } else {
                System.out.println("You must weigh at least 50 kilograms to donate blood.");
            }
        } else {
            System.out.println("You must be at least 18 years old to donate blood.");
        }
    }
}
```

### Output

```text
You are eligible to donate blood.
```

### Explanation

* **Outer Check (`a >= 18`):** `25 >= 18` evaluates to `true`, granting access to the inner checks.
* **Inner Check (`w >= 50.0`):** `65.5 >= 50.0` evaluates to `true`, triggering the print statement `"You are eligible to donate blood."`.
* Had the weight been below `50.0`, the inner `else` block would have executed instead.

---

## The Dangling Else Rule

> **Note:** In Java, an `else` clause always pairs with the **nearest unmatched `if` statement** in the same scope level, regardless of visual code indentation.

---

## Common Mistakes and Errors

### Mistake 1: Dangling Else Misinterpretation

Omitting curly braces in nested `if` structures can attach an `else` block to a different `if` than intended.

```java
// Incorrect: Indentation suggests else pairs with 'age >= 18', but Java pairs it with 'hasID'
int age = 15;
boolean hasID = true;

if (age >= 18)
    if (hasID)
        System.out.println("Entry granted");
else
    System.out.println("Underage!"); // Will NOT execute when age < 18!
```

**Correction:** Always use explicit curly braces to enforce scope:

```java
if (age >= 18) {
    if (hasID) {
        System.out.println("Entry granted");
    }
} else {
    System.out.println("Underage!"); // Now correctly executes when age < 18
}
```

### Mistake 2: Standalone else Without an if

An `else` keyword must directly follow its associated `if` block. Inserting independent code statements between an `if` block and an `else` keyword triggers a compilation error.

```java
// Incorrect: Intervening statement breaks the connection
if (score >= 50) {
    System.out.println("Pass");
}

System.out.println("Checking next student..."); // Breaks if-else continuity!

else {
    System.out.println("Fail");
}
```

### Compiler Error Output

```text
Error: 'else' without 'if'
```

---

## Exercises

File naming convention: Use descriptive, PascalCase class names (for example, `EvenOddCheck.java`).

### Exercise 1: Even or Odd Number

Write a class called `EvenOddCheck` with an integer variable `num`. Use an `if-else` statement to print `"The number is even."` if `num % 2 == 0`, and `"The number is odd."` otherwise.

### Exercise 2: Exam Pass/Fail Verification

Write a class called `GradeCheck` with an integer variable `score`. Use an `if-else` statement to print `"Passed"` if `score` is `50` or greater, and `"Failed"` if it is under `50`.

### Exercise 3: Blood Donation Criteria

Write a class called `BloodDonationCheck` with `age` and `weight` variables. Use nested `if-else` statements to print specific error messages if age is under `18` or weight is under `50.0` kg, and print `"Eligible to donate."` if both conditions are satisfied.

---

## Quick Reference

| Concept | Syntax / Pattern | Description |
| --- | --- | --- |
| Standard `if-else` | `if (cond) { ... } else { ... }` | Executes the `if` block if `true`, otherwise executes the `else` block |
| Nested `if-else` | `if (c1) { if (c2) { ... } }` | Layers conditional logic inside existing blocks for multi-step checks |
| Dangling Else | `if (c1) if (c2) stmt; else stmt;` | `else` automatically binds to the closest preceding unmatched `if` |
| Continuity Rule | `if (...) { ... } else { ... }` | No statements are allowed between the closing `}` of `if` and `else` |

---

## Related Topics

* [Java if Statement](https://www.google.com/search?q=../if_statement/if_statement.md)
* [Java if-else-if Ladder](https://www.google.com/search?q=../if_else_if_ladder/if_else_if_ladder.md)
* [suspicious link removed]

---

## Why This Matters

The `if-else` structure introduces binary branching to code execution, ensuring programs can handle both expected input pathways and alternative scenarios seamlessly. Understanding scope boundaries and nesting rules prevents common logic bugs, such as dangling-else errors, and provides the foundation for building complex state-driven software applications.

---

## Additional Resources

* [GeeksforGeeks](https://www.geeksforgeeks.org/java/java-if-else-statement-with-examples/)
* [w3schools](https://www.w3schools.com/java/java_conditions_elseif.asp)

---

*Last Modified : October 15, 2026*

---

## Key Takeaways

* An `if-else` statement guarantees that exactly one of two designated code blocks will execute.
* Nested `if-else` statements allow checking sequential dependencies in dynamic data.
* An `else` block implicitly binds to the nearest unmatched `if` statement within the same scope.
* Placed code between an `if` block and an `else` keyword causes a compilation error (`'else' without 'if'`).
