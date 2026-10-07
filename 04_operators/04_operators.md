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
| Operator | Meaning | Syntax | Example | Result|
| --- | --- | --- | --- | --- |
| `+` | Addition | a + b | `5+2` | `7` |
| `-` | Subtraction | a - b | `5-2` | `3` |
| `*` | Multipliction | a * b | `5*2` | `10` |
| `/` | Division | a / b | `5/2` | `2`(integer division) |
| `%` | Modulus/Remainder | a % b | `5%2` | `1` |


### Implementation Example

```java
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

```text
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

## Unary Operators

In Java, Unary Operators are operators that work on only one operand. They are used for simple operations like increment, decrement, negation, and logical NOT.

### Types of Unary Operators

### 1. Unary Plus(+)
* Shows positive value (rarely used).
* **For example**
```java
int a = +5; // same as 5
```

### 2. Unary Minus(-)
* Negates the value(Change sign).
* **Syntax :** `-operand`
* **For example**
```java
int a = 5;
int b = -a; // b = -5
```

### 3.Increament(++)
* Increase value by 1.
* **Pre-increment :** `++a`→ increases first, then uses value.
* **Post-increment :** `a++`→ uses value first, then increases.
* **For example**
```java
int a = 5;
System.out.println(++a) // 6 (pre-increment)
System.out.println(a++) // 6 (post-increment, then becomes 7)
```

### 4. Decrement(--)
* Decreases value by 1.
* **Pre-decrement :** `--a`→ decrease first, then uses value.
* **Post-decrement :** `a--` → uses value first, then decreases.
* **For example**
```java
int a = 5;
System.out.println(--a); // 4 (pre-decrement)
System.out.println(a--); // 4 (post-decrement, then becomes 3)
```

### 5. Logical NOT(!)
* Inverts the value of a boolean operand. If the value is `true`, it turns into `false`, and vice versa.
* **Syntax :** `!(operand)`
* **For example**
```java
boolean flag = true;
System.out.println(!flag); // false
```

### 6. Bitwise Complement Operator(~)

* In Java, the **bitwise complement operator (~)** flips **each bit** of a number.
* It changes `0 → 1` and `1 → 0`.
* Works only on integer types (`byte`, `short`, `int`, `long`).
* **Syntax :** `~(operand)`
* **Formula :** If `x` is a number, then : `x = -(x+1)`
* **For example**
```java
int a = 5;        // Binary: 00000000 00000000 00000000 00000101
int b = ~a;       // Binary: 11111111 11111111 11111111 11111010
System.out.println(b); // Output: -6
```
* **Explanation :** `a = 5` → `~a = -(5+1) = -6`

> **Note:** Result is always negative if you start with a positive number (because of 2’s complement representation).
>
> 

### Implementation Example

```java
public class UnaryOperatorsDemo {
    public static void main(String[] args) {
        int a = 5;
        boolean flag = true;

        // 1. Unary Plus (+)
        System.out.println("Unary Plus: " + (+a)); // 5

        // 2. Unary Minus (-)
        System.out.println("Unary Minus: " + (-a)); // -5

        // 3. Pre-Increment (++a)
        System.out.println("Pre-Increment: " + (++a)); // 6 (a becomes 6 before use)

        // 4. Post-Increment (a++)
        System.out.println("Post-Increment: " + (a++)); // 6 (use first, then a becomes 7)
        System.out.println("Value of a after Post-Increment: " + a); // 7

        // 5. Pre-Decrement (--a)
        System.out.println("Pre-Decrement: " + (--a)); // 6 (a becomes 6 before use)

        // 6. Post-Decrement (a--)
        System.out.println("Post-Decrement: " + (a--)); // 6 (use first, then a becomes 5)
        System.out.println("Value of a after Post-Decrement: " + a); // 5

        // 7. Logical NOT (!)
        System.out.println("Logical NOT: " + (!flag)); // false

        // 8. Bitwise Complement (~)
        int b = 10; // binary: 00001010
        System.out.println("Bitwise Complement of 10: " + (~b)); // -11
    }
}
```

### Output

```text
Unary Plus: 5
Unary Minus: -5
Pre-Increment: 6
Post-Increment: 6
Value of a after Post-Increment: 7
Pre-Decrement: 6
Post-Decrement: 6
Value of a after Post-Decrement: 5
Logical NOT: false
Bitwise Complement of 10: -11
```

---

## Assignment Operators
Assignment operators in Java are used to assign values to variables and simplify expressions. They include both simple (=) and compound operators (like +=, -=), which combine operations with assignment. These operators help write cleaner and more concise code while handling value updates efficiently.

* Supports both simple (=) and compound (+=, -=, *=, /=, %=) assignments.
* Compound operators perform implicit type casting in some cases.
* Reduces code length by combining operation and assignment in one step.

### Types of Assignment Operators in Java
The Assignment Operator is generally of two types. They are -

### 1. Simple Assignment Operators

* Assignment operators put the right‑side value into the left‑side variable.
* They follow right‑to‑left associativity → right side is calculated first, then stored in left side.
* The right side must be a constant or an evaluated expression.
* **Example:**
```java
int x;
x = 5 + 3;   // right side (8) is calculated first, then stored in x
```

### 2. Compound Assignment Operators

* These combine operation + assignment in one step.
* Examples: `+=`, `-=`, `*=`, `/=`, `%=`
* They make code shorter and cleaner.
* Sometimes they do implicit type casting automatically.

### Below is an explanation of each assignment operator and its working

### 1.(=) operator
* **Definition:** `=` is the **basic assignment operator** in Java. It **stores the value on the right side into the variable on the left side**.
* **Syntax:** 
```java
num1 = num2;
```
> Here, the value of `num2` goes into `num1`.
>
> 
* **For example:**
```java
int a;
int b = 10;
a = b;   // value of b (10) is stored in a
System.out.println(a); // prints 10
```
* **Working Process:** Right side is **calculated first**. Result is taken. That result is stored in the **left side variable**.

### 2.(+=) operator
* **Definition:** `+=` is a compound assignment operator. It combines **addition (+)** and **assignment(=)**. It adds the right‑side value to the left‑side variable and stores the result back in the left‑side variable.
* **Syntax:**
```java
num1 += num2; // same as: num1 = num1 + num2;
```
* **For example:**
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;

        System.out.println("num1 = " + num1); // num1 = 10
        System.out.println("num2 = " + num2); // num2 = 20

        // Adding & Assigning values
        num1 += num2;

        // Displaying the assigned values
        System.out.println("num1 = " + num1); // num1 = 30
    }
}
```

* **Special Note**
```java
int x = 5;
// x = x + 4.5;   // ❌ compile error (double → int not allowed)
x += 4.5;         // ✅ works, result = 9 (auto cast to int)
```
> **Key Points:** `+=` = shortcut for **add + assign**. Saves time and reduces code length. Safer than `x = x + value` when dealing with type casting. 

---

### 3.(-=) operator
* **Definition:** `-=` is a compound assignment operator. It combines **subtraction(-)** and **assignment(=)**. It subtracts the right-side value from left-side variable and stores the result back in the left-side variable.
* **Syntax:**
```java
num1 -= num2; // same as: num1 = num1 - num2;
```
* **For example:**
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 20, num2 = 5;

        System.out.println("num1 = " + num1); // num1 = 20
        System.out.println("num2 = " + num2); // num2 = 5

        // Subtracting & Assigning values
        num1 -= num2;

        // Displaying the assigned values
        System.out.println("num1 = " + num1); // num1 = 15
    }
}
```

* **Special Note:**
```java
int x = 10;
// x = x - 2.5;   // ❌ compile error (double → int not allowed)
x -= 2.5;         // ✅ works, result = 7 (auto cast to int)
```
> **Key Points:** `x-=y` automatically performs implicit type casting `(type) (x-y)`.
>
> 

---

