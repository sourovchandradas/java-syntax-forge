# if Statements in Java 

## Overview

In Java programming language, an `if` statement is the simplest decision-making statement. It is used to execute a specific block of code **only when a designated condition evaluates to `true`**. If the condition evaluates to `false`, Java skips the block entirely and continues executing the remainder of the program.

This guide covers:
* **Basic syntax and working** - evaluating boolean conditions
* **Implementation styles** - using block scope vs single-statement forms
* **Control flow mechanics** - step-by-step execution path
* **Common mistakes and errors** - preventing logical pitfalls and compilation issues.

## Table of Contents
1. [Basic Syntax and Working](#basic-syntax-and-working)
2. [Implementation with Curly Braces](#implementation-with-curly-braces)
3. [Single-Statement if(Omitting Braces)](#single--statment-ifomitting-braces)
4. [Execution Flow Mechanics](#execution-flow-mechanics)
5. [Common Mistakes and Errors](#common-mistakes-and-errors)
6. [Exercises](#exercises)
7. [Quick Reference](#quick-reference)
8. [Related Topics](#related-topics)
9. [Why This Matters](#why-this-matters)
10. [Additional Resources](#additional-resources)
11. [Key Takeaways](#key-takeaways)

---

## Basic Syntax and Working

### What is an if statement?
The `if` statement allows a program to make decisions based on runtime conditions. The condition inside the parentheses must evaluate strictly to a **Boolean value(`true` or
`false`)**.

### Sytax
```java
if (condition) {
    // Statements executed if the condition is true
}
```

## Implementation with Curly Braces

### Using Block Scope
Enclosing code within **curly braces `{}`** creates a block scope. All statements contained inside the braces will execute sequentially whenever the condition in met.

### Implementation Example
```java
public class if_statements {
    public static void main(String[] args) {
        int a = 14;

        // Using if statement with curly braces
        if (a % 2 == 0) {
            System.out.println("14 is a even number.");
        }

        System.out.println("Outside if-block.");
    }
}
```

### Output
```text
14 is a even number.
Outside if-block.
```

### Explanation
* The condition `a % 2 == 0` evaluates to `true`(since `14` is divided into `2`), so Java executes the statement inside the `if` block.
* The second `System.out.println()` lies outside the block and executes regardless of the condition.

---

## Single-Statement if(Omitting Braces)

### Omitting Curly Braces
In Java, if curly braces `{}` are omitted after the `if` condition, **only the immediately following statement** is considered part of the `if` body.

### Implementation Example
```java
public class if_statements {
    public static void main(String[] args) {
        int a = 14;
        
        // Using if statement without curly braces
        if (a % 2 == 0)
            System.out.println("14 is a even number.");

        System.out.println("This statement runs regardless of if condition.");
    }
}
```

### Output
```text
14 is a even number.
This statement runs regardless of if condition.
```

### Explanation
* Only the first statement (`System.out.println("14 is a even number.";`) belongs to the `if` construct.
* The second statement is entirely independent and executes in all cases.

> **Note:** *While curly braces are optional for single-line statements, using them consistently is considered a software engineering best practice to prevent subtle bugs during code updates.*
>
> 

---

## Execution Flow Mechanics

### Step-by-Step Control Flow

When Java encounters an `if` statement during program execution, it processes the code in the following order:
1. **Control Arrival:** Execution reaches the `if` statement.
2. **Condition Evaluation:** The boolean expression inside `()` is evaluated.
3. **True Condition Branch:** If `true`, control enters the body and executes all statements inside.
4. **False Condition Branch:** If `false`, the program skips the body completely.
5. **Resume Execution:** Program flow resumes at the next statement following the `if` construct.

---

## Common Mistakes and Errors

### Mistake 1: Using Non-Boolean Condtions

Unlike languages like **C or C++**, Java does not convert integers(e.g., `0` or `1`)
to boolean values. Placing a non-boolean expression inside an if statement causes a compilation error.

```java
// Incorrect: Using an integer instead of a boolean
int x = 1;
if (x) {
    System.out.println("This will not compile");
}
```

### Error Output
```text
Error: incompatible types: int cannot be converted to boolean
```

### Mistake 2: Accidental Semicolon Placement
Placing a semicolon immediately after the `if` condition terminates the statement prematurely, causing the intended block to always execute.

```java
int i = 0;

// Incorrect: Semicolon after condition
if (i > 5); 
{
    System.out.println("i is greater than 5"); // Executes unexpectedly!
}
```

### Mistake 3: Misleading Indentation Without Braces

Relying on indentation rather than curly braces when writing multiple lines leads to logical errors.

```java
int score = 40;

// Incorrect: Only the first line is conditional
if (score >= 50)
    System.out.println("You passed!");
    System.out.println("Congratulations!"); // Executes even if score < 50
```

---

## Exercises
File naming convention: Use descriptive, PascalCase class names (for example,
`NumberCheck.java`).

### Exercise 01: Positive Number Check
Write a class called `PositiveCheck` that declares an integer variable `number`. Use an `if` statement to print `"The  number is positive."` only if the value is greater than zero.

* **Solution:** [Exercise 01: Positive Number Check](labs/exercise-01.positive_number_check.java)

### Exercise 02: Voting Eligibility
Write a class called `VotingCheck` with an integer variable `age`. Use an `if` statement with curly braces to print both `"Eligible to vote."` and `"Please register at your local precinct."` if age is 18 or greater.

* **Solution:** [Exercise 02: Voting Eligibility](labs/exercise-02.voting_eligibility.java)

### Exercise 03: Temperature Alert
Write a class called `TemperatureAlert` with a double variable `tempInCelsius`. If the temperature exceeds `37.5`, print a single warning sentence without using curly braces around the `if` body.

* **Solution:** [Exercise 03: Temperature Alert](labs/exercise-03.temperature.java)

---

## Quick Reference

| Concept | Syntax / Pattern | Description |
| --- | --- | --- |
| Standard `if` | `if (condition) { ... }` | Executes a block of statements if condition evaluates to `true` |
| Single-Statement `if` | `if (condition) statement;` | Omits `{}`; applies strictly to the next single statement |
| Boolean Condition | `if (i < 15)` | Requirement that condition evaluates strictly to `true` or `false` |
| Semicolon Pitfall | `if (condition);` | Prematurely terminates the `if` statement logic |

---

## Related Topics

* [Java if-else Statement](https://www.google.com/search?q=../if_else_statement/if_else_statement.md)
* [Java Switch Statement](https://www.google.com/search?q=../../04_control_flow/switch_statement/switch_statement.md)
* [Java Relational and Logical Operators](https://www.google.com/search?q=../../02_operators/relational_logical/relational_logical.md)

---

## Why This Matters

Conditional execution is the cornerstone of control flow in programming. Mastering the simple `if` statement enables your applications to dynamically evaluate data, validate user inputs, and branch execution pathways safely. Understanding syntax rules—such as strict boolean enforcement and scope management—prevents logic errors and maintains readable code.

---

## Additional Resources

* [GeeksforGeeks: Java if Statement](https://www.geeksforgeeks.org/java/java-if-statement-with-examples/)

---

## Key Takeaways

* The `if` statement evaluates a condition that must return a boolean `true` or `false`.
* Omitting curly braces `{}` restricts the `if` scope strictly to the single statement immediately following it.
* Non-boolean types (like integers) cannot be used as conditions in Java.
* Statements outside the `if` block execute sequentially regardless of whether the condition was met.

---

*Last Modified : October 14, 2025*


