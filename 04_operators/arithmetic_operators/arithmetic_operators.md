# Arithmetic Operators in Java

## Overview

Arithmetic operators in Java perform basic mathematical operations on primitive numeric data types (`byte`, `short`, `int`, `long`, `float`, `double`). They serve as foundational building blocks for numerical computations, algorithm logic, and state manipulation.

In Java, arithmetic operators are categorized as:

* **Binary Arithmetic Operators:** Require two operands (`+`, `-`, `*`, `/`, `%`)
* **Unary Arithmetic Operators:** Require one operand (`++`, `--`, unary `+`, unary `-`)

---

## Table of Contents

1. [Addition Operator (+)](#addition-operator-)
2. [Subtraction Operator (-)](#subtraction-operator--)
3. [Multiplication Operator (*)](#multiplication-operator-)
4. [Division Operator (/)](#division-operator-)
5. [Modulus Operator (%)](#modulus-operator-)
6. [Increment and Decrement Operators (++, --)](#increment-and-decrement-operators---)
7. [Operator Precedence and Associativity](#operator-precedence-and-associativity)
8. [Full Implementation Example](#full-implementation-example)
9. [Why This Matters](#why-this-matters)
10. [Common Mistakes to Avoid](#common-mistakes-to-avoid)
11. [Practice Exercises](#practice-exercises)
12. [Quick Summary Table](#quick-summary-table)
13. [Related Topics](#related-topics)
14. [Additional Resources](#additional-resources)
15. [Key Takeaways](#key-takeaways)

---

## Addition Operator (`+`)

### Definition

The `+` operator adds two numeric values together. When used with a `String`, it acts as the string concatenation operator.

### Syntax

```java
result = operand1 + operand2;
```

### Example

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int sum = a + b;
        System.out.println(sum); // Output: 25
    }
}
```

### String Concatenation Behavior

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        int score = 100;
        System.out.println("Score: " + score); // Output: Score: 100
        System.out.println(5 + 5 + " Text"); // Output: 10 Text (Addition first, then concatenation)
        System.out.println("Text " + 5 + 5); // Output: Text 55 (String concatenation evaluated left-to-right)
    }
}
```

---

## Subtraction Operator (`-`)

### Definition

The binary `-` operator subtracts the right-hand operand from the left-hand operand. The unary `-` operator negates the sign of a single operand.

### Syntax

```java
result = operand1 - operand2; // Binary subtraction
negatedValue = -operand;     // Unary negation
```

### Example

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        int a = 20;
        int b = 8;
        int difference = a - b;
        System.out.println(difference); // Output: 12

        int positiveNum = 5;
        int negativeNum = -positiveNum;
        System.out.println(negativeNum); // Output: -5
    }
}
```

---

## Multiplication Operator (`*`)

### Definition

The `*` operator multiplies two numeric values.

### Syntax

```java
result = operand1 * operand2;
```

### Example

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        int length = 6;
        int width = 4;
        int area = length * width;
        System.out.println(area); // Output: 24
    }
}
```

### Automatic Type Promotion

When multiplying two operands of different numeric types, Java promotes the smaller type to the larger type before performing multiplication.

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        int count = 4;
        double price = 12.5;
        double total = count * price; // count is promoted to double (4.0 * 12.5)
        System.out.println(total); // Output: 50.0
    }
}
```

---

## Division Operator (`/`)

### Definition

The `/` operator divides the left-hand operand by the right-hand operand.

### Syntax

```java
result = dividend / divisor;
```

### Integer Division vs. Floating-Point Division

* **Integer Division:** When both operands are integers (`int`, `long`, `short`, `byte`), Java performs integer division, discarding any fractional remainder (truncation towards zero).
* **Floating-Point Division:** If at least one operand is a floating-point type (`float` or `double`), Java performs exact floating-point division.

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        int intResult = 5 / 2;
        System.out.println(intResult); // Output: 2 (Fractional part .5 is truncated)

        double doubleResult = 5.0 / 2;
        System.out.println(doubleResult); // Output: 2.5
    }
}
```

> **Warning:** Dividing an integer by zero (`x / 0`) throws an `ArithmeticException` at runtime. Dividing a floating-point number by zero (`x / 0.0`) produces `Infinity` or `NaN` without throwing an exception.

---

## Modulus Operator (`%`)

### Definition

The `%` operator returns the division remainder after dividing the left-hand operand by the right-hand operand.

### Syntax

```java
remainder = dividend % divisor;
```

### Example

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        int totalItems = 17;
        int itemsPerGroup = 5;
        int leftover = totalItems % itemsPerGroup;
        System.out.println(leftover); // Output: 2
    }
}
```

### Modulus with Negative Numbers

In Java, the sign of the result matches the sign of the dividend (the left operand).

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        System.out.println(-7 % 3); // Output: -1
        System.out.println(7 % -3); // Output: 1
        System.out.println(-7 % -3); // Output: -1
    }
}
```

---

## Increment and Decrement Operators (`++`, `--`)

### Definition

These unary operators increase (`++`) or decrease (`--`) a variable's value by `1`. They can be used in either **prefix** or **postfix** notation.

### Difference Between Prefix and Postfix

| Form | Syntax | Behavior |
| --- | --- | --- |
| **Prefix Increment** | `++a` | Increments value **first**, then evaluates the expression |
| **Postfix Increment** | `a++` | Evaluates the expression **first**, then increments value |
| **Prefix Decrement** | `--a` | Decrements value **first**, then evaluates the expression |
| **Postfix Decrement** | `a--` | Evaluates the expression **first**, then decrements value |

### Example

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        int x = 5;
        int prefixResult = ++x; // x becomes 6, then prefixResult is assigned 6
        System.out.println("x: " + x + ", prefixResult: " + prefixResult); // Output: x: 6, prefixResult: 6

        int y = 5;
        int postfixResult = y++; // postfixResult is assigned 5, then y becomes 6
        System.out.println("y: " + y + ", postfixResult: " + postfixResult); // Output: y: 6, postfixResult: 5
    }
}
```

---

## Operator Precedence and Associativity

When multiple arithmetic operators appear in a single expression, Java evaluates them according to operator precedence and associativity rules.

### Precedence Hierarchy (Highest to Lowest)

1. **Postfix Operators:** `expr++`, `expr--`
2. **Prefix Unary Operators:** `++expr`, `--expr`, `+expr`, `-expr`
3. **Multiplicative Operators:** `*`, `/`, `%`
4. **Additive Operators:** `+`, `-`

### Associativity Rule

All binary arithmetic operators evaluate from **Left to Right**. Unary operators evaluate from **Right to Left**.

```java
public class EvenPositiveCheck {
    public static void main(String[] args) {
        int result = 10 + 5 * 2 - 8 / 4;
        // 1. Multiplication: 5 * 2 = 10 -> Expression: 10 + 10 - 8 / 4
        // 2. Division: 8 / 4 = 2 -> Expression: 10 + 10 - 2
        // 3. Addition: 10 + 10 = 20 -> Expression: 20 - 2
        // 4. Subtraction: 20 - 2 = 18
        System.out.println(result); // Output: 18
    }
}
```

Parentheses `()` override standard precedence rules.

---

## Full Implementation Example

```java
public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        // Binary arithmetic operators
        int a = 10;
        int b = 3;

        System.out.println("--- Basic Binary Operations ---");
        System.out.println("Addition (a + b): " + (a + b));
        System.out.println("Subtraction (a - b): " + (a - b));
        System.out.println("Multiplication (a * b): " + (a * b));
        System.out.println("Integer Division (a / b): " + (a / b));
        System.out.println("Modulus Remainder (a % b): " + (a % b));

        // Floating-point division precision
        double doubleDiv = (double) a / b;
        System.out.println("Floating-Point Division ((double)a / b): " + doubleDiv);

        // Unary increment & decrement
        System.out.println("\n--- Unary Operations ---");
        int count = 5;
        System.out.println("Initial count: " + count);
        System.out.println("Prefix (++count): " + (++count)); // Increments first, then prints 6
        System.out.println("Postfix (count++): " + (count++)); // Prints 6, then increments to 7
        System.out.println("Final count: " + count);

        // Operator precedence demo
        System.out.println("\n--- Precedence Evaluation ---");
        int expressionResult = 5 + 3 * 2 - (8 / 2);
        // Step 1: Parentheses (8 / 2) = 4 -> 5 + 3 * 2 - 4
        // Step 2: Multiplication 3 * 2 = 6 -> 5 + 6 - 4
        // Step 3: Addition 5 + 6 = 11      -> 11 - 4
        // Step 4: Subtraction 11 - 4 = 7
        System.out.println("5 + 3 * 2 - (8 / 2) = " + expressionResult);
    }
}
```

### Console Output

```text
--- Basic Binary Operations ---
Addition (a + b): 13
Subtraction (a - b): 7
Multiplication (a * b): 30
Integer Division (a / b): 3
Modulus Remainder (a % b): 1
Floating-Point Division ((double)a / b): 3.3333333333333335

--- Unary Operations ---
Initial count: 5
Prefix (++count): 6
Postfix (count++): 6
Final count: 7

--- Precedence Evaluation ---
5 + 3 * 2 - (8 / 2) = 7
```

---

## Why This Matters

Understanding arithmetic operators is fundamental across essential software engineering domains:

1. **Pagination Logic:** Web applications calculate page offsets and total pages using integer division (`/`) and modulus (`%`).
```java
int totalRecords = 53;
int pageSize = 10;
int totalPages = (totalRecords + pageSize - 1) / pageSize; // Calculates 6 pages
```


2. **Cyclic Operations:** Modulus (`%`) keeps counters within specific bounds (e.g., circular buffer indexing, game turns, clock cycles).
```java
int currentHour = (hour + hoursPassed) % 12; // Wraps clock hours within 0-11
```


3. **Data Transformations & Physics Engines:** Game engines and graphics processors rely heavily on floating-point multiplication, division, and increment/decrement operations for velocity and positioning calculations.

---

## Common Mistakes to Avoid

1. **Accidental Integer Truncation:**
Performing division with two integer operands truncates decimals even when assigning the result to a `double`.
```java
// ❌ Incorrect: 5 / 2 evaluates to 2 first, then casts to 2.0
double avg = 5 / 2; 

// ✅ Correct: Cast at least one operand to double
double correctAvg = (double) 5 / 2; // Result: 2.5
```


2. **Unintended String Concatenation Order:**
Using the `+` operator with strings without grouping parentheses leads to logic bugs.
```java
// ❌ Incorrect
System.out.println("Total: " + 5 + 10); // Output: "Total: 510"

// ✅ Correct
System.out.println("Total: " + (5 + 10)); // Output: "Total: 15"
```


3. **Unhandled Division by Zero Exception:**
Dividing an integer variable by zero at runtime causes unhandled application crashes.
```java
int divisor = 0;
if (divisor != 0) {
    int result = 100 / divisor;
} else {
    System.out.println("Cannot divide by zero.");
}
```


4. **Overusing Post-Increment in the Same Statement:**
Modifying and reading a variable multiple times in a single line leads to unreadable code.
```java
// ❌ Avoid complex inline updates
int x = 2;
int val = x++ + ++x * x++; // Unclear and error-prone
```

---

## Practice Exercises

### Exercise 1: Fahrenheit to Celsius Converter

Write a Java program that converts a temperature from Fahrenheit to Celsius using the formula $C = \frac{5}{9} \times (F - 32)$. Ensure floating-point precision is preserved.

* **Solution:** [Exercise 1: Fahrenheit to Celsius Converter](labs/exercise-01.fahrenheit_to_celsius_converter.java)

### Exercise 2: Odd/Even Checker via Modulus

Write a code snippet that checks whether an integer `num = 27` is even or odd using the `%` operator.

* **Solution:** [Exercise 2: Odd or Even Checker via Modulus](labs/exercise-02.odd_or_even_cheker_via_modulus.java)

---

## Quick Summary Table

| Operator | Meaning | Syntax | Example | Result |
| --- | --- | --- | --- | --- |
| `+` | Addition | `a + b` | `5 + 2` | `7` |
| `-` | Subtraction | `a - b` | `5 - 2` | `3` |
| `*` | Multiplication | `a * b` | `5 * 2` | `10` |
| `/` | Division | `a / b` | `5 / 2` | `2` (integer division) |
| `%` | Modulus / Remainder | `a % b` | `5 % 2` | `1` |
| `++` | Increment (Pre/Post) | `++a` / `a++` | `a = 5; ++a;` | `6` |
| `--` | Decrement (Pre/Post) | `--a` / `a--` | `a = 5; --a;` | `4` |

---

## Related Topics

* [Relational Operators](../relational_operators/relational_operators.md)
* [Unary Operators](../unary_operators/unary_operators.md)
* [Data Types](../../data_types/data_types.md)

---

## Additional Resources

* [GeeksforGeeks](https://www.geeksforgeeks.org/java/java-arithmetic-operators-with-examples/)
* [w3schools](https://www.w3schools.com/java/java_operators_arithmetic.asp)

---

## Key Takeaways

Arithmetic operators enable core numerical operations and arithmetic expressions in Java. Understanding the operational difference between integer division and floating-point division is essential to avoid truncation bugs. Master prefix versus postfix incrementing behavior, operator precedence rules, and remainder calculations to write clean, predictable, and performant Java applications.

---

*Last Modified: October 10, 2026*