### 4.(*=) operator
* **Definition:** `*=` is a compound assignment operator. It combines **multiplication(*)** and **assignment(=)**. It multiplies the left-side variable by the right-side value and stores the result back in the left-side variable.
* **Syntax:**
```java
num1 *= num2; // same as: num1 = num1 * num2;
```
* **For example:**
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 5, num2 = 4;

        System.out.println("num1 = " + num1); // num1 = 5
        System.out.println("num2 = " + num2); // num2 = 4

        // Multiplying & Assigning values
        num1 *= num2;

        // Displaying the assigned values
        System.out.println("num1 = " + num1); // num1 = 20
    }
}
```
* **Special Note:**
```java
int x = 4;
x *= 2.5; // ✅ works, result = 10 (4 * 2.5 = 10.0, auto cast to int)
```

> **Key Points:** Saves explicit cast syntax while retaining clear readability for scaling variables.
>
> 

---

### 5. (/=) operator
* **Definition:** `/=` is a compound assignment operator. It combines **division(/)** and **assignment(=)**. It divides the left-side variable by the right-side value and stores the result back in the left-side variable.
* **Syntax:**
```java
num1 /= num2; // same as: num1 = num1 / num2;
```
* **For example:**
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 20, num2 = 4;

        System.out.println("num1 = " + num1); // num1 = 20
        System.out.println("num2 = " + num2); // num2 = 4

        // Dividing & Assigning values
        num1 /= num2;

        // Displaying the assigned values
        System.out.println("num1 = " + num1); // num1 = 5
    }
}
```

* **Special Note:**
```
int x = 7;
x /= 2; // ✅ result = 3 (integer division truncates fractional part)
```

> **Key Points:** For integer types, division discards decimal remainder. Dividing by zero will throw on `ArithmeticException`.
>
> 

### 6.(%=) operator
* **Definition: `%=` is a compound assignment operator. It combines **modulus (%)** and **assignment (=)**. It calculates the remainder of dividing the left-side variable by the right-side value and stores that remainder back in the left-side variable.
* **Syntax:**
```java
num1 %= num2; // same as: num1 = num1 % num2;
```
* **For example**
```
class Assignment {
    public static void main(String[] args) {
        int num1 = 17, num2 = 5;

        System.out.println("num1 = " + num1); // num1 = 17
        System.out.println("num2 = " + num2); // num2 = 5

        // Modulus & Assigning values
        num1 %= num2;

        // Displaying the assigned values
        System.out.println("num1 = " + num1); // num1 = 2 (17 % 5 = 2)
    }
}
```
> **Key Points:** Useful for cyclic indexing, checking even/odd numbers, or keeping values within bound ranges.
>
> 

---

### 7. (&=) Bitwise AND and Assign
* **Definition:** `&=` is a compound assignment operator that performs a **bitwise AND** operation between the left variable and right value, then stores the result in the left variable.
* **Syntax:**
```java
num1 &= num2; // same as: num1 = num1 & num2;
```
* **For example:**
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 5;  // Binary: 0101
        int num2 = 3;  // Binary: 0011

        // Bitwise AND & Assigning values
        num1 &= num2;  // Binary: 0001 (Decimal: 1)

        System.out.println("num1 = " + num1); // num1 = 1
    }
}
```

* **Special Note:**
```
boolean flag = true;
flag &= false; // ✅ Also works with boolean values (result = false)
```
> **key Points:** Each bit of the result is `1` only if both corresponding bits of the operands are `1`.
>
> 

---

### 8.(|=) Bitwise OR and Assign
* **Definition:** `|=` is compound assignment operator that performs a **bitwise OR** operation between the left variable and right value, then stores the result in the left variable.
* **Syntax:**
```java
 num1 |= num2; // same as: num1 = num1 | num2;
```
* **For example:**
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 5;  // Binary: 0101
        int num2 = 3;  // Binary: 0011

        // Bitwise OR & Assigning values
        num1 |= num2;  // Binary: 0111 (Decimal: 7)

        System.out.println("num1 = " + num1); // num1 = 7
    }
}
```

