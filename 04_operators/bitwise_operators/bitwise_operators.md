# Bitwise Operators in Java

## Overview

Bitwise operators in Java perform operations directly at the **binary (bit) level** on integral primitive data types (`byte`, `short`, `char`, `int`, and `long`). They manipulate individual bits ($0$s and $1$s) within an integer's representation. Bitwise operators are widely used in low-level programming, bit masking, performance optimizations, graphics processing, cryptography, and network protocols.

Java provides seven bitwise operators, categorized into bitwise logical operators and bit shift operators:

* **Bitwise AND (`&`)**
* **Bitwise OR (`|`)**
* **Bitwise XOR (`^`)**
* **Bitwise Complement (`~`)**
* **Signed Left Shift (`<<`)**
* **Signed Right Shift (`>>`)**
* **Unsigned Right Shift (`>>>`)**

### What This Guide Covers

* **Bitwise Logical Mechanics:** Detailed truth tables and binary execution for `&`, `|`, `^`, and `~`.
* **Bit Shift Mechanics:** Working principles of `<<`, `>>`, and `>>>`.
* **Two's Complement Representation:** How negative integers and bit inversion work in binary.
* **Bitwise vs. Logical Operators:** Structural and runtime differences (`&` vs `&&`, `|` vs `||`).
* **Bit Manipulation Patterns:** Bit masking, toggling bits, and checking flag states.
* **Common Mistakes & Pitfalls:** Over-shifting, signed integer confusion, and unexpected type promotion.
* **Hands-on Examples & Exercises:** Executable Java code, output tracing, and practice problems with solutions.

---

## Table of Contents

