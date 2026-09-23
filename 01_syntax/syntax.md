# Basic Syntax in Java

## Overview

Syntax is the set of rules that defines how a Java program is written, structured, and executed by the compiler. In Java, all instructions are organized inside classes, written as sequential statements, formatted for console output, and documented using comments. This guide unifies basic Java syntax rules, class structures, statement execution, output mechanisms, and commenting practices into a single comprehensive reference.

---

## Table of Contents

1. [Class and File Structure](#class-and-file-structure)
2. [The Main Method](#the-main-method)
3. [Java Statements and Semicolons](#java-statements-and-semicolons)
4. [Sequential Execution](#sequential-execution)
5. [Console Output](#Console-output)
6. [Printing Text vs Numbers and Calculations](#printing-text-vs-numbers-and-calculations)
7. [Java Comments](#java-comments)
8. [Code Blocks and Syntax Rules](#code-blocks-and-syntax-rules)
9. [Common Pitfalls](#common-pitfalls)
10. [Exercises](#exercise)
11. [Quick Reference](#quick-reference)

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

The `main()` method is required in every executable Java program. It serves as the starting point of execution for the Java Virtual Machine (JVM).

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

## Java Statements and Semicolons

### What is a Statement?

A computer program is a list of instructions executed by a computer. In Java, these programming instructions are called **statements**.

```java
System.out.println("Java is fun!");
```

### The Semicolon Rule

* Every individual Java statement **must end with a semicolon `;`**.
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

## Console Output: `println()` vs `print()`

Java provides two main methods inside `System.out` to output values or text to the screen.

### 1. The `println()` Method

Prints the output and automatically inserts a new line at the end of each call:

```java
System.out.println("Hello World!");
System.out.println("I am learning Java.");
System.out.println("It is awesome!");

```

**Output:**

```text
Hello World!
I am learning Java.
It is awesome!

```

### 2. The `print()` Method

Similar to `println()`, but it **does not insert a new line** at the end of the output. Subsequent outputs print on the same line:

```java
System.out.print("Hello World! ");
System.out.print("I will print on the same line.");

```

**Output:**

```text
Hello World! I will print on the same line.

```

> **Note:** An extra space is often added inside the quotes (e.g., `"Hello World! "`) to keep words separated when printing on the same line.

### 3. Double Quotes Rule for Text

Text strings **must** be wrapped inside double quotation marks `""`. Omitting double quotes causes a compilation error.

```java
System.out.println("This sentence will work!"); // Correct
System.out.println(This sentence will produce an error); // Syntax Error

```

---

## Printing Text vs Numbers and Calculations

### Printing Numbers

Unlike text, **numbers do not go inside double quotes**.

```java
System.out.println(3);
System.out.println(358);
System.out.println(50000);

```

### Mathematical Calculations

You can perform mathematical operations directly inside the `println()` method:

```java
System.out.println(3 + 3); // Outputs: 6
System.out.println(2 * 5); // Outputs: 10

```

> **Note:** If you place numbers inside double quotes (e.g., `System.out.println("3 + 3");`), Java treats it as literal text and prints `3 + 3` instead of calculating `6`.

---

## Java Comments

Comments are used to explain Java code, improve readability, and temporarily prevent execution when testing alternative code during debugging. Comments are completely ignored by the compiler.

### 1. Single-line Comments

* Starts with two forward slashes (`//`).
* Any text between `//` and the end of the line is ignored.
* Can be placed on its own line before code or at the end of an executable statement.

```java
// This is a comment before a line
System.out.println("Hello World");

System.out.println("Hello World"); // This is a comment at the end of a line

```

### 2. Multi-line Comments

* Starts with `/*` and ends with `*/`.
* All text written between `/*` and `*/` is ignored across multiple lines.

```java
/* The code below will print the words Hello World
to the screen, and it is amazing */
System.out.println("Hello World");

```

### Single vs. Multi-line Usage

* Use `//` for short, single-line explanations or inline notes.
* Use `/* */` for longer documentation blocks spanning multiple lines.

---

## Code Blocks and Syntax Rules

* **Code Blocks (`{}`):** Curly braces mark the beginning and end of a class, method, or control structure.
* **Statement Terminator (`;`):** Required at the end of every individual statement.

```java
public class CodeBlockDemo {
    public static void main(String[] args) {
        System.out.println("Inside main method block");
    }
}

```

---

## Common Pitfalls

1. **File Name Mismatch:** Saving `public class Main` in a file named `main.java` (case sensitivity error).
2. **Missing Semicolon:** Forgetting `;` at the end of a statement causes `error: ';' expected`.
3. **Missing Double Quotes on Text:** Writing `System.out.println(Hello World);` instead of `"Hello World"`.
4. **Quoting Math Operations:** Writing `System.out.println("3 + 3");` prints string `"3 + 3"` instead of evaluating `6`.
5. **Lowercase System Class:** Writing `system.out.println()` instead of `System.out.println()`.

---

## Exercises

File naming convention: Use PascalCase matching your public class name (e.g., `OutputPractice.java`).

### Exercise 1: Output and Math

Create a file named `OutputDemo.java` that outputs the following using `print()`, `println()`, text, numbers, and math:

```text
Item: Apple | Quantity: 5 | Total Cost: 50

```

*(Hint: Use `2 * 25` or `5 * 10` directly inside `println()` for the total cost).*

### Exercise 2: Debugging & Commenting

Fix all errors in `DebugPractice.java` and add a comment explaining each fix:

```java
public class DebugPractice {
    public static void main(String[] args) {
        system.out.println("Fix capitalization")
        System.out.println(Missing quotes);
        System.out.println("5 + 5"); // Change this to output the math result 10
    }
}

```

---

## Quick Reference

| Concept | Syntax / Rule | Example |
| --- | --- | --- |
| **Class Declaration** | Must match file name | `public class Main` $\rightarrow$ `Main.java` |
| **Main Method** | Execution entry point | `public static void main(String[] args)` |
| **Print Line** | Outputs text/value + new line | `System.out.println("Hello");` |
| **Print Same Line** | Outputs text/value without new line | `System.out.print("Hello ");` |
| **Text String** | Must be in double quotes `""` | `System.out.println("Text");` |
| **Numbers & Math** | No double quotes needed | `System.out.println(10 + 5);` |
| **Single-line Comment** | Starts with `//` | `// Explanation here` |
| **Multi-line Comment** | Starts with `/*` and ends with `*/` | `/* Multi-line explanation */` |
| **Statement Terminator** | Semicolon `;` | `int age = 23;` |

---

*Last Updated: 2026-09-23*
