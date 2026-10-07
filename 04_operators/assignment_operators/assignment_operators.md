# Assignment Operators in Java

## Overview
















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
