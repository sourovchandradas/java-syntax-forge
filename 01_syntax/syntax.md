# Syntax in Java

## Overview

Syntax is the set of rules that defines how a Java program is written, structured, and interpreted by the compiler. Because Java is a strongly typed, object-oriented programming language, adherence to proper syntax rules is strictly required for programs to compile and run.

This guide covers:
- **Class and File Structure** - Rules for naming files and declaring classes
- **The Main Method** - The official entry point of every Java program
- **Console Output and Input** - Printing text and reading user input
- **Statements and Braces** - Code blocks, semicolons, and syntax scope
- **Common Pitfalls** - Errors frequently made by beginners

---

## Table Of Contents

1. [Class and File Structure](#class-and-file-structure)
2. [The Main Method](#the-main-method)
3. [Console Output and Input](#console-output-and-input)
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
**1. Exact Matching:** The name of the file must match the name of the **public class** exactly, including capitalization, followed by the **.java**
                       extension.
                       - If class name is **Main** **->** File name: **Main.java**
                       - If class name is **UserProfile** **->** File name: **UserProfile.java**
**2. Case Sensitivity:** Java is strictly case-sensitive. **MyClass**, **myclass**, and **MYCLASS** are treated as entirely different identifiers.
**3. PascalCase Convention:** By standard convention, class names always start with an uppercase letter(e.g.,  **CalculatorDemo**).

---

## The Main Method

### The Entry Point
