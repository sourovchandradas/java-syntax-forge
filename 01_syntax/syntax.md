# Java Basic Syntax & Statements

## Overview

Syntax is the set of rules that defines how a Java program is written, structured, and executed by the compiler. In Java, all instructions are organized inside classes and executed as sequential statements. This guide combines core Java syntax rules, class structures, and statement execution principles into a single reference.

---

## Table of Contents

1. [Class and File Structure](#class-and-file-structure&utm_source=gemini)
2. [The Main Method](#the-main-method)
3. [Console Output](#console-output)
4. [Statements and Semicolons](#statements-and-semicolons)
5. [Sequential Execution](#sequential-execution)
6. [Code Blocks and Comments](#code-blocks-and-comments)
7. [Common Pitfalls](#common-pitfalls)
8. [Exercises](#exercises)
9. [Quick Reference](#quick-reference)

---

## Class and File Structure

### What is a Class in Java?

In Java, **all code must reside inside a class**. A class serves as a container for your program's data and methods.

```java
public class Main {
    // Code goes here
}

```

### Essential Naming Rules

1. **Exact Matching:** The file name **must match** the name of the `public class` exactly, including capitalization, followed by the `.java` extension.
* Class `Main` -> File name: `Main.java`
* Class `UserProfile` -> File name: `UserProfile.java`


2. **Case Sensitivity:** Java is strictly case-sensitive. `MyClass`, `myclass`, and `MYCLASS` are treated as entirely different identifiers.
3. **PascalCase Convention:** By standard convention, class names always start with an uppercase letter (e.g., `CalculatorDemo`).

---

## The Main Method

### The Entry Point

The `main()` method is the starting point of execution for every standalone Java program. When you run a Java class, the Java Virtual Machine (JVM) looks for this exact method to begin execution.

```java
public class Main {
    public static void main(String[] args) {
        // Code inside main is executed sequentially
    }
}

```

### Method Keywords Breakdown

| Keyword | Meaning |
| --- | --- |
| `public` | Accessible from anywhere in the program |
| `static` | Belongs to the class itself (runs without creating an instance/object) |
| `void` | Returns no value after execution |
| `main` | The mandatory method name recognized by the Java runtime |
| `String[] args` | Array used to accept command-line arguments |

---

## Console Output

Java uses the built-in `System` class to display information on the screen:

```java
// Prints text and moves the cursor to a new line
System.out.println("Hello, World!");

// Prints text on the same line without moving to a new line
System.out.print("Loading... ");

```

---

## Statements and Semicolons

### What is a Statement?

A computer program is a list of instructions executed by a computer. In Java, these programming instructions are called **statements**.

```java
System.out.println("Java is fun!");

```

### The Semicolon Rule

* Every individual Java statement **must end with a semicolon `;**`.
* Think of a statement like an English sentence: just as sentences end with a period (`.`), Java statements end with a semicolon (`;`).
* Omitting a semicolon will cause a compilation error: `error: ';' expected`.

---

## Sequential Execution

When a Java program contains multiple statements, they are executed **sequentially**—one by one, in the exact top-to-bottom order in which they appear.

```java
public class StatementOrder {
    public static void main(String[] args) {
        System.out.println("Hello World!");          // Executed 1st
        System.out.println("Have a good day!");     // Executed 2nd
        System.out.println("Learning Java is fun!"); // Executed 3rd
    }
}

```

---

## Code Blocks and Comments

* **Code Blocks (`{}`):** Curly braces mark the beginning and end of a class, method, or control structure.
* **Single-line Comment:** `// This is a single-line comment`
* **Multi-line Comment:** `/* This is a multi-line comment */`

---

## Common Pitfalls

1. **File Name Mismatch:** Saving `public class Main` in a file named `main.java` (case sensitivity error).
2. **Missing Semicolon:** Forgetting `;` at the end of output or assignment statements.
3. **Lowercase System Class:** Writing `system.out.println()` instead of `System.out.println()`.

---

## Exercises

File naming convention: Use PascalCase matching your public class name (e.g., `SyntaxPractice.java`).

### Exercise 1: Sequential Execution

Create a file named `OrderDemo.java` and write three statements that output:

```text
Step 1: Learning Syntax
Step 2: Understanding Statements
Step 3: Executing Code

```

### Exercise 2: Fix Syntax Errors

Correct the errors in `FixMe.java`:

```java
public class FixMe {
    public static void main(String[] args) {
        system.out.println("Missing capitalization")
        System.out.println("Missing semicolon")
    }
}

```

---

## Quick Reference

| Concept | Rule / Description | Example |
| --- | --- | --- |
| **Class Name** | Must match file name exactly | `public class Main` -> `Main.java` |
| **Main Method** | Execution entry point | `public static void main(String[] args)` |
| **Statement** | Instruction ending with `;` | `System.out.println("Text");` |
| **Execution Flow** | Top-to-bottom order | Statement 1 -> Statement 2 |
| **Code Block** | Enclosed by curly braces | `{ /* code */ }` |

---
## Related Topic



---

## Additional Resources


---

*Last Updated: 23 September, 2026*
