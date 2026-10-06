# Variables in Java

## Table of Contents
- [Overview](#overview)
- [Learning Objectives](#learning-objectives)
- [Content](#content)
- [Practice Exercises](#practice-exercises)
- [Additional Resources](#additional-resources)
- [Related Topics](#related-topics)

---

## Overview

Variables are one of the most important concepts in Java. A variable is a named storage location in memory that holds a value. It allows us to store data, manipulate it, and reuse it throughout a program.

In Java, every variable must have:
- a type
- a name
- a value (at least after initialization)

Understanding variables is essential for writing correct Java programs.

---

## Learning Objectives

By the end of this topic, you should be able to:
- explain what a variable is
- declare variables using different data types
- assign values to variables
- print variables to the console
- use arithmetic and string concatenation correctly
- define constants using `final`
- follow Java naming conventions
- avoid common beginner mistakes

---

## Content

### 1. What Are Variables?

A variable is like a labeled box used to store information.

```java
int age = 25;
String name = "John";
```

Here:
- `age` is a variable name
- `int` is the variable type
- `25` is the value stored in the variable
- `name` stores text

Variables are useful because they let us reuse and update data.

---

### 2. Java Data Types

Java variables must have a declared type. The type tells Java what kind of data the variable can store.

```java
String name = "Hello";
int age = 25;
float price = 19.99f;
char letter = 'A';
boolean isStudent = true;
```

#### Common Data Types
- `String` - stores text
- `int` - stores whole numbers
- `float` - stores decimal numbers (use `f` suffix)
- `char` - stores a single character
- `boolean` - stores `true` or `false`

```java
String message = "Java is fun";
int score = 90;
float temperature = 36.5f;
char grade = 'A';
boolean passed = true;
```

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

You can also declare first and assign later:

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

This works because variables can change value unless they are declared `final`.

---

### 4. Printing Variables

Use `System.out.println()` to print variables:

```java
String name = "John";
System.out.println(name);
```

You can also combine text with variables:

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

The `+` operator is used to join strings together.

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

If you want a space between names:

```java
String fullName = firstName + " " + lastName;
System.out.println(fullName);
```

Output:

```text
John Doe
```

For numbers, `+` adds values:

```java
int x = 5;
int y = 6;
System.out.println(x + y); // 11
```

---

### 6. Mixing Text and Numbers

This is a common beginner mistake.

```java
int x = 5;
int y = 6;
System.out.println("The sum is " + x + y);
```

Output:

```text
The sum is 56
```

Why?
Because Java processes the string and number left to right. The first `+` joins the string with `x`, and then joins again with `y`.

But if you want arithmetic first, use parentheses:

```java
int x = 5;
int y = 6;
System.out.println("The sum is " + (x + y));
```

Output:

```text
The sum is 11
```

This is a very important Java concept.

---

### 7. Declaring Multiple Variables

You can declare multiple variables of the same type in one line:

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

Identifiers are names given to variables.

```java
int age = 25;
String firstName = "John";
```

#### Rules for identifiers
- can contain letters, digits, underscores, and dollar signs
- cannot start with a digit
- cannot contain spaces
- cannot use Java reserved keywords
- are case-sensitive

#### Examples

```java
int age = 25;         // valid
String firstName = "John"; // valid
int _score = 100;     // valid
int $amount = 50;     // valid
```

#### Invalid Examples

```java
int 2ndNumber = 5;   // invalid
int my var = 10;     // invalid
int int = 20;        // invalid
```

---

### 9. Naming Conventions

Java follows common naming rules to keep code readable.

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
final int DAYS_PER_WEEK = 7;
```

Good naming makes code easier to read and maintain.

---

### 10. Constants with `final`

Use `final` when a variable should never change after initialization.

```java
final int myNum = 15;
```

This will cause an error:

```java
myNum = 20;
```

Error example:

```text
cannot assign a value to final variable 'myNum'
```

Constants are useful for fixed values such as:
- `PI`
- `MINUTES_PER_HOUR`
- `DAYS_PER_WEEK`
- `MAX_SCORE`

```java
final double PI = 3.14159;
final int MAX_USERS = 100;
```

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

#### Mistake 4: Using invalid names
```java
int 2ndNumber = 5; // invalid
```

#### Mistake 5: Forgetting to initialize a variable before use
```java
int count; // declared but not assigned
System.out.println(count); // error
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

This example shows how variables and constants work together in a real Java class.

---

### 13. Key Points to Remember

- Variables store data
- Every variable has a type, name, and value
- Use `type variableName = value;` syntax
- Java variables must be initialized before use
- String concatenation uses `+`
- Parentheses change the order of operations
- Use `final` for constants
- Follow Java naming rules and conventions

---

### 14. Practice Questions

#### Q1: What is a variable?
A variable is a named container used to store data.

#### Q2: What are some common Java data types?
`String`, `int`, `float`, `char`, and `boolean`.

#### Q3: Why do we use `final`?
To make a variable constant and prevent reassignment.

#### Q4: What is the naming convention for constants?
Use `UPPER_CASE` names.

#### Q5: What is the output of the following code?
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

## Practice Exercises

### Exercise 1: Declare variables
Write a Java program that declares:
- an `int` for age
- a `String` for name
- a `boolean` for whether the student is active

Print all three values.

### Exercise 2: Concatenation
Create variables for `firstName` and `lastName`, then print the full name using concatenation.

### Exercise 3: Constants
Create a class with:
- `final int MINUTES_PER_HOUR = 60;`
- `final int DAYS_PER_WEEK = 7;`

Print both values.

### Exercise 4: Common Mistake Check
Write code to demonstrate why parentheses are needed when mixing text and numbers.

### Exercise 5: Reassignment Demo
Create a variable and show how its value can be changed. Then create a `final` variable and show the compile-time error when trying to reassign it.

---

## Additional Resources

* [W3Schools Java Variables](https://www.w3schools.com/java/java_variables.asp)
* [Oracle Java Tutorial - Variables](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html)
* [Java Documentation - Primitive Data Types](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)

---

## Related Topics

- Java Data Types
- Java Operators
- Java Control Flow
- Java Methods
- Java Classes and Objects

---

*Last Modified : 6th October, 2026*