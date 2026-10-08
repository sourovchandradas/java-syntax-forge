# Strings and Equality in Java

## Overview

A **String** in Java is an object used to store a sequence of characters enclosed in double quotes. In Java, each character in a string is stored using **16-bit Unicode (UTF-16)** encoding. Strings are **immutable**, meaning their value cannot be changed after creation, and Java provides a rich API for text manipulation, comparison, and concatenation.

Understanding Strings requires mastering how the Java Virtual Machine (JVM) allocates memory via the **String Constant Pool (SCP)**, as well as the distinction between checking memory references (`==`) and evaluating content equality (`.equals()`).

### What This Guide Covers

* **String Fundamentals:** Character encoding (UTF-16), Compact Strings (Java 9+), and basic declarations.
* **Creation Mechanisms:** String Literals (Static Memory) vs. the `new` Keyword (Heap Memory).
* **The `CharSequence` Interface:** Differences between `String`, `StringBuffer`, and `StringBuilder`.
* **String Immutability Mechanics:** Why string modifications create new objects rather than altering existing ones.
* **JVM Memory Storage:** String Constant Pool mechanics, heap vs. stack layout, and the `intern()` method.
* **`==` Operator vs. `.equals()` Method:** Reference equality, primitive comparison, object type compatibility rules, and logical content checks.
* **Common Mistakes, Practice Exercises & Summary:** Error scenarios, output tracing, and comparison reference tables.

---

## Table of Contents

1. [What is a String in Java?](#what-is-a-string-in-java)
2. [Ways of Creating a Java String](ways-of-creating-a-java-string)
3. [Interfaces and Classes in Strings](#interfaces-and-classes-in-strings)
4. [Immutable String Concept](#immutable-string-concept)
5. [How Strings are Stored in Java Memory](#how-strings-are-stored-in-java-memory)
6. [Difference Between == Operator and .equals() Method](#difference-between--operator-and-equals-method)
7. [Deep Dive: Equality Operator (==) Mechanics](#deep-dive-equality-operator--mechanics)
8. [Deep Dive: .equals() Method Mechanics](#deep-dive-equals-method-mechanics)
9. [Why This Matters](#why-this-matters)
10. [Common Mistakes to Avoid](#common-mistakes-to-avoid)
11. [Practice Exercises](#practice-exercises)
12. [Quick Summary Table](#quick-summary-table)
13. [Related Topics](#related-topics)
14. [Additional Resources](#additional-resources)
15. [Key Takeaways](#key-takeaways)

---

## What is a String in Java?

In Java, a String is an object that encapsulates a sequence of characters.

### Key Characteristics

* **Encoding:** Each character is stored using 16-bit Unicode (UTF-16) encoding.
* **Immutability:** Once created, string values cannot be changed in memory.
* **Compact Strings (Java 9+):** Since Java 9, Java internally uses Compact Strings (`byte[]` with a `coder` field) to optimize space, while the JVM does not expose actual object memory addresses.

### Examples

```java
String name = "Geeks";
String num = "1234";
```

### Basic Program Example

```java
public class Geeks {
    // Main Function
    public static void main(String args[]) {
        // Creating Java string using a new keyword
        String str = new String("Geeks");

        System.out.println(str);
    }
}
```

**Output:**

```text
Geeks
```

**Explanation:** The program creates a String object containing `"Geeks"` using the `new` keyword and prints it using `System.out.println()`.

---

## Ways of Creating a Java String

There are two primary ways to create a string in Java:

### 1. String Literal (Static Memory)

A string literal is created by assigning a sequence of characters directly to a String variable using double quotes. Java stores string literals in the **String Constant Pool**, allowing identical string values to share the same object.

```java
String str = "GeeksforGeeks";
```

### 2. Using `new` Keyword (Heap Memory)

Using the `new` keyword creates a new object in heap memory, even if the same string already exists in the pool.

* One object is created in the heap memory.
* The string literal is stored in the string pool (if not already present).
* The reference variable points to the heap object, not the pool.

```java
String str = new String("GeeksforGeeks");
```

---

## Interfaces and Classes in Strings

### CharSequence Interface

The `CharSequence` interface represents a sequence of characters in Java. It provides common methods such as `length()`, `charAt()`, `subSequence()`, and `toString()` for working with character sequences.

Common classes that implement `CharSequence` include:

* **`String`**: An immutable class whose contents cannot be modified after creation; any modification results in a new `String` object.
* **`StringBuffer`**: A mutable and thread-safe class used for string manipulation, particularly when synchronization is required.
* **`StringBuilder`**: A mutable and non-thread-safe class commonly used for efficient string manipulation when synchronization is not required.

---

## Immutable String Concept

In Java, string objects are immutable. **Immutable** simply means unmodifiable or unchangeable. Once a string object is created, its data or state cannot be changed, but a new string object is created when a modification is performed.

```java
public class GFG {
    public static void main(String[] args) {
        String str = "Hello";

        str.concat(" World");

        System.out.println(str);
    }
}
```

**Output:**

```text
Hello
```

**Explanation:** In the above example, `String.concat()` does not modify the original String object. When `str.concat(" World")` is executed:

1. A new String object `"Hello World"` is created.
2. The original String `"Hello"` remains unchanged.
3. Since the new object is not assigned to any variable, it is discarded.

---

## How Strings are Stored in Java Memory

### String Literal Storage

When a String is created using a string literal, the corresponding String object is stored in the **String Pool**, which is part of the heap. The reference variable refers to that pooled String object.

```java
// Example 1: Assigning literal value
String str1 = "Hello"; // Pointing to String Constant Pool

// Example 2: Initializing identical sequence using literals
String str1 = "Hello";
String str2 = "Hello"; // Both point to the same String Constant Pool object
```

### Using `new` Keyword Storage

Strings can also be created using the `new` keyword, which allocates a new object in heap memory. However, the string literal inside it is still stored in the String Constant Pool (if not already present).

```java
String str1 = new String("John"); 
String str2 = new String("Deo");
```

### The `intern()` Method

The `intern()` method returns the canonical String reference from the String Pool. If an equal String is not already present in the pool, it is added to the pool; otherwise, the existing pooled String reference is returned.

```java
// This will add the string to the string constant pool or return existing pooled reference
String internedString = demoString.intern();
```

When a String is created using a string literal, the corresponding String object is stored in the String Pool. When `new String()` is used, a separate String object is created on the heap, while the string literal passed to the constructor is stored in the String Pool if it is not already present. The `intern()` method returns the corresponding canonical String reference from the String Pool.

### String Pool Mechanics

The **String Pool** is a special area in heap memory where Java stores string literals. It helps save memory by reusing existing string objects when the same literal is used multiple times.

```java
String s1 = "Geeks";
String s2 = "Geeks";
// Here, Java reuses the same "Geeks" string from the String Pool for both references.
```

### Memory Structure Example

```java
class Geeks {
    public static void main(String args[]) {
        // Declaring Strings using String literals
        String s1 = "TAT";
        String s2 = "TAT";

        // Declaring Strings using new keyword
        String s3 = new String("TAT");
        String s4 = new String("TAT");

        // Printing all the Strings
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}
```

**Output:**

```text
TAT
TAT
TAT
TAT
```

**Explanation:** `s1` and `s2` use the same String literal, so they refer to the same String Pool object. `s3` and `s4` are created using `new`, so each represents a separate String object on the heap. All four variables contain the same text, `"TAT"`.

> **JVM Memory Area Note:** All objects in Java are stored in a heap. The reference variable points to the object stored in the stack area or can be contained inside other objects which places them in the heap area.

---

## Difference Between `==` Operator and `equals()` Method

In Java, the `equals()` method and the `==` operator are used to compare objects. The main difference is that the string `equals()` method compares the **content equality** of two strings, while the `==` operator compares the **reference or memory location** of objects in heap/pool.

* `equals()` can be overridden to define custom equality.
* For String objects, `equals()` is generally preferred for content comparison.

```java
public class Geeks {
    public static void main(String[] args) {
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 = new String("HELLO");

        System.out.println(s1 == s2);      // true
        System.out.println(s1 == s3);      // false
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true
    }
}
```

**Output:**

```text
true
false
true
true
```

**Explanation:** When we use the `==` operator for `s1` and `s2` comparison, the result is `true` as both have the same address in the String Constant Pool. `s1 == s3` is `false` because `s3` points to a distinct Heap object. Both `.equals()` calls return `true` because the string contents are identical (`"HELLO"`).

---

## Deep Dive: Equality Operator (`==`) Mechanics

The `==` operator is used to compare primitive values and object references.

* For primitive data types, it checks whether the actual values are equal.
* For objects, it checks whether both references point to the exact same object in memory.
* Returns a `boolean` value (`true` or `false`).

### Primitives Comparison Example

```java
class Geeks {
    public static void main(String[] args) {
        // integer-type
        System.out.println(10 == 20); // false

        // char-type
        System.out.println('a' == 'b'); // false

        // char and double type
        System.out.println('a' == 97.0); // true

        // boolean type
        System.out.println(true == true); // true
    }
}
```

**Output:**

```text
false
false
true
true
```

### Type Compatibility Rule for Objects

If we apply `==` for object types, there **must be compatibility** between argument types (either child-to-parent, parent-to-child, or the same type). Otherwise, a **compile-time error** occurs.

```java
class Geeks {
    public static void main(String[] args) {
        Thread t = new Thread();
        Object o = new Object();
        String s = new String("GEEKS");

        System.out.println(t == o); // false (Thread is a child of Object)
        System.out.println(o == s); // false (String is a child of Object)

        // System.out.println(t == s); 
        // ❌ Compile-time error: Incompatible types (Thread and String have no hierarchy relationship)
    }
}
```

**Output:**

```text
false
false
```

---

## Deep Dive: `.equals()` Method Mechanics

The `equals()` method is defined in the `Object` class and is used to compare the **logical equality** of two objects. Many Java classes such as `String`, `Integer`, and `ArrayList` override this method to compare object contents instead of memory references.

* Widely used for comparing `String` and wrapper objects.
* Provides logical/content equality instead of reference equality.

```java
public class Geeks {
    public static void main(String[] args) {
        // Create two new Thread objects
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        // Assign t3 to reference same Thread object as t1
        Thread t3 = t1;

        // Create two String Objects with same content
        String s1 = new String("GEEKS");
        String s2 = new String("GEEKS");

        System.out.println(t1 == t3);      // true
        System.out.println(t1 == t2);      // false
        System.out.println(s1 == s2);      // false

        System.out.println(t1.equals(t2)); // false (Thread does not override equals, so compares references)
        System.out.println(s1.equals(s2)); // true (String overrides equals to compare content)
    }
}
```

**Output:**

```text
true
false
false
false
true
```

---

## Why This Matters

1. **Memory Optimization:** Reusing string literals via the String Constant Pool saves substantial heap memory in large applications.
2. **Avoiding Logic Bugs:** Using `==` instead of `.equals()` when validating strings (such as user credentials or configuration values) can lead to unexpected runtime bugs when strings originate from heap allocations or user input.
3. **Choosing the Right Class:** Knowing when to use `String`, `StringBuffer` (thread-safe), or `StringBuilder` (high performance) directly affects application scalability and memory efficiency.

---

## Common Mistakes to Avoid

1. **Expecting Unassigned String Modifications to Mutate:**
Forgetting that `String` methods like `.concat()`, `.replace()`, or `.toUpperCase()` return new String objects and do not alter the existing string in place.
2. **Using `==` to Compare String Content:**
Relying on `==` for string comparison. While `==` may evaluate to `true` for literals due to SCP pooling, it fails when comparing heap instances created via `new` or dynamic methods.
3. **Comparing Unrelated Class Hierarchies with `==`:**
Attempting to use `==` between two distinct object types that share no parent-child relationship (e.g., `Thread == String`), which results in a compile-time error.

---

## Practice Exercises

### Exercise 1: Tracing Concatenation Output

Predict the output of the following Java program:

```java
public class Test {
    public static void main(String[] args) {
        String str = "Java";
        str.concat("SE");
        System.out.println(str);
    }
}
```

**Output:** `Java`

**Explanation:** `str.concat("SE")` generates a new string object `"JavaSE"`, but because it is not reassigned back to `str`, the reference variable `str` continues to point to `"Java"`.

---

### Exercise 2: Evaluating Equality Triggers

Predict the output of the following Java program:

```java
public class Test {
    public static void main(String[] args) {
        String a = "Geeks";
        String b = new String("Geeks");
        String c = b.intern();

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
    }
}
```

**Output:**

```text
false
true
true
```

**Explanation:**

1. `a == b` is `false` because `a` points to the String Pool while `b` points to a distinct Heap object.
2. `c = b.intern()` returns the canonical reference from the String Pool matching `"Geeks"`, which is identical to `a`. Thus `a == c` is `true`.
3. `a.equals(b)` is `true` because both objects store the character sequence `"Geeks"`.

---

## Quick Summary Table

| Feature | `==` Operator | `equals()` Method |
| --- | --- | --- |
| **Purpose** | Compares primitive values or object references | Compares the contents (logical equality) of objects |
| **Used With** | Primitive types and objects | Objects only |
| **Object Comparison** | Checks whether references point to the same object | Checks whether object contents are equal |
| **Primitive Comparison** | Compares actual values | Not applicable |
| **Return Type** | `boolean` | `boolean` |
| **Can be Overridden** | No | Yes |
| **Default Behavior** | Compares memory references | `Object.equals()` compares references unless overridden |
| **String Comparison** | Compares references | Compares character sequences |
| **Memory Check** | Yes (for objects) | No |
| **Best Use Case** | Checking reference equality | Checking logical/content equality |

---

## Related Topics

* **`StringBuffer` & `StringBuilder`:** Mutable character sequences for single-threaded or synchronized string operations.
* **String Constant Pool (SCP):** JVM internal memory organization and interning details.
* **`CharSequence` Interface:** Common abstraction implemented by Java character classes.

---

## Additional Resources

* [GeeksforGeeks-01](https://www.geeksforgeeks.org/java/strings-in-java/)
* [GeeksforGeeks-02](https://www.geeksforgeeks.org/java/difference-between-and-equals-method-in-java/)
* [w3schools](https://www.w3schools.com/java/java_strings.asp)

---

## Key Takeaways

Strings in Java are immutable reference objects stored using UTF-16 encoding. String literals are stored in the String Constant Pool (SCP) to conserve memory, whereas the `new` keyword allocates separate objects on the heap. Always use `.equals()` to compare string character content, as `==` only checks whether two reference variables point to the exact same memory address.

---

*Last Modified: October 8, 2026*
