# Relational Operators in Java

## Overview

Relational operators (also known as comparison operators) in Java are used to compare two values, variables, or expressions. They evaluate the relationship between two operands and always return a primitive `boolean` result: either `true` or `false`. Relational operators are indispensable for decision-making and flow control in Java constructs like `if-else` branching, `while` loops, and `for` loops.

Java provides six standard relational operators:

* **Equal To (`==`)**
* **Not Equal To (`!=`)**
* **Greater Than (`>`)**
* **Less Than (`<`)**
* **Greater Than or Equal To (`>=`)**
* **Less Than or Equal To (`<=`)**

### What This Guide Covers
- **Equality & Comparison:** Syntax and mechanics of `==`, `!=`, `>`, `<`, `>=`, and `<=`.
- **Primitives vs. Reference Types:** Memory address comparison vs. content comparison (`.equals()`).
- **Floating-Point Pitfalls:** Safe `double` and `float` comparisons using Epsilon ($\epsilon$).
- **Precedence & Associativity:** Evaluation order in complex expressions.
- **Common Mistakes:** Chaining operators (`10 < x < 20`) and assignment vs. equality confusion.
- **Hands-on Examples & Practice:** Executable Java code, output tracing, and practice exercises with solutions.

---

## Table of Contents

1. [Equality and Inequality Operators (==, !=)](#equality-and-inequality-operators---)
2. [Comparison Operators (>, <, >=, <=)](#comparison-operators---)
3. [Comparing Primitives vs. Reference Types](#comparing-primitives-vs-reference-types)
4. [Floating-Point Comparison Pitfalls](#floating-point-comparison-pitfalls)
5. [Operator Precedence and Associativity](#operator-precedence-and-associativity)
6. [Full Implementation Example](#full-implementation-example)
7. [Why This Matters](#why-this-matters)
8. [Common Mistakes to Avoid](#common-mistakes-to-avoid)
9. [Practice Exercises](#practice-exercises)
10. [Quick Summary Table](#quick-summary-table)
11. [Related Topics](#related-topics)
12. [Additional Resources](#additional-resources)
13. [Key Takeaways](#key-takeaways)

---

## Equality and Inequality Operators (`==`, `!=`)

### Definition

The **Equal To** (`==`) operator checks if two operands are equal. The **Not Equal To** (`!=`) operator checks if two operands are not equal.

### Syntax

```java
boolean isEqual = (a == b);
boolean isNotEqual = (a != b);
```

### Operation on Primitives

When used on primitive numeric types (`byte`, `short`, `char`, `int`, `long`, `float`, `double`), these operators compare the actual **values** stored in memory.

### Code Example

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z = 20;

        System.out.println(x == y); // Output: true
        System.out.println(x != z); // Output: true
        System.out.println(x == z); // Output: false
    }
}
```

---

## Comparison Operators (`>`, `<`, `>=`, `<=`)

### Definition

Comparison operators compare the relative values of two numeric operands.

* **Greater Than (`>`):** Returns `true` if the left operand is strictly greater than the right operand.
* **Less Than (`<`):** Returns `true` if the left operand is strictly less than the right operand.
* **Greater Than or Equal To (`>=`):** Returns `true` if the left operand is greater than or equal to the right operand.
* **Less Than or Equal To (`<=`):** Returns `true` if the left operand is less than or equal to the right operand.

### Syntax

```java
boolean result_01 = (a > b);
boolean ressult_02 = (a < b);
boolean ressult_03 = (a >= b);
boolean ressult_04 = (a <= b);
```

### Code Example

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        int score = 83;

        boolean isPassing = score >= 50; // true
        boolean isHonors = score > 90; // false
        boolean needsHelp = score < 50; // false

        System.out.println("Passing: " + isPassing);
        System.out.println("Honors: " + isHonors);
        System.out.println("Neeeds Help: " + needsHelp);
    }
}
```

---

## Comparing Primitives vs. Reference Types

One of the most critical concepts in Java is understanding how the `==` operator behaves differently for primitive data types versus object references.

### Primitive Types

For primitive types (`int`, `double`, `char`, etc.), `==` compares their **actual values**:

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(a == b); // true (values are identical)
    }
}
```

### Reference Types (Objects & Strings)

For object reference types (such as `String`, `Integer`, or custom classes), `==` compares **memory addresses (references)**, NOT object content!

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Java");

        // ❌ Compares memory locations, NOT text content!
        System.out.println(s1 == s2); // Output: false (Different memory objects)

        // ✅ Compares actual text content using .equals()
        System.out.println(s1.equals(s2)); // Output: true
    }
}
```

> **Key Rule:** Always use `.equals()` to compare the values of objects (including `String`), and reserve `==` for primitive value checks or verifying if two references point to the exact same memory instance.

---

## Floating-Point Comparison Pitfalls

Comparing floating-point numbers (`float`, `double`) directly using `==` or `!=` is hazardous due to how floating-point numbers are represented in IEEE 754 binary format.

### The Problem Example

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        double a = 0.1 + 0.2;
        double b = 0.3;

        System.out.println("a = " + a); // Output: 0.30000000000000004
        System.out.println(a == b); // Output: false ❌
    }
}
```

### The Solution: Epsilon Comparison

To reliably compare floating-point numbers, check if the absolute difference between them is smaller than a tiny threshold called **epsilon** ($\epsilon$):

$$\vert{}a - b\vert{} < \epsilon$$

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        double a = 0.1 + 0.2;
        double b = 0.3;
        double epsilon = 0.000001;

        boolean isEqual = Math.abs(a - b) < epsilon;
        System.out.println("Safely Equal: " + isEqual); // Output: true ✅
    }
}
```

---

## Operator Precedence and Associativity

Relational operators have lower precedence than arithmetic operators but higher precedence than logical and assignment operators.

### Precedence Order (Highest to Lowest)

1. **Arithmetic Operators:** `+`, `-`, `*`, `/`, `%`
2. **Relational Comparison:** `<`, `<=`, `>`, `>=`
3. **Relational Equality:** `==`, `!=`
4. **Logical Operators:** `&&`, `||`
5. **Assignment:** `=`

### Associativity

All binary relational operators evaluate from **Left to Right**.

### Precedence Example

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;

        boolean result = a + b > c * 6;
        // Step 1: Evaluate arithmetic -> (10 + 5) = 15, (2 * 6) = 12
        // Step 2: Evaluate relational -> 15 > 12 = true
        System.out.println(result); // Output: true
    }
}
```

---

## Full Implementation Example

```java
public class RelationalOperatorsDemo {
    public static void main(String[] args) {
        int age = 21;
        double gpa = 3.8;
        int passingScore = 60;
        int studentScore = 75;

        System.out.println("--- 1. Basic Relational Checks ---");
        System.out.println("Equal (score == 75): " + (studentScore == 75));     // true
        System.out.println("Not Equal (score != 60): " + (studentScore != passingScore)); // true
        System.out.println("Greater Than (score > 80): " + (studentScore > 80)); // false
        System.out.println("Less Than or Equal (age <= 21): " + (age <= 21));   // true

        System.out.println("\n--- 2. Primitive vs Reference Comparison ---");
        String str1 = "Hello";
        String str2 = new String("Hello");

        System.out.println("Using == on Strings: " + (str1 == str2));          // false
        System.out.println("Using .equals() on Strings: " + str1.equals(str2)); // true

        System.out.println("\n--- 3. Safe Floating-Point Comparison ---");
        double d1 = 0.1 + 0.1 + 0.1;
        double d2 = 0.3;
        double EPSILON = 1e-9;

        System.out.println("Direct == comparison: " + (d1 == d2));                  // false
        System.out.println("Epsilon comparison: " + (Math.abs(d1 - d2) < EPSILON)); // true

        System.out.println("\n--- 4. Combining with Control Flow ---");
        if (gpa >= 3.5) {
            System.out.println("Dean's List Eligible!");
        }
    }
}
```

### Console Output

```text
--- 1. Basic Relational Checks ---
Equal (score == 75): true
Not Equal (score != 60): true
Greater Than (score > 80): false
Less Than or Equal (age <= 21): true

--- 2. Primitive vs Reference Comparison ---
Using == on Strings: false
Using .equals() on Strings: true

--- 3. Safe Floating-Point Comparison ---
Direct == comparison: false
Epsilon comparison: true

--- 4. Combining with Control Flow ---
Dean's List Eligible!
```

---

## Why This Matters

1. **Conditional Branching:** Relational operators form the predicates that drive `if-else` execution paths.
2. **Loop Continuation Conditions:** Iteration constructs depend on relational evaluations to terminate loop execution safely:
```java
for (int i = 0; i < array.length; i++) {
    // Loop continues while i < length
}
```


3. **Data Filtering & Searching:** Filtering data sets based on thresholds (e.g., finding products priced under $50).

---

## Common Mistakes to Avoid

1. **Confusing Assignment (`=`) with Equality (`==`):**
Using `=` instead of `==` inside conditions is a syntax error in Java for non-boolean types, but can cause logic bugs when boolean variables are involved.
```java
boolean isReady = false;
// ❌ Assigns true to isReady instead of comparing!
if (isReady = true) { 
    System.out.println("Always executes!"); 
}
```


2. **Chaining Relational Operators:**
In mathematics, $10 < x < 20$ is valid. In Java, relational operators cannot be chained directly.
```java
int x = 15;
// ❌ Syntax Error: 10 < x evaluates to boolean true, and true < 20 is invalid!
// if (10 < x < 20) { }

// ✅ Correct Syntax using Logical AND
if (10 < x && x < 20) { }
```


3. **Using `==` to Compare Strings:**
Comparing strings with `==` checks reference equality, not string text equality. Always use `.equals()`.

---

## Practice Exercises

### Exercise 1: Range Checker

Write a Java program that takes a student's numerical grade (`0` to `100`) and prints `true` if the grade is between `70` and `89` (inclusive), otherwise `false`.

```java
public class GradeChecker {
    public static void main(String[] args) {
        int grade = 78;

        boolean isBGrade = (grade >= 70) && (grade <= 89);
        System.out.println("Is Grade B: " + isBGrade); // Output: true
    }
}
```

### Exercise 2: Object vs. Primitive Comparison Tracing

Predict the output of the following Java snippet:

```java
int a = 100;
int b = 100;
String s1 = "Java";
String s2 = "Java";
String s3 = new String("Java");

System.out.println(a == b);
System.out.println(s1 == s2);
System.out.println(s1 == s3);
```

---

## 10. Quick Summary Table

| Operator | Meaning | Syntax | Example (`a = 10, b = 20`) | Result |
| --- | --- | --- | --- | --- |
| `==` | Equal To | `a == b` | `10 == 20` | `false` |
| `!=` | Not Equal To | `a != b` | `10 != 20` | `true` |
| `>` | Greater Than | `a > b` | `10 > 20` | `false` |
| `<` | Less Than | `a < b` | `10 < 20` | `true` |
| `>=` | Greater Than or Equal To | `a >= b` | `10 >= 20` | `false` |
| `<=` | Less Than or Equal To | `a <= b` | `10 <= 20` | `true` |

---

## Related Topics

* [Logical Operators](../logical_operators/logical_operators.md)
* [Ternary Operators](../ternary_operators/ternary_operators.md)
* [String Introduction](../../05_strings/string_introduction/string_introduction.md) Deep dive into String Constant Pool and `.equals()` vs `==`

---

## Additional Resources

* [GeeksforGeeks](https://www.geeksforgeeks.org/java/java-relational-operators-with-examples/)
* [w3schools](https://www.w3schools.com/java/java_operators_comparison.asp)

---

## Key Takeaways

Relational operators evaluate relative values and return boolean results used in program decision-making. Always use `.equals()` instead of `==` for object/String content comparisons, apply epsilon thresholds when comparing floating-point values, and use logical operators (`&&`, `||`) to combine multiple relational expressions instead of chaining them.

---

*Last Updated : October 9, 2026*
