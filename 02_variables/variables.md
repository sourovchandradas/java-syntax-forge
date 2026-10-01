# Java Variables - Complete Guide

This section covers the core concepts of Java variables, including declaration, data types, naming rules, and constants.

---

## 1. What Are Variables?

Variables are containers used to store data values in Java.

A variable has:
- a name
- a data type
- a value

Think of a variable as a labeled box that holds information.

### Example
```java
int age = 25;
String name = "John";
```

---

## 2. Java Data Types

Java variables come in different types depending on the kind of data you want to store.

### Common Data Types

```java
String name = "Hello";
int age = 25;
float price = 19.99f;
char letter = 'A';
boolean isStudent = true;
```

### Meaning of Each Type
- `String` - stores text in double quotes
- `int` - stores whole numbers
- `float` - stores decimals
- `char` - stores a single character in single quotes
- `boolean` - stores `true` or `false`

---

## 3. Declaring Variables

To declare a variable, use:

```java
type variableName = value;
```

### Example
```java
int myNum = 15;
String name = "John";
```

### Declare Without Initial Value
```java
int myNum;
myNum = 15;
System.out.println(myNum);
```

### Reassigning Values
```java
int myNum = 15;
myNum = 20;
System.out.println(myNum); // 20
```

This overwrites the previous value.

---

## 4. Printing Variables

Use `System.out.println()` to display a variable.

```java
String name = "John";
System.out.println(name);
```

### Combine Text and Variables
```java
String name = "John";
System.out.println("Hello " + name);
```

Output:
```text
Hello John
```

---

## 5. String Concatenation

The `+` symbol behaves differently depending on the data type.

### For Strings
It joins text together.

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

### For Numbers
It adds values mathematically.

```java
int x = 5;
int y = 6;
System.out.println(x + y); // 11
```

---

## 6. Mixing Text and Numbers

This is a very important concept.

### Without Parentheses
```java
int x = 5;
int y = 6;
System.out.println("The sum is " + x + y);
```

Output:
```text
The sum is 56
```

### With Parentheses
```java
int x = 5;
int y = 6;
System.out.println("The sum is " + (x + y));
```

Output:
```text
The sum is 11
```

Important: parentheses force Java to calculate the number expression first before concatenating it with text.

---

## 7. Multiple Variables

You can declare multiple variables of the same type in one line.

### Example
```java
int x = 5, y = 6, z = 50;
System.out.println(x + y + z); // 61
```

You can also assign the same value to multiple variables.

```java
int x, y, z;
x = y = z = 50;
System.out.println(x + y + z); // 150
```

---

## 8. Identifiers (Variable Names)

Identifiers are the unique names we give to variables.

### Good Examples
```java
int age = 25;
String firstName = "John";
float averageScore = 85.5f;
```

### Rules for Identifiers
- names can contain letters, digits, underscores, and dollar signs
- names must start with a letter, underscore, or dollar sign
- names cannot contain spaces
- names cannot use Java reserved keywords
- names are case-sensitive

### Invalid Examples
```java
int 2ndNumber = 5;   // cannot start with a digit
int my var = 10;     // cannot contain spaces
int int = 20;        // cannot use reserved keyword
```

---

## 9. Naming Conventions

### Regular Variables
Use `camelCase`.

```java
int studentAge = 21;
String firstName = "John";
```

### Constants
Use `UPPER_CASE` by convention.

```java
final int MINUTES_PER_HOUR = 60;
final int BIRTHYEAR = 1980;
```

### Descriptive Names
Use meaningful names instead of vague names.

```java
int minutesPerHour = 60; // good
int m = 60;              // unclear
```

---

## 10. Constants with `final`

If you do not want a variable's value to change, use the `final` keyword.

```java
final int myNum = 15;
```

Then this will cause an error:

```java
myNum = 20;
```

### Error Message
```text
cannot assign a value to final variable 'myNum'
```

### When to Use `final`
- for fixed values such as time units
- for constants like `PI`, `MAX_USERS`, or `BIRTHYEAR`

### Example
```java
final int MINUTES_PER_HOUR = 60;
final int BIRTHYEAR = 1980;
```

---

## 11. Common Mistakes

### Mistake 1: Reassigning a final variable
```java
final int MAX_USERS = 100;
MAX_USERS = 150; // error
```

### Mistake 2: Using lowercase for constants
```java
final int maxUsers = 100; // works, but not recommended
```

### Mistake 3: Forgetting to initialize final variable
```java
final int MAX_USERS; // error
```

### Mistake 4: Wrong string and number mixing
```java
int x = 5, y = 6;
System.out.println("Sum is " + x + y); // prints 56
```

Correct version:
```java
System.out.println("Sum is " + (x + y)); // prints 11
```

---

## 12. Real-World Example

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

## 13. Key Points to Remember

- Variables store data values
- Java has different data types
- Use `type variableName = value;` syntax
- You can declare a value later
- Variable names must follow identifier rules
- Use descriptive names for readability
- Use `final` for constants
- Constants should usually be written in uppercase

---

## 14. Practice Questions

### Q1: What is a variable?
A variable is a named container that stores data in memory.

### Q2: What is the difference between `int` and `float`?
`int` stores whole numbers, while `float` stores decimal values.

### Q3: What is the purpose of `final`?
It makes a variable constant and prevents reassignment.

### Q4: What is the naming convention for constants?
Use `UPPER_CASE` names.

### Q5: What will this print?
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

## 15. Summary

Java variables are the foundation of programming. Understanding how to declare, assign, display, name, and protect variables is essential for writing clean and correct Java programs.

This topic is important because almost every Java program uses variables in some form.

---

## 16. Quick Reference

```java
String name = "John";
int age = 25;
float price = 19.99f;
char grade = 'A';
boolean isStudent = true;

final int MAX_USERS = 100;
```

This is the core of Java variable usage.