1. [1. Bitwise Logical Operators (&, |, ^, ~)](https://www.google.com/search?q=%231-bitwise-logical-operators----)
2. [2. Bit Shift Operators (<<, >>, >>>)](https://www.google.com/search?q=%232-bit-shift-operators---)
3. [3. Two's Complement and Binary Mechanics](https://www.google.com/search?q=%233-twos-complement-and-binary-mechanics)
4. [4. Bitwise Operators vs Logical Operators](https://www.google.com/search?q=%234-bitwise-operators-vs-logical-operators)
5. [5. Operator Precedence and Associativity](https://www.google.com/search?q=%235-operator-precedence-and-associativity)
6. [6. Full Implementation Example](https://www.google.com/search?q=%236-full-implementation-example)
7. [7. Why This Matters](https://www.google.com/search?q=%237-why-this-matters)
8. [8. Common Mistakes to Avoid](https://www.google.com/search?q=%238-common-mistakes-to-avoid)
9. [9. Practice Exercises](https://www.google.com/search?q=%239-practice-exercises)
10. [10. Quick Summary Table](https://www.google.com/search?q=%2310-quick-summary-table)
11. [11. Related Topics](https://www.google.com/search?q=%2311-related-topics)
12. [12. Additional Resources](https://www.google.com/search?q=%2312-additional-resources)
13. [13. Key Takeaways](https://www.google.com/search?q=%2313-key-takeaways)

---

## 1. Bitwise Logical Operators (`&`, `|`, `^`, `~`)

### Truth Table for Single Bits

| Bit A | Bit B | A `&` B (AND) | A `|` B (OR) | A `^` B (XOR) | `~`A (NOT) |
| --- | --- | --- | --- | --- | --- |
| 0 | 0 | 0 | 0 | 0 | 1 |
| 0 | 1 | 0 | 1 | 1 | 1 |
| 1 | 0 | 0 | 1 | 1 | 0 |
| 1 | 1 | 1 | 1 | 0 | 0 |

---

### A. Bitwise AND (`&`)

Compares corresponding bits of two operands. Returns `1` if **both bits are 1**; otherwise, returns `0`.

```java
int a = 12; // Binary: 0000 1100
int b = 25; // Binary: 0001 1001

int result = a & b; 
//   0000 1100 (12)
// & 0001 1001 (25)
// -----------
//   0000 1000 (8)
System.out.println("12 & 25 = " + result); // Output: 8

```

---

### B. Bitwise OR (`|`)

Compares corresponding bits of two operands. Returns `1` if **at least one bit is 1**; otherwise, returns `0`.

```java
int a = 12; // Binary: 0000 1100
int b = 25; // Binary: 0001 1001

int result = a | b; 
//   0000 1100 (12)
// | 0001 1001 (25)
// -----------
//   0001 1101 (29)
System.out.println("12 | 25 = " + result); // Output: 29

```

---

### C. Bitwise XOR (`^`)

Compares corresponding bits of two operands. Returns `1` if **bits are different**, and `0` if **bits are identical**.

```java
int a = 12; // Binary: 0000 1100
int b = 25; // Binary: 0001 1001

int result = a ^ b; 
//   0000 1100 (12)
// ^ 0001 1001 (25)
// -----------
//   0001 0101 (21)
System.out.println("12 ^ 25 = " + result); // Output: 21

```

---

### D. Bitwise Complement (`~`)

A unary operator that inverts every bit of its operand ($0$ becomes $1$, and $1$ becomes $0$).

In Java, integers are signed 32-bit values stored using **Two's Complement** notation. Inverting all bits of a positive integer $x$ yields $-(x + 1)$.

$$\sim x = -x - 1$$

```java
int a = 5; // Binary (32-bit): 0000...0000 0101
int result = ~a; // Binary (32-bit): 1111...1111 1010 (-6 in Two's Complement)

System.out.println("~5 = " + result); // Output: -6

```

---

## 2. Bit Shift Operators (`<<`, `>>`, `>>>`)

Bit shift operators move the bit pattern of an integer left or right by a specified number of bit positions.

### A. Signed Left Shift (`<<`)

Shifts bits to the left by $n$ positions, filling empty spaces on the right with $0$s.

* **Mathematical Effect:** Equivalent to multiplying the number by $2^n$ (provided no arithmetic overflow occurs).

```java
int num = 5; // Binary: 0000 0101

int result = num << 2; 
// Shift 2 positions left -> 0001 0100 (20)
// Math: 5 * (2^2) = 20

System.out.println("5 << 2 = " + result); // Output: 20

```

---

### B. Signed Right Shift (`>>`)

Shifts bits to the right by $n$ positions. The leftmost positions are filled using the **sign bit** (0 for positive numbers, 1 for negative numbers) to preserve the sign.

* **Mathematical Effect:** Equivalent to integer division by $2^n$ ($\lfloor x / 2^n \rfloor$).

```java
int pos = 20;  // Binary:  0001 0100
int neg = -20; // Binary:  1111...1110 1100

System.out.println("20 >> 2 = " + (pos >> 2));   // Output: 5  (20 / 4)
System.out.println("-20 >> 2 = " + (neg >> 2)); // Output: -5 (-20 / 4)

```

---

### C. Unsigned Right Shift (`>>>`)

Shifts bits to the right by $n$ positions and **always fills empty positions on the left with 0s**, regardless of whether the original number is positive or negative.

* For positive numbers, `>>` and `>>>` produce identical results.
* For negative numbers, `>>>` turns the negative number into a large positive integer.

```java
int neg = -20;

System.out.println("-20 >> 2  = " + (neg >> 2));   // Output: -5
System.out.println("-20 >>> 2 = " + (neg >>> 2));  // Output: 1073741819

```

---

## 3. Two's Complement and Binary Mechanics

Java uses **Two's Complement** representation for signed integer types (`byte`, `short`, `int`, `long`).

### Key Properties of Two's Complement:

1. **Sign Bit:** The most significant bit (MSB / leftmost bit) determines the sign:
* `0` indicates a positive number.
* `1` indicates a negative number.


2. **Representing Negative Numbers:** To find the binary representation of a negative number $-X$:
1. Take the binary of positive $X$.
2. Invert all bits (Bitwise NOT `~`).
3. Add `1`.



#### Example: Representing `-5` in 8-bit Binary

```text
Positive 5:   0000 0101
Invert bits:  1111 1010
Add 1:        1111 1011  <- Representation of -5

```

---

## 4. Bitwise Operators vs Logical Operators

It is critical not to confuse bitwise operators (`&`, `|`) with logical short-circuit operators (`&&`, `||`).

| Feature | Bitwise Operators (`&`, `|`) | Logical Operators (`&&`, `||`) |
| --- | --- | --- |
| **Operand Types** | Integers (`int`, `long`) OR `boolean` | Strictly `boolean` operands |
| **Operation Level** | Operates on individual binary bits | Operates on entire boolean expressions |
| **Short-Circuiting** | ❌ No (Always evaluates both sides) | ✅ Yes (Skips right side if outcome fixed) |
| **Performance** | Bit-level hardware instruction | High-level logical evaluation |

### Short-Circuit Comparison Code

```java
int x = 0;

// Logical AND (&&): Short-circuits! (++x is NOT executed)
if (false && ++x > 0) { }
System.out.println("x with &&: " + x); // Output: 0

// Bitwise AND (&): NO short-circuit! (++x IS executed)
if (false & ++x > 0) { }
System.out.println("x with &: " + x);  // Output: 1

```

---

## 5. Operator Precedence and Associativity

Bitwise operators sit between relational operators and logical operators in terms of precedence.

### Precedence Hierarchy (Highest to Lowest)

1. Unary Complement (`~`)
2. Shift Operators (`<<`, `>>`, `>>>`)
3. Relational Operators (`<`, `>`, `<=`, `>=`)
4. Equality Operators (`==`, `!=`)
5. **Bitwise AND (`&`)**
6. **Bitwise XOR (`^`)**
7. **Bitwise OR (`|`)**
8. Logical AND (`&&`)
9. Logical OR (`||`)

### Associativity

* Unary `~` evaluates **Right to Left**.
* Binary `&`, `|`, `^`, `<<`, `>>`, `>>>` evaluate **Left to Right**.

> **Best Practice:** Always use parentheses `()` when combining bitwise operators with arithmetic or relational operators, as precedence rules can be counter-intuitive.

```java
// ❌ Dangerous: '==' has higher precedence than '&'!
// Evaluates as: 5 & (5 == 5) -> 5 & true (Compile Error)
// boolean check = 5 & 5 == 5; 

// ✅ Correct: Explicit parentheses
boolean check = (5 & 5) == 5; // Output: true

```

---

## 6. Full Implementation Example

```java
public class BitwiseOperatorsDemo {
    public static void main(String[] args) {
        int a = 12; // Binary: 0000 1100
        int b = 25; // Binary: 0001 1001

        System.out.println("--- 1. Bitwise Logical Operations ---");
        System.out.println("a & b : " + (a & b)); // 8
        System.out.println("a | b : " + (a | b)); // 29
        System.out.println("a ^ b : " + (a ^ b)); // 21
        System.out.println("~a    : " + (~a));    // -13 (~12 = -12 - 1)

        System.out.println("\n--- 2. Bit Shift Operations ---");
        int num = 8;
        System.out.println("8 << 2  : " + (num << 2));  // 32  (8 * 4)
        System.out.println("8 >> 2  : " + (num >> 2));  // 2   (8 / 4)

        int negNum = -16;
        System.out.println("-16 >> 2  : " + (negNum >> 2));  // -4
        System.out.println("-16 >>> 2 : " + (negNum >>> 2)); // 1073741820

        System.out.println("\n--- 3. Real-World Applications (Bit Masking) ---");
        // Permissions encoded in bits: READ(1), WRITE(2), EXECUTE(4)
        int READ = 1;    // 0001
        int WRITE = 2;   // 0010
        int EXECUTE = 4; // 0100

        int userPermissions = READ | EXECUTE; // 0101 (User has READ and EXECUTE)

        // Check if user has WRITE permission using Bitwise AND
        boolean hasWrite = (userPermissions & WRITE) != 0;
        boolean hasRead  = (userPermissions & READ) != 0;

        System.out.println("Has Write Permission: " + hasWrite); // false
        System.out.println("Has Read Permission : " + hasRead);  // true

        System.out.println("\n--- 4. Fast Even/Odd Check ---");
        int testVal = 47;
        // Least significant bit (LSB) is 1 for odd numbers, 0 for even numbers
        boolean isOdd = (testVal & 1) == 1;
        System.out.println(testVal + " is odd: " + isOdd); // true
    }
}

```

### Console Output

```text
--- 1. Bitwise Logical Operations ---
a & b : 8
a | b : 29
a ^ b : 21
~a    : -13

--- 2. Bit Shift Operations ---
8 << 2  : 32
8 >> 2  : 2
-16 >> 2  : -4
-16 >>> 2 : 1073741820

--- 3. Real-World Applications (Bit Masking) ---
Has Write Permission: false
Has Read Permission : true

--- 4. Fast Even/Odd Check ---
47 is odd: true

```

---

## 7. Why This Matters

1. **Permission Systems & Flags:** Compacting multiple boolean options into a single integer field (bitmasking) saves memory in databases and APIs.
2. **High-Performance Math:** Bit shifts (`<< 1`, `>> 1`) offer high-speed multiplication and division by powers of 2.
3. **Hardware & Embedded Interfaces:** Interfacing directly with hardware devices, microcontrollers, and low-level system APIs.
4. **Networking Protocols & IP Parsing:** Splitting and packing IP addresses, subnet masks, and network headers into raw bytes.

---

## 8. Common Mistakes to Avoid

1. **Confusing Bitwise (`&`, `|`) with Short-Circuit Logical (`&&`, `||`):**
Using `&` in conditional check disables short-circuiting and will execute both sides, risking `NullPointerException`.
2. **Shift Distance Equal or Greater Than Data Bit-Length:**
Shifting an `int` by 32 bits does **not** clear it to 0. Java uses only the lower 5 bits of the shift distance (`shiftAmount % 32`).
```java
int x = 10;
System.out.println(x << 32); // Output: 10 (32 % 32 = 0 shift!)

```


3. **Unexpected Integer Promotion on `byte` and `short`:**
Bitwise operations automatically promote `byte` and `short` operands to `int` before evaluation.
```java
byte b1 = 4;
// ❌ Compile Error: Bitwise result is promoted to int!
// byte b2 = ~b1; 

// ✅ Explicit cast required
byte b2 = (byte) ~b1;

```



---

## 9. Practice Exercises

### Exercise 1: Fast Number Swap Without Temporary Variable

Swap two integer variables `x` and `y` using only the bitwise XOR (`^`) operator without using a third temporary variable.

```java
public class SwapXOR {
    public static void main(String[] args) {
        int x = 10;
        int y = 25;

        x = x ^ y; // Step 1
        y = x ^ y; // Step 2 (y becomes original x)
        x = x ^ y; // Step 3 (x becomes original y)

        System.out.println("x: " + x + ", y: " + y); // Output: x: 25, y: 10
    }
}

```

### Exercise 2: Tracing Shift Mechanics

Predict the output of the following Java snippet:

```java
int val = -8;
System.out.println(val >> 1);
System.out.println(val >>> 31);

```

**Step-by-Step Breakdown:**

1. `-8 >> 1`: Signed right shift divides `-8` by $2^1 = 2$ -> **`-4`**.
2. `-8 >>> 31`: The sign bit of `-8` is `1`. Unsigned right shift moves the sign bit 31 positions to the right, filling left bits with 0s. The result is **`1`**.

---

## 10. Quick Summary Table

| Operator | Meaning | Syntax | Binary Example | Result (Decimal) |
| --- | --- | --- | --- | --- |
| `&` | Bitwise AND | `a & b` | `1100 & 1001` | `8` (`1000`) |
| `|` | Bitwise OR | `a | b` | `1100 | 1001` | `29` (`11101`) |
| `^` | Bitwise XOR | `a ^ b` | `1100 ^ 1001` | `21` (`10101`) |
| `~` | Bitwise NOT | `~a` | `~0000...0101` | `-6` (`~5 = -6`) |
| `<<` | Signed Left Shift | `a << n` | `5 << 2` | `20` ($5 \times 2^2$) |
| `>>` | Signed Right Shift | `a >> n` | `20 >> 2` | `5` ($\lfloor 20 / 2^2 \rfloor$) |
| `>>>` | Unsigned Right Shift | `a >>> n` | `-20 >>> 2` | `1073741819` (0-filled) |

---

## 11. Related Topics

* **Java Arithmetic Operators:** Standard numeric operations (`+`, `-`, `*`, `/`, `%`).
* **Java Logical Operators:** Boolean evaluation operators (`&&`, `||`, `!`).
* **Primitive Data Types:** Understanding memory sizes of `byte` (8-bit), `short` (16-bit), `int` (32-bit), and `long` (64-bit).

---

## 12. Additional Resources

* [Oracle Java Documentation: Bitwise and Bit Shift Operators](https://www.google.com/search?q=https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html)
* [Java Language Specification (JLS): Bitwise and Shift Operators](https://www.google.com/search?q=https://docs.oracle.com/javase/specs/jls/se21/html/jls-15.html%23jls-15.22)

---

## Key Takeaways

Bitwise operators manipulate integer data at the bit level using Two's Complement representation. Use `&`, `|`, and `^` for bit masking and permission flags, `<<` and `>>` for fast power-of-two multiplication and division, and `>>>` when working with unsigned binary fields or raw byte arrays. Always use parentheses when mixing bitwise and relational operators to avoid operator precedence bugs.

---

*Last Updated : October 7, 2026*
