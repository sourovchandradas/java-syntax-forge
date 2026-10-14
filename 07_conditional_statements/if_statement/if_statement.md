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


