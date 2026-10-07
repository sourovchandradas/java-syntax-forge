# Assignment Operators in Java

## Overview

Assignment operators are used to assign values to variables and to combine assignment with arithmetic or bitwise operations. They help you write shorter and cleaner code.

In Java, assignment operators include:
- simple assignment: `=`
- compound assignment: `+=`, `-=`, `*=`, `/=`, `%=`
- bitwise compound assignment: `&=`, `|=`, `^=`, `<<=`, `>>=`, `>>>=`

These operators are useful because they reduce repetition and make code easier to read.

---

## 1. Simple Assignment Operator (`=`)

### Definition
The `=` operator assigns the value on the right side to the variable on the left side.

### Syntax
```java
variable = value;
```

### Example
```java
int a;
int b = 10;

a = b;
System.out.println(a); // Output: 10
```

### How it works
Java evaluates the right-hand side first, then stores the result in the left-hand variable.

```java
int x;
x = 5 + 3; // 8 is calculated first, then stored in x
System.out.println(x); // Output: 8
```

### Key point
`=` is not equality comparison. It stores a value.

---

## 2. Compound Assignment Operators

Compound assignment operators combine an arithmetic operation and assignment into one step.

### Common compound operators
- `+=` add then assign
- `-=` subtract then assign
- `*=` multiply then assign
- `/=` divide then assign
- `%=` modulus then assign

### General form
```java
num += value;   // same as: num = num + value;
num -= value;   // same as: num = num - value;
num *= value;   // same as: num = num * value;
num /= value;   // same as: num = num / value;
num %= value;   // same as: num = num % value;
```

### Why use them?
They make code shorter and more readable.

---

## 3. `+=` Operator

### Definition
`+=` adds the right-hand value to the left-hand variable and stores the result back into the left-hand variable.

### Syntax
```java
num1 += num2; // same as: num1 = num1 + num2;
```

### Example
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;

        num1 += num2;

        System.out.println(num1); // Output: 30
    }
}
```

### Important note about type casting
```java
int x = 5;
// x = x + 4.5; // ❌ compile error
x += 4.5;      // ✅ works, result becomes 9 after implicit cast
System.out.println(x); // Output: 9
```

`+=` allows Java to perform implicit narrowing conversion in some cases.

---

## 4. `-=` Operator

### Definition
`-=` subtracts the right-hand value from the left-hand variable and assigns the result back.

### Syntax
```java
num1 -= num2; // same as: num1 = num1 - num2;
```

### Example
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 20, num2 = 5;

        num1 -= num2;

        System.out.println(num1); // Output: 15
    }
}
```

### Example with implicit casting
```java
int x = 10;
// x = x - 2.5; // ❌ compile error
x -= 2.5;      // ✅ works, result becomes 7
System.out.println(x); // Output: 7
```

---

## 5. `*=` Operator

### Definition
`*=` multiplies the left-hand variable by the right-hand value and stores the result.

### Syntax
```java
num1 *= num2; // same as: num1 = num1 * num2;
```

### Example
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 5, num2 = 4;

        num1 *= num2;

        System.out.println(num1); // Output: 20
    }
}
```

### Example with floating value
```java
int x = 4;
x *= 2.5; // 4 * 2.5 = 10.0, then cast to int
System.out.println(x); // Output: 10
```

---

## 6. `/=` Operator

### Definition
`/=` divides the left-hand variable by the right-hand value and stores the result.

### Syntax
```java
num1 /= num2; // same as: num1 = num1 / num2;
```

### Example
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 20, num2 = 4;

        num1 /= num2;

        System.out.println(num1); // Output: 5
    }
}
```

### Important note
For integer values, division does not keep decimals.

```java
int x = 7;
x /= 2;
System.out.println(x); // Output: 3
```

This happens because integer division truncates the fractional part.

---

## 7. `%=` Operator

### Definition
`%=` finds the remainder after division and stores it back.

### Syntax
```java
num1 %= num2; // same as: num1 = num1 % num2;
```

### Example
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 17, num2 = 5;

        num1 %= num2;

        System.out.println(num1); // Output: 2
    }
}
```

### Why it matters
This is useful for:
- checking even or odd numbers
- cyclic indexing
- wrapping values within limits

---

## 8. Bitwise Compound Assignment Operators

These operators combine bitwise operations with assignment.

### List
- `&=` bitwise AND and assign
- `|=` bitwise OR and assign
- `^=` bitwise XOR and assign
- `<<=` left shift and assign
- `>>=` right shift and assign
- `>>>=` unsigned right shift and assign

---

## 9. `&=` Operator

### Definition
`&=` performs bitwise AND between the left and right operands, then assigns the result.

### Syntax
```java
num1 &= num2; // same as: num1 = num1 & num2;
```

### Example
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 5; // Binary: 0101
        int num2 = 3; // Binary: 0011

        num1 &= num2; // Binary: 0001

        System.out.println(num1); // Output: 1
    }
}
```

### Bitwise rule
The result bit is `1` only if both bits are `1`.

---

## 10. `|=` Operator

### Definition
`|=` performs bitwise OR, then assigns the result.

### Syntax
```java
num1 |= num2; // same as: num1 = num1 | num2;
```

