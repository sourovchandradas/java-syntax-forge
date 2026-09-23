# Syntax in Java

## Overview

Syntax is the set of rules that defines how a Java program is written, structured, and interpreted by the compiler. Because Java is a strongly typed, object-oriented programming language, adherence to proper syntax rules is strictly required for programs to compile and run.

This guide covers:
- **Class and File Structure** - Rules for naming files and declaring classes
- **The Main Method** - The official entry point of every Java program
- **Console Output** - Printing text
- **Statements and Braces** - Code blocks, semicolons, and syntax scope
- **Common Pitfalls** - Errors frequently made by beginners

---

## Table Of Contents

1. [Class and File Structure](#class-and-file-structure)
2. [The Main Method](#the-main-method)
3. [Console Output](#console-output)
4. [Statements and Syntax Rules](#statement-and-syntax-rules)
5. [Common Pitfalls](#common-pitfalls)
6. [Exercise](#exercise)

---

## Class and File Structure

### What is a Class in Java?
In Java, all code must reside inside a class. A Class servers as a container for your program's data and methods.

```Java
public class Main {
    // Code goes here
}
```
### Essential Naming Rules
**1. Exact Matching:** The name of the file must match the name of the `public class` exactly, including capitalization, followed by the `.java`
extension.
- If class name is `Main` -> File name: `Main.java`.
- If class name is `UserProfile` -> File name: `UserProfile.java`

**2. Case Sensitivity:** Java is strictly case-sensitive. `MyClass`, `myclass`, and `MYCLASS` are treated as entirely different identifiers.
**3. PascalCase Convention:** By standard convention, class names always start with an uppercase letter(e.g.,  `CalculatorDemo`).

---

## The Main Method

### The Entry Point
The `main()` method is the starting point execution for every standalone Java program. When you run a Java Class, the Java Virtual Machine(JVM) looks for this exact method to being running code.

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
| `static` | Belongs to the class itself (can be run without creating an instance/object) |
| `void` | Returns no value after execution |
| `main` | The mandatory name recognized by the Java runtime |
| `String[] args` | Array used to accept command-line arguments |

---

## Console Output

### Printing to the Console
Java uses the built-in `system` class to display information on the screen:

```java
// Prints and moves the cursor to a new line
System.out.println("Hello, World!");

// Prints text on the same line without moving to a new line
System.out.println("Loading... ");
```

## Statements and Syntax Rules

### Semicolons `;`
In Java, every individual instruction or statement **must end with a semicolon**. Omitting a semicolon will cause a compilation error.

```java
System.out.println("Hello, World!");
```
### Code Blocks `{}`
Curly braces define the start and end boundaries of classes, methods, loops, and conditional statements.
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

### Comments
Comments are ignored by the complier and are used to document code.

```java
// This is a single-line comment

/*
    This is a
    multi-line comment
*/
```