> **Key Points:** Each bit of the result is `1` if at least one of the corresponding bits of the operands is `1`.
>
> 

---

### 9. (^=) Bitwise XOR and Assign

* **Definition:** `^=` is a compound assignment operator that performs a **bitwise XOR (Exclusive OR)** operation between the left variable and right value, then stores the result in the left variable.
* **Syntax:**

```java
num1 ^= num2; // same as: num1 = num1 ^ num2;
```

* **For example:**

```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 5;  // Binary: 0101
        int num2 = 3;  // Binary: 0011

        // Bitwise XOR & Assigning values
        num1 ^= num2;  // Binary: 0110 (Decimal: 6)

        System.out.println("num1 = " + num1); // num1 = 6
    }
}
```

> **Key Points:** Each bit of the result is `1` if the corresponding bits of the operands are different, and `0` if they are identical.
>
> 

---

### 10. (<<=) Left Shift and Assign

* **Definition:** `<<=` performs a **bitwise left shift** on the left-side variable by the specified number of bits on the right side, then assigns the result back to the left-side variable.
* **Syntax:**

```java
num1 <<= num2; // same as: num1 = num1 << num2;
```

* **For example:**

```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 5; // Binary: 0000 0101

        // Shift bits left by 2 positions
        num1 <<= 2;   // Binary: 0001 0100 (Decimal: 20)

        System.out.println("num1 = " + num1); // num1 = 20
    }
}
```

> **Key Points:** Shifting left by `n` positions effectively multiplies the integer by $2^n$ (e.g., $5 \times 2^2 = 20$).
>
> 

---

### 11. (>>=) Right Shift and Assign

* **Definition:** `>>=` performs a **signed bitwise right shift** on the left-side variable by the specified number of bits on the right side, then assigns the result back to the left-side variable.
* **Syntax:**

```java
num1 >>= num2; // same as: num1 = num1 >> num2;
```

* **For example:**

```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 20; // Binary: 0001 0100

        // Shift bits right by 2 positions
        num1 >>= 2;    // Binary: 0000 0101 (Decimal: 5)

        System.out.println("num1 = " + num1); // num1 = 5
    }
}
```

> **Key Points:** Shifting right by `n` positions effectively divides the integer by $2^n$ using integer division. The sign bit is preserved (sign extension).
>
> 

---


### Implementation Example

```java
public class AssignmentOperators {
    public static void main(String[] args) {
        // 1. Basic Assignment (=)
        int a = 10;
        int b = 20;

        // 2. Arithmetic Assignment
        a += b;  // a = a + b (30)
        System.out.println("+= : " + a);

        a -= 5;  // a = a - 5 (25)
        System.out.println("-= : " + a);

        a *= 2;  // a = a * 2 (50)
        System.out.println("*= : " + a);

        a /= 5;  // a = a / 5 (10)
        System.out.println("/= : " + a);

        a %= 3;  // a = a % 3 (1)
        System.out.println("%= : " + a);

        // 3. Bitwise Assignment
        int x = 5;  // Binary: 0101
        int y = 3;  // Binary: 0011

        x &= y;  // Bitwise AND (1)
        System.out.println("&= : " + x);

        x |= 2;  // Bitwise OR (3)
        System.out.println("|= : " + x);

        x ^= 1;  // Bitwise XOR (2)
        System.out.println("^= : " + x);

        // 4. Shift Assignment
        int num = 8;

        num <<= 1; // Left shift (16)
        System.out.println("<<= : " + num);

        num >>= 2; // Right shift (4)
        System.out.println(">>= : " + num);

        num >>>= 1; // Unsigned Right shift (2)
        System.out.println(">>>= : " + num);
    }
}
```

### Output

```text
+= : 30
-= : 25
*= : 50
/= : 10
%= : 1
&= : 1
|= : 3
^= : 2
<<= : 16
>>= : 4
>>>= : 2
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
