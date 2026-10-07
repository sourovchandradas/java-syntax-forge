# Unary Operators in Java

## Overview

Unary operators in Java act on a single operand to produce a new value. Unlike binary operators which require two operands (such as `a + b`), unary operators perform immediate tasks such as sign negation, value incrementing/decrementing, boolean inversion, or bitwise bit-flipping.

In Java, unary operators are categorized into:

* **Arithmetic Unary Operators:** Unary plus (`+`), Unary minus (`-`)
* **Increment and Decrement Operators:** Prefix/Postfix increment (`++`), Prefix/Postfix decrement (`--`)
* **Logical Unary Operator:** Logical NOT (`!`)
* **Bitwise Unary Operator:** Bitwise complement (`~`)

---

## Table of Contents

1. [Unary Plus Operator (+)](#unary-plus-operator-)
2. [Unary Minus Operator (-)](#unary-minus-operator--)
3. [Increment Operators (++)](#increment-operators)
4. [Decrement Operators (--)](https://www.google.com/search?q=%234-decrement-operators---)
5. [Logical NOT Operator (!)](#logical-not-operator-)
6. [Bitwise Complement Operator (~)](#bitwise-complement-operator-)
7. [Prefix vs. Postfix Execution Mechanics](#prefix-vs-postfix-execution-mechanics)
8. [Full Implementation Example](#full-implementation-example)
9. [Why This Matters](#why-this-matters)
10. [Common Mistakes to Avoid](#common-mistakes-to-avoid)
11. [Practice Exercises](#practice-exercises)
12. [Quick Summary Table](#quick-summary-table)
13. [Related Topics](#related-topics)
14. [Additional Resources](#additional-resources)
15. [Key Takeaways](#key-takeaways)

---

## Unary Plus Operator (`+`)

### Definition

The unary plus operator (`+`) explicitly indicates a positive numeric value. Because numeric literals are positive by default in Java, it is rarely required in standard code, but it is used for explicit visual symmetry or to trigger unary numeric promotion.

### Syntax

```java
+operand
```

### Example

```java
int a = +5; // Equivalent to int a = 5;
System.out.println(a); // Output: 5
```

### Unary Numeric Promotion

Applying the unary `+` operator to sub-integer types (`byte`, `short`, `char`) automatically promotes the result to `int`.

```java
byte b = 10;
// byte result = +b; // ❌ Compile error: Unary plus promotes byte to int
int result = +b;     // ✅ Compiles cleanly
```

---

## Unary Minus Operator (`-`)

### Definition

The unary minus operator (`-`) negates the sign of a numeric operand, converting positive values to negative and vice versa.

### Syntax

```java
-operand
```

### Example

```java
int a = 10;
int negated = -a;
System.out.println(negated); // Output: -10

int negativeVal = -15;
System.out.println(-negativeVal); // Output: 15 (Negating negative yields positive)
```

> **Note:** Similar to unary plus, applying unary minus to a `byte`, `short`, or `char` promotes the value to an `int`.

---

## Increment Operators (`++`)

### Definition

The increment operator (`++`) increases the value of an integer or floating-point variable by `1`. It operates in two modes: **Prefix** (`++a`) and **Postfix** (`a++`).

### Syntax

```java
++variable; // Prefix
variable++; // Postfix
```

### Example

```java
int count = 5;

// Prefix increment
int prefixVal = ++count; // count becomes 6, then prefixVal is assigned 6
System.out.println("count: " + count + ", prefixVal: " + prefixVal); // Output: count: 6, prefixVal: 6

// Postfix increment
int postfixVal = count++; // postfixVal is assigned 6, then count becomes 7
System.out.println("count: " + count + ", postfixVal: " + postfixVal); // Output: count: 7, postfixVal: 6
```

### Built-in Implicit Casting

Unlike standard addition (`a = a + 1`), the `++` operator automatically casts the result back to the target variable's type.

```java
byte b = 100;
b++; // ✅ Compiles cleanly (Implicitly performs: b = (byte)(b + 1))
```

---

## Decrement Operators (`--`)

### Definition

The decrement operator (`--`) decreases the value of a variable by `1`. Like the increment operator, it comes in **Prefix** (`--a`) and **Postfix** (`a--`) forms.

### Syntax

```java
--variable; // Prefix
variable--; // Postfix
```

### Example

```java
int value = 10;

System.out.println(--value); // Output: 9  (Pre-decrement: reduces value before printing)
System.out.println(value--); // Output: 9  (Post-decrement: prints value, then reduces to 8)
System.out.println(value);   // Output: 8
```

---

## Logical NOT Operator (`!`)

### Definition

The logical NOT operator (`!`) inverts the boolean state of its operand. If applied to `true`, it returns `false`; if applied to `false`, it returns `true`.

### Syntax

```java
!(booleanExpression)
```

### Truth Table

| Operand | `!Operand` |
| --- | --- |
| `true` | `false` |
| `false` | `true` |

### Example

```java
boolean isLoggedIn = false;

if (!isLoggedIn) {
    System.out.println("User must log in first."); // Executes because !false is true
}
```

> **Important:** Unlike languages like C or C++, Java's `!` operator **only** works on `boolean` types and cannot be used with integers or objects.

---

## Bitwise Complement Operator (`~`)

### Definition

The bitwise complement operator (`~`) flips **every bit** of an integer variable (`byte`, `short`, `char`, `int`, `long`). It converts every binary `0` to `1` and every binary `1` to `0`.

### Syntax

```java
~operand
```

### Formula and Execution

In Java, signed integers are represented using **Two's Complement** notation. Thus, for any integer $x$:

$$\sim x = -(x + 1)$$

### Step-by-Step Binary Example (`int a = 5`)

```java
int a = 5;     // Decimal 5 in 32-bit binary: 00000000 00000000 00000000 00000101
int b = ~a;   // Inverted binary bits:        11111111 11111111 11111111 11111010
System.out.println(b); // Output: -6
```

Explanation using the formula: $~5 = -(5 + 1) = -6$.

---

## Prefix vs. Postfix Execution Mechanics

Understanding how prefix and postfix unary operators evaluate inside expressions is crucial for avoiding subtle execution bugs.

### Comparison Summary

| Operator Type | Syntax | Value Returned in Expression | Variable Update Order |
| --- | --- | --- | --- |
| **Prefix Increment** | `++i` | **Updated** value | Increments **before** expression evaluation |
| **Postfix Increment** | `i++` | **Original** value | Increments **after** expression evaluation |
| **Prefix Decrement** | `--i` | **Updated** value | Decrements **before** expression evaluation |
| **Postfix Decrement** | `i--` | **Original** value | Decrements **after** expression evaluation |

### Expression Tracing Example

```java
int x = 3;
int y = x++ + ++x;
// Step 1: x++ evaluates to 3 (x becomes 4 in memory)
// Step 2: ++x increments x from 4 to 5, then evaluates to 5
// Step 3: y = 3 + 5 = 8
System.out.println("x: " + x + ", y: " + y); // Output: x: 5, y: 8
```

---

## Full Implementation Example

```java
public class UnaryOperatorsDemo {
    public static void main(String[] args) {
        int number = 5;
        boolean flag = true;

        System.out.println("--- 1. Unary Plus & Minus ---");
        System.out.println("Unary Plus (+number): " + (+number));   // Output: 5
        System.out.println("Unary Minus (-number): " + (-number)); // Output: -5

        System.out.println("\n--- 2. Increment Operations ---");
        System.out.println("Initial Value: " + number);                   // 5
        System.out.println("Pre-Increment (++number): " + (++number));   // 6 (Increments first)
        System.out.println("Post-Increment (number++): " + (number++)); // 6 (Uses value, then becomes 7)
        System.out.println("Value after Post-Increment: " + number);     // 7

        System.out.println("\n--- 3. Decrement Operations ---");
        System.out.println("Pre-Decrement (--number): " + (--number));   // 6 (Decrements first)
        System.out.println("Post-Decrement (number--): " + (number--)); // 6 (Uses value, then becomes 5)
        System.out.println("Value after Post-Decrement: " + number);     // 5

        System.out.println("\n--- 4. Logical NOT ---");
        System.out.println("Original Flag: " + flag);          // true
        System.out.println("Logical NOT (!flag): " + (!flag)); // false

        System.out.println("\n--- 5. Bitwise Complement ---");
        int bitValue = 10;
        System.out.println("Bitwise Complement (~10): " + (~bitValue)); // Output: -11
    }
}

```

### Console Output

```text
--- 1. Unary Plus & Minus ---
Unary Plus (+number): 5
Unary Minus (-number): -5

--- 2. Increment Operations ---
Initial Value: 5
Pre-Increment (++number): 6
Post-Increment (number++): 6
Value after Post-Increment: 7

--- 3. Decrement Operations ---
Pre-Decrement (--number): 6
Post-Decrement (number--): 6
Value after Post-Decrement: 5

--- 4. Logical NOT ---
Original Flag: true
Logical NOT (!flag): false

--- 5. Bitwise Complement ---
Bitwise Complement (~10): -11
```

---

## Why This Matters

1. **Loop Counters & Navigation:** Unary increment (`++`) and decrement (`--`) power standard loop constructs (`for (int i = 0; i < N; i++)`), iterating over collections and arrays efficiently.
2. **Boolean State Toggling:** The logical NOT (`!`) operator simplifies state inversion flags (e.g., toggling UI visibility, turning active switches on or off):
```java
isVisible = !isVisible; // Flips true to false or false to true
```


3. **Bitwise Mask Clearing:** The bitwise complement (`~`) operator is used alongside bitwise AND (`&=`) in performance-critical software to turn off specific bit flags without altering others:
```java
permissions &= ~READ_MASK; // Revokes read permission while leaving other flags intact
```



---

## Common Mistakes to Avoid

1. **Self-Reassignment Post-Increment Bug:**
Assigning a post-incremented variable back to itself discards the incremented value:
```java
int i = 5;
i = i++; // ❌ Bug: i stays 5! (i++ evaluates to 5, then i increments to 6, then 5 is assigned back)
```


2. **Mixing Logical NOT (`!`) with Non-Boolean Types:**
Unlike C++, Java strict type checking prevents numerical truthiness checks.
```java
int count = 0;
// if (!count) { } // ❌ Compile error: operator ! cannot be applied to int
if (count == 0) { } // ✅ Correct syntax
```


3. **Confusing Logical NOT (`!`) with Bitwise Complement (`~`):**
* Use `!` exclusively for `boolean` operands.
* Use `~` exclusively for integral bitwise manipulations (`byte`, `short`, `int`, `long`).


4. **Multiple In-line Updates in Single Expression:**
Combining multiple prefix/postfix modifications in a single line harms code readability and introduces subtle sequence errors.

---

## Practice Exercises

### Exercise 1: State Inversion and Counter Logic

Write a Java program that simulates a button toggle. Start with `boolean isOn = false` and `int clickCount = 0`. Toggle `isOn` using `!`, increment `clickCount` using post-increment, and print both values.

```java
public class ButtonToggle {
    public static void main(String[] args) {
        boolean isOn = false;
        int clickCount = 0;

        // First click
        isOn = !isOn;
        clickCount++;
        System.out.println("Button On: " + isOn + ", Clicks: " + clickCount); // true, 1

        // Second click
        isOn = !isOn;
        clickCount++;
        System.out.println("Button On: " + isOn + ", Clicks: " + clickCount); // false, 2
    }
}
```

### Exercise 2: Tracing Expression Evaluation

Evaluate the output of the following Java snippet without running it in an IDE:

```java
int a = 10;
int b = ++a + a-- - --a;
```

**Step-by-Step Breakdown:**

1. Initial state: `a = 10`
2. `++a`: Increments `a` to `11`, evaluates to `11`.
3. `a--`: Evaluates to `11`, then decrements `a` to `10`.
4. `--a`: Decrements `a` from `10` to `9`, evaluates to `9`.
5. Expression computation: `11 + 11 - 9 = 13`
6. Final values: **`a = 9`**, **`b = 13`**

---

## Quick Summary Table

| Operator | Meaning | Syntax | Example | Result |
| --- | --- | --- | --- | --- |
| `+` | Unary Plus | `+a` | `+5` | `5` |
| `-` | Unary Minus / Negation | `-a` | `-(5)` | `-5` |
| `++` | Pre-Increment | `++a` | `a = 5; ++a;` | `6` (Updates value before evaluation) |
| `++` | Post-Increment | `a++` | `a = 5; a++;` | `5` (Updates value after evaluation) |
| `--` | Pre-Decrement | `--a` | `a = 5; --a;` | `4` (Updates value before evaluation) |
| `--` | Post-Decrement | `a--` | `a = 5; a--;` | `5` (Updates value after evaluation) |
| `!` | Logical NOT | `!a` | `!true` | `false` |
| `~` | Bitwise Complement | `~a` | `~5` | `-6` (Calculates $-(a+1)$) |

---

## Related Topics

* **Java Arithmetic Operators:** Binary operators (`+`, `-`, `*`, `/`, `%`) operating on two operands.
* **Java Bitwise & Bit Shift Operators:** Low-level bitwise operations (`&`, `|`, `^`, `<<`, `>>`, `>>>`).
* **Java Two's Complement System:** How Java stores signed negative integers in memory.
* **Operator Precedence in Java:** Rules determining precedence between unary and binary operators.

---

## Additional Resources

* [GeeksforGeeks](https://www.geeksforgeeks.org/java/java-unary-operator-with-examples/)

---

## Key Takeaways

Unary operators operate on a single variable or literal to perform mathematical sign changes, state toggles, bit inversions, or increments/decrements. Distinguishing between prefix and postfix evaluation order is essential to write bug-free loops and expressions. Remember that logical NOT (`!`) works exclusively on booleans, while bitwise complement (`~`) inverts binary bits for integer values using two's complement arithmetic.

---

*Last Modified : October 7, 2026*
