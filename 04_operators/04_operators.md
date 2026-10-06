# Operators in Java

## Overview

Java operators are symbols used to perform operations on variables and values. They play a fundamental role in constructing expressions, performing calculations, and directing program control flow. Operators simplify complex logic into clean, concise statements, following defined precedence and associativity rules to dictate execution order.

Depending on the operation, operators act on a single operand (unary) or multiple operands (binary/ternary).

This guide covers:

* **Arithmetic Operators** - basic mathematical calculations and integer division truncation
* **Unary Operators** - pre/post increment, decrement, and value negation
* **Assignment Operators** - value assignment and compound operators
* **Relational Operators** - equality and value comparison logic
* **Logical Operators** - boolean conditions and short-circuit evaluation
* **Ternary Operator** - compact inline decision-making
* **Bitwise and Shift Operators** - direct bit manipulation and power-of-two arithmetic
* **instanceof Operator** - runtime object type safety checking
* **Common Mistakes to Avoid** - standard pitfalls like `==` vs `=` and string concatenation performance

---


## Table of Contents

1. [Arithmetic Operators](#arithmetic-operators)
2. [Unary Operators](#unary-operators)
3. [Assignment Operators](#assignment-operators)
4. [Relational Operators](#relational-operators)
5. [Logical Operators](#logical-operators)
6. [Ternary Operator](#ternary-operator)
7. [Bitwise and Shift Operators](#bitwise-and-shift-operators)
8. [instanceof Operator](#instanceof-operator)
9. [Common Mistakes to Avoid](#common-mistakes-to-avoid)
10. [Quick Reference](#quick-reference)
11. [Why This Matters](#why-this-matters)
12. [Key Takeaways](#key-takeaways)

---

## Arithmetic Operators

In Java, **Arithmetic operators** are used to perform basic mathematical operations on primitive numeric data types such as `int`, `float`, and `double`.

### List of Arithmetic Operators
| Operator | Meaning | Example | Result|
| --- | --- | --- | --- |
| `+` | Addition | `5+2` | `7` |
| `-` | Subtraction | `5-2` | `3` |
| `*` | Multipliction | `5*2` | `10` |
| `/` | Division | `5/2` | `2`(integer division) |
| `%` | Modulus/Remainder | `5%2` | `1` |



### Implementation Example

```
public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        // Addition
        int addition = a + b;
        System.out.println("Addition: " + addition);

        // Subtraction
        int subtraction = a - b;
        System.out.println("Subtraction: " + subtraction);


        // Multiplication
        int multiplication = a * b;
        System.out.println("Multiplication: " + multiplication);

        // Division
        int division = a / b;
        System.out.println("Division: " + division);

        // Modulus or Remainder
        int modulus = a % b;
        System.out.println("Modulus/Remainder: " + modulus);
    }
}
```

### Output

```
Addition: 13
Subtraction: 7
Multiplication: 30
Division: 3
Modulus/Remainder: 1
```

> **Note:** Performing division between two integers (`a / b`) results in integer division, returning only the quotient (`3`) and discarding any fractional remainder.
> 
> 

---

## 2. Unary Operators

Unary operators require only a single operand and are used to increment, decrement, or negate numeric values.

### Increment and Decrement Behavior

* **Post-increment (`a++`):** Evaluates the current value first, then increments the variable.


* **Pre-increment (`++a`):** Increments the variable first, then evaluates the updated value.


* **Post-decrement (`b--`):** Evaluates the current value first, then decrements the variable.


* **Pre-decrement (`--b`):** Decrements the variable first, then evaluates the updated value.



### Code Example

```java
import java.io.*;

class Geeks {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
    }
}

```

### Output

```text
Postincrement : 10
Preincrement : 12
Postdecrement : 10
Predecrement : 8

```

---

## 3. Assignment Operators

Assignment operators evaluate expressions on the right-hand side and store the resulting value into a variable on the left-hand side. Because assignment exhibits right-to-left associativity, the right-hand value must be a constant or an evaluated expression.

Compound assignment operators (e.g., `+=`, `-=`, `*=`, `/=`, `%=`) execute the arithmetic operation and assignment concurrently.

### Code Example

```java
public class GFG {
    public static void main(String[] args) {
        int num = 10; 
        System.out.println("Initial: " + num);

        // num = num + 5
        num += 5;
        System.out.println("After +5: " + num);

        // num = num * 2
        num *= 2;  
        System.out.println("After *2: " + num);

        // num = num - 5
        num -= 5;
        System.out.println("After -5: " + num);

        // num = num / 2
        num /= 2;
        System.out.println("After /2: " + num);

        // num = num % 3
        num %= 3;
        System.out.println("After %3: " + num);
    }
}

```

### Output

```text
Initial: 10
After +5: 15
After *2: 30
After -5: 25
After /2: 12
After %3: 0

```

---

## 4. Relational Operators

Relational operators evaluate relationships between two values (such as equality, greater than, or less than) and return a boolean result (`true` or `false`). They are widely used in conditional checks (`if-else`) and loop conditions.

### Relational Operators List

* Greater than (`>`)


* Less than (`<`)


* Greater than or equal to (`>=`)


* Less than or equal to (`<=`)


* Equal to (`==`)


* Not equal to (`!=`)



### Code Example

```java
import java.io.*;

class Geeks {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int c = 5;

        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == c: " + (a == c));
        System.out.println("a != c: " + (a != c));
    }
}

```

### Output

```text
a > b: true
a < b: false
a >= b: true
a <= b: false
a == c: false
a != c: true

```

---

## 5. Logical Operators

Logical operators combine or negate boolean expressions. Java logical operators feature short-circuit evaluation: if the left-hand condition determines the final outcome, the right-hand condition is skipped entirely.

### Operators

* **Logical AND (`&&`):** Returns `true` only if both conditions evaluate to `true`.


* **Logical OR (`||`):** Returns `true` if at least one condition evaluates to `true`.


* **Logical NOT (`!`):** Inverts the boolean state.



### Code Example

```java
import java.io.*;

class Geeks {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}

```

### Output

```text
x && y: false
x || y: true
!x: false

```

---

## 6. Ternary Operator

The ternary operator serves as a compact shorthand for standard `if-else` decision statements. It takes three operands in the following format:

```java
(condition) ? value_if_true : value_if_false

```

### Code Example

```java
public class Geeks {
    public static void main(String[] args) {
        int a = 20, b = 10, c = 30, result;

        // Nested ternary operator to find maximum of three numbers
        result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Max of three numbers = " + result);
    }
}

```

### Output

```text
Max of three numbers = 30

```

---

## 7. Bitwise and Shift Operators

Bitwise operators manipulate data directly at the binary bit level. Shift operators shift binary representations left or right, effectively dividing or multiplying numbers by powers of two.

### Operators List

* **Bitwise AND (`&`):** Performs bit-by-bit logical AND.


* **Bitwise OR (`|`):** Performs bit-by-bit logical OR.


* **Bitwise XOR (`^`):** Performs bit-by-bit logical XOR.


* **Bitwise Complement (`~`):** Flips each individual bit.


* **Left Shift (`<<`):** Shifts bits to the left.


* **Signed Right Shift (`>>`):** Shifts bits to the right preserving sign bit.


* **Unsigned Right Shift (`>>>`):** Shifts bits to the right filling empty positions with zeros.



### Code Example

```java
import java.io.*;

class Geeks {
    public static void main(String[] args) {
        int d = 0b1010; // Binary 10
        int e = 0b1100; // Binary 12

        System.out.println("d & e : " + (d & e));
        System.out.println("d | e : " + (d | e));
        System.out.println("d ^ e : " + (d ^ e));
        System.out.println("~d : " + (~d));
        System.out.println("d << 2 : " + (d << 2));
        System.out.println("e >> 1 : " + (e >> 1));
        System.out.println("e >>> 1 : " + (e >>> 1));
    }
}

```

### Output

```text
d & e : 8
d | e : 14
d ^ e : 6
~d : -11
d << 2 : 40
e >> 1 : 6
e >>> 1 : 6

```

---

## 8. instanceof Operator

The `instanceof` operator evaluates whether an object instance belongs to a specific class, subclass, or interface type at runtime. It returns `true` if the object matches the requested type, ensuring runtime type safety.

### Code Example

```java
public class GFG {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str instanceof String); 

        Object obj = 10; 
        System.out.println(obj instanceof Integer); 
        System.out.println(obj instanceof String);  
    }
}

```

### Output

```text
true
true
false

```

---

## Common Mistakes to Avoid

1. **Confusing `==` with `=`:** Accidental use of assignment (`=`) instead of equality comparison (`==`) results in compilation or logical bugs.


2. **Floating-Point Comparison Precision:** Direct comparison of floating-point numbers using `==` can fail unexpectedly due to rounding errors in precision.


3. **Integer Division Truncation:** Dividing two integer data types (`int / int`) discards decimal places instead of converting to floating-point results.


4. **String Concatenation inside Loops:** Repeatedly concatenating strings using `+` inside loops causes memory and performance degradation by creating multiple temporary String objects.



---

## Quick Reference

| Operator Category | Syntax Examples | Primary Use Case |
| --- | --- | --- |
| Arithmetic | `+`, `-`, `*`, `/`, `%` | Numeric mathematical calculations

 |
| Unary | `++a`, `a++`, `--b`, `b--` | Increments/decrements single variables

 |
| Assignment | `=`, `+=`, `-=`, `*=`, `/=`, `%=` | Assigns or mutates variable values

 |
| Relational | `>`, `<`, `>=`, `<=`, `==`, `!=` | Value comparisons returning boolean flags

 |
| Logical | `&&`, `||`, `!` | Conditional boolean operations with short-circuiting

 |
| Ternary | `(cond) ? val1 : val2` | Inline compact decision-making

 |
| Bitwise / Shift | `&`, `|`, `^`, `~`, `<<`, `>>`, `>>>` | Bit-level manipulation and power-of-two arithmetic

 |
| Type Check | `obj instanceof Class` | Runtime class/type verification

 |

---

## Why This Matters

Operators form the foundation of logic expression in Java. Mastering operator mechanics—including associativity, increment mechanics, short-circuit logic, and bit-level operations—is essential for writing error-free, optimized applications.

---

## Key Takeaways

* Operators evaluate expressions based on specified precedence and associativity rules.


* Post-operators (`a++`) evaluate then mutate; pre-operators (`++a`) mutate then evaluate.


* Compound assignments (`+=`, `-=`) streamline code expressions.


* Short-circuit logical operators (`&&`, `||`) skip evaluating secondary expressions when the outcome is guaranteed by the first.


* Use `instanceof` to guarantee object type compatibility before typecasting.
