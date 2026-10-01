# Variables in Java

## Table of Contents
- [Overview](#overview)
- [Learning Objectives](#learning-objectives)
- [Content](#content)
- [Related Topics](#related-topics)
- [Practice Exercises](#practice-exercises)
- [Additional Resources](#additional-resources)
- [Last Modified](#last-modified)

---

## Overview

This section focuses on the Java variable system, one of the most important foundations of Java programming. Variables are used to store data, pass information between operations, and make programs dynamic and useful.

In Java, each variable has a type, a name, and a value. Understanding variables correctly is essential for writing clean and functional code.

---

## Learning Objectives

By the end of this topic, you should be able to:
- explain what a variable is
- declare variables using different data types
- assign values to variables
- print variables to the console
- understand string concatenation and arithmetic operations
- use constants with the `final` keyword
- follow Java naming conventions
- avoid common beginner mistakes

---

## Content

### 1. What Are Variables?

Variables are containers that store data values.

A variable can be thought of as a labeled box that holds information.

```java
int age = 25;
String name = "John";
```

---

### 2. Java Data Types

Java variables can store different kinds of data.

```java
String name = "Hello";
int age = 25;
float price = 19.99f;
char letter = 'A';
boolean isStudent = true;
```

#### Common Data Types
- `String` - stores text
- `int` - stores integers
- `float` - stores decimal numbers
- `char` - stores a single character
- `boolean` - stores `true` or `false`

---

### 3. Declaring Variables

The basic syntax is:

```java
type variableName = value;
```

Example:

```java
int myNum = 15;
String name = "John";
```

You can also declare a variable first and assign its value later:

```java
int myNum;
myNum = 15;
System.out.println(myNum);
```

You can also reassign a variable:

```java
int myNum = 15;
myNum = 20;
System.out.println(myNum); // 20
```

---

### 4. Displaying Variables

Use `System.out.println()` to print variables:

```java
String name = "John";
System.out.println(name);
```

You can also combine text and variables:

```java
String name = "John";
System.out.println("Hello " + name);
```

Output:

```text
Hello John
```

---

### 5. String Concatenation

The `+` operator can join strings together:

```java
String firstName = "John";
String lastName = "Doe";
String fullName = firstName + lastName;
System.out.println(fullName);
```

Output:

```text
JohnDoe
```

For numbers, `+` adds values:

```java
int x = 5;
int y = 6;
System.out.println(x + y); // 11
```

---

### 6. Mixing Text and Numbers

This is a common source of confusion.

```java
int x = 5;
int y = 6;
System.out.println("The sum is " + x + y);
```

Output:

```text
The sum is 56
```

But with parentheses:

```java
int x = 5;
int y = 6;
System.out.println("The sum is " + (x + y));
```

Output:

```text
The sum is 11
```

This happens because Java joins strings one by one unless parentheses force arithmetic to happen first.

---

### 7. Declaring Multiple Variables

You can declare more than one variable of the same type in one line:

```java
int x = 5, y = 6, z = 50;
System.out.println(x + y + z); // 61
```

You can also assign the same value to multiple variables:

```java
int x, y, z;
x = y = z = 50;
System.out.println(x + y + z); // 150
```

---

### 8. Identifiers and Naming Rules

Identifiers are the names given to variables.

Examples:

```java
int age = 25;
String firstName = "John";
```

#### Rules
- names can contain letters, digits, underscores, and dollar signs
- names cannot start with a digit
- names cannot contain spaces
- names cannot use reserved Java keywords
- names are case-sensitive

#### Invalid Example

```java
int 2ndNumber = 5;  // invalid
int my var = 10;    // invalid
int int = 20;       // invalid
```

---

### 9. Naming Conventions

Use meaningful names and follow Java conventions.

#### Regular Variables
Use `camelCase`:

```java
int studentAge = 21;
String firstName = "John";
```

#### Constants
Use `UPPER_CASE`:

```java
final int MINUTES_PER_HOUR = 60;
final int BIRTHYEAR = 1980;
```

---

### 10. Constants with `final`

Use `final` when a variable should never change.

```java
final int myNum = 15;
```

This causes an error:

```java
myNum = 20;
```

Example error:

```text
cannot assign a value to final variable 'myNum'
```

Use `final` for values like:
- `PI`
- `MINUTES_PER_HOUR`
- `BIRTHYEAR`

---

### 11. Common Mistakes

#### Mistake 1: Reassigning a final variable
```java
final int MAX_USERS = 100;
MAX_USERS = 150; // error
```

#### Mistake 2: Not initializing a final variable
```java
final int MAX_USERS; // error
```

#### Mistake 3: Wrong concatenation logic
```java
int x = 5, y = 6;
System.out.println("Sum is " + x + y); // prints 56
```

Correct version:

```java
System.out.println("Sum is " + (x + y)); // prints 11
```

---

### 12. Real-World Example

```java
public class StudentRecord {
    final String UNIVERSITY_NAME = "BUBT";
    final int CURRENT_YEAR = 2024;
    final double GPA_SCALE = 4.0;
    final int MAX_CREDITS_PER_SEMESTER = 18;

    public static void main(String[] args) {
        StudentRecord record = new StudentRecord();

        System.out.println("University: " + record.UNIVERSITY_NAME);
        System.out.println("Current Year: " + record.CURRENT_YEAR);
        System.out.println("GPA Scale: " + record.GPA_SCALE);
        System.out.println("Max Credits: " + record.MAX_CREDITS_PER_SEMESTER);
    }
}
```

---

### 13. Key Points to Remember

- Variables store values
- Java has different data types
- Use `type variableName = value;`
- Names must follow identifier rules
- Use uppercase for constants
- Use `final` for values that should not change
- Be careful when mixing numbers and strings

---

### 14. Practice Questions

#### Q1: What is a variable?
A variable is a named container used to store data.

#### Q2: What are some common data types in Java?
`String`, `int`, `float`, `char`, and `boolean`.

#### Q3: Why do we use `final`?
To make a variable constant and prevent reassignment.

#### Q4: What is the naming convention for constants?
Use `UPPER_CASE` names.

#### Q5: What is the result of this code?
```java
int x = 5;
int y = 6;
System.out.println("Result: " + (x + y));
```

Answer:

```text
Result: 11
```

---

## Related Topics

After this topic, the next related Java topics are:
- Data Type Conversion (Casting)
- Operators in Java
- Control Flow (`if`, `else`, `switch`)
- Loops (`for`, `while`)
- Methods and Functions
- Object-Oriented Programming (OOP)

---

## Practice Exercises

### Exercise 1: Declare variables
Write a Java program that declares:
- an `int` for age
- a `String` for name
- a `boolean` for whether the student is active

Print all of them.

### Exercise 2: Concatenation
Create variables for `firstName` and `lastName`, then print the full name using concatenation.

### Exercise 3: Constants
Create a program with:
- `final int MINUTES_PER_HOUR = 60;`
- `final int DAYS_PER_WEEK = 7;`

Print both values.

### Exercise 4: Common Mistake Check
Write code to demonstrate why parentheses are needed when mixing text and numbers.

---

## Additional Resources

* [w3schools](https://www.w3schools.com/java/java_variables.asp)

---

## Related Topics


---

*Last Modified : 1st October, 2026*
