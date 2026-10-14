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
3. 


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