### Example
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 5; // Binary: 0101
        int num2 = 3; // Binary: 0011

        num1 |= num2; // Binary: 0111

        System.out.println(num1); // Output: 7
    }
}
```

### Bitwise rule
The result bit is `1` if at least one bit is `1`.

---

## 11. `^=` Operator

### Definition
`^=` performs bitwise XOR (exclusive OR), then assigns the result.

### Syntax
```java
num1 ^= num2; // same as: num1 = num1 ^ num2;
```

### Example
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 5; // Binary: 0101
        int num2 = 3; // Binary: 0011

        num1 ^= num2; // Binary: 0110

        System.out.println(num1); // Output: 6
    }
}
```

### Bitwise rule
The result bit is `1` when the operands differ.

---

## 12. `<<=` Operator

### Definition
`<<=` shifts bits to the left by the specified number of positions and assigns the result.

### Syntax
```java
num1 <<= num2; // same as: num1 = num1 << num2;
```

### Example
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 5; // Binary: 0000 0101

        num1 <<= 2; // Binary: 0001 0100

        System.out.println(num1); // Output: 20
    }
}
```

### Why it matters
Left shifting by `n` positions multiplies the number by `2^n`.

---

## 13. `>>=` Operator

### Definition
`>>=` performs a signed right shift and assigns the result.

### Syntax
```java
num1 >>= num2; // same as: num1 = num1 >> num2;
```

### Example
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = 20; // Binary: 0001 0100

        num1 >>= 2; // Binary: 0000 0101

        System.out.println(num1); // Output: 5
    }
}
```

### Why it matters
Right shifting by `n` positions divides the value by `2^n` using integer division while preserving the sign bit.

---

## 14. `>>>=` Operator

### Definition
`>>>=` performs an unsigned right shift and assigns the result.

### Syntax
```java
num1 >>>= num2; // same as: num1 = num1 >>> num2;
```

### Example
```java
class Assignment {
    public static void main(String[] args) {
        int num1 = -8;

        num1 >>>= 2;

        System.out.println(num1); // Output: 1073741822
    }
}
```

### Important note
Unlike `>>`, this operator does not preserve the sign bit. It treats the value as unsigned.

---

## 15. Full Example

```java
public class AssignmentOperators {
    public static void main(String[] args) {
        // Simple assignment
        int a = 10;
        int b = 20;

        // Arithmetic assignment
        a += b;   // a = a + b -> 30
        System.out.println("+= : " + a);

        a -= 5;   // a = a - 5 -> 25
        System.out.println("-= : " + a);

        a *= 2;   // a = a * 2 -> 50
        System.out.println("*= : " + a);

        a /= 5;   // a = a / 5 -> 10
        System.out.println("/= : " + a);

        a %= 3;   // a = a % 3 -> 1
        System.out.println("%= : " + a);

        // Bitwise assignment
        int x = 5;
        int y = 3;

        x &= y;   // 5 & 3 = 1
        System.out.println("&= : " + x);

        x |= 2;   // 1 | 2 = 3
        System.out.println("|= : " + x);

        x ^= 1;   // 3 ^ 1 = 2
        System.out.println("^= : " + x);

        // Shift assignment
        int num = 8;

        num <<= 1; // 8 << 1 = 16
        System.out.println("<<= : " + num);

        num >>= 2; // 16 >> 2 = 4
        System.out.println(">>= : " + num);

        num >>>= 1; // 4 >>> 1 = 2
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

## Quick Summary Table

| Operator | Meaning | Example | Result |
|----------|---------|---------|--------|
| `=` | Assign | `a = 5` | `a = 5` |
| `+=` | Add then assign | `a += 3` | `a = a + 3` |
| `-=` | Subtract then assign | `a -= 2` | `a = a - 2` |
| `*=` | Multiply then assign | `a *= 4` | `a = a * 4` |
| `/=` | Divide then assign | `a /= 2` | `a = a / 2` |
| `%=` | Modulus then assign | `a %= 3` | `a = a % 3` |
| `&=` | Bitwise AND then assign | `a &= b` | `a = a & b` |
| `|=` | Bitwise OR then assign | `a |= b` | `a = a | b` |
| `^=` | Bitwise XOR then assign | `a ^= b` | `a = a ^ b` |
| `<<=` | Left shift then assign | `a <<= 2` | `a = a << 2` |
| `>>=` | Signed right shift then assign | `a >>= 2` | `a = a >> 2` |
| `>>>=` | Unsigned right shift then assign | `a >>>= 2` | `a = a >>> 2` |

---

## Key Takeaways

- Assignment operators assign values to variables.
- Compound assignment operators shorten code and combine assignment with arithmetic.
- `=` is simple assignment; `+=`, `-=`, `*=`, `/=`, `%=` are arithmetic assignment operators.
- `&=`, `|=`, `^=`, `<<=`, `>>=`, and `>>>=` are bitwise assignment operators.
- They improve readability and reduce repetition.

---

## Conclusion

Assignment operators are essential in Java because they simplify common programming tasks. Whether you are doing arithmetic, bitwise operations, or shifting values, these operators help keep code clean and efficient.

Understanding them is important for writing concise and professional Java code.
