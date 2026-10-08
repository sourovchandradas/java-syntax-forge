# StringBuffer Class in Java

## Overview

The `StringBuffer` class in Java represents a mutable sequence of characters. Unlike standard Java `String` objects—which are immutable and require creating a new object for every modification—`StringBuffer` allows in-place modifications without allocating new objects every time.

All public methods in `StringBuffer` are **synchronized**, making it thread-safe and ideal for multithreaded environments where multiple threads modify the same character buffer.

### What This Guide Covers

* **Mutability & Core Features:** Modifying strings in-place without object re-allocation.
* **Interface Hierarchy:** Understanding how `StringBuffer` fits into Java's class architecture.
* **Constructors:** Default buffer sizes, custom capacity allocation, and initialization from existing strings.
* **Core Operations:** Step-by-step breakdowns of `append()`, `insert()`, `replace()`, `delete()`, `reverse()`, `capacity()`, and `length()`.
* **Method Reference Table:** Comprehensive list of all utility methods provided by `StringBuffer`.
* **Performance Trade-offs:** Thread safety vs. execution speed compared to `StringBuilder`.

---

## Table of Contents

1. [1. Overview of StringBuffer](https://www.google.com/search?q=%231-overview-of-stringbuffer)
2. [2. Interface Hierarchy](https://www.google.com/search?q=%232-interface-hierarchy)
3. [3. Constructors of StringBuffer Class](https://www.google.com/search?q=%233-constructors-of-stringbuffer-class)
4. [4. Detailed Breakdown of Core Methods](https://www.google.com/search?q=%234-detailed-breakdown-of-core-methods)
* [Method 1: append()](https://www.google.com/search?q=%23method-1-append)
* [Method 2: insert()](https://www.google.com/search?q=%23method-2-insert)
* [Method 3: replace()](https://www.google.com/search?q=%23method-3-replace)
* [Method 4: delete()](https://www.google.com/search?q=%23method-4-delete)
* [Method 5: reverse()](https://www.google.com/search?q=%23method-5-reverse)
* [Method 6: capacity()](https://www.google.com/search?q=%23method-6-capacity)
* [Method 7: length()](https://www.google.com/search?q=%23method-7-length)


5. [5. Full Implementation Example](https://www.google.com/search?q=%235-full-implementation-example)
6. [6. Advantages and Limitations](https://www.google.com/search?q=%236-advantages-and-limitations)
7. [7. Comprehensive StringBuffer Methods Reference](https://www.google.com/search?q=%237-comprehensive-stringbuffer-methods-reference)
8. [8. Common Mistakes to Avoid](https://www.google.com/search?q=%238-common-mistakes-to-avoid)
9. [9. Practice Exercises](https://www.google.com/search?q=%239-practice-exercises)
10. [10. Key Takeaways](https://www.google.com/search?q=%2310-key-takeaways)

---

## 1. Overview of StringBuffer

In Java, modifying a standard `String` inside a loop or during frequent text manipulation generates multiple temporary objects in memory. `StringBuffer` mitigates this performance penalty by maintaining a dynamic array of characters that expands as text is appended or altered.

### Basic Usage Example

```java
public class Geeks {
    public static void main(String[] args) {
        // Creating StringBuffer instance
        StringBuffer s = new StringBuffer();

        // Appending text directly to the existing buffer
        s.append("Hello");
        s.append(" ");
        s.append("world");

        // Converting StringBuffer back to String
        String str = s.toString();
        System.out.println(str);
    }
}

```

**Output:**

```text
Hello world

```

---

## 2. Interface Hierarchy

`StringBuffer` belongs to the `java.lang` package and inherits from `Object` while implementing three core interfaces:

```text
java.lang.Object
   └── java.lang.AbstractStringBuilder
        └── java.lang.StringBuffer
             ├── implements java.io.Serializable
             ├── implements java.lang.Appendable
             └── implements java.lang.CharSequence

```

### Interfaces Implemented

* **`CharSequence`:** Provides read-only access to character sequences (`charAt()`, `length()`, `subSequence()`).
* **`Appendable`:** Allows character sequences and values to be appended (`append()`).
* **`Serializable`:** Enables `StringBuffer` state to be serialized for storage or network transfer.

---

## 3. Constructors of StringBuffer Class

`StringBuffer` offers three overloaded constructors depending on capacity and initial content requirements:

| Constructor | Initial Capacity | Description |
| --- | --- | --- |
| `StringBuffer()` | **16 characters** | Allocates an empty buffer with room for 16 characters. |
| `StringBuffer(int capacity)` | **User-defined** | Allocates an empty buffer with a explicitly set capacity. |
| `StringBuffer(String str)` | **`str.length() + 16`** | Allocates a buffer containing the specified string plus room for 16 extra characters. |

### Constructor Code Example

```java
public class Geeks {
    public static void main(String[] args) {
        // 1. Default constructor (capacity = 16)
        StringBuffer sb1 = new StringBuffer();
        sb1.append("Hello");
        System.out.println("Default Constructor: " + sb1);

        // 2. Specified capacity constructor (capacity = 50)
        StringBuffer sb2 = new StringBuffer(50);
        sb2.append("Java Programming");
        System.out.println("With Capacity 50: " + sb2);

        // 3. String initialization constructor (capacity = 7 + 16 = 23)
        StringBuffer sb3 = new StringBuffer("Welcome");
        sb3.append(" to Java");
        System.out.println("With String: " + sb3);
    }
}

```

**Output:**

```text
Default Constructor: Hello
With Capacity 50: Java Programming
With String: Welcome to Java

```

---

## 4. Detailed Breakdown of Core Methods

### 1. `append()` Method

Concatenates the string representation of any primitive or object to the end of the current buffer.

```java
import java.io.*;

class Geeks {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java"); // Original buffer is modified directly
        System.out.println(sb);
    }
}

```

**Output:**

```text
Hello Java

```

---

### 2. `insert()` Method

Inserts the specified text into the buffer at the designated 0-based offset position.

```java
import java.io.*;

class Geeks {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1, "Java"); // Inserts "Java" starting at index 1
        
        System.out.println(sb);
    }
}

```

**Output:**

```text
HJavaello 

```

---

### 3. `replace()` Method

Replaces characters from `beginIndex` up to `endIndex - 1` with the given string.

```java
import java.io.*;

class Geeks {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.replace(1, 3, "Java"); // Replaces characters at indices 1 and 2
        System.out.println(sb);
    }
}

```

**Output:**

```text
HJavalo

```

---

### 4. `delete()` Method

Removes characters starting from `beginIndex` up to `endIndex - 1`.

```java
import java.io.*;

class Geeks {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(1, 3); // Deletes characters at index 1 and 2 ('e', 'l')
        System.out.println(sb);
    }
}

```

**Output:**

```text
Hlo

```

---

### 5. `reverse()` Method

Reverses the entire sequence of characters stored in the `StringBuffer`.

```java
import java.io.*;

class Geeks {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.reverse();
        System.out.println(sb);
    }
}

```

**Output:**

```text
olleH

```

---

### 6. `capacity()` Method

Returns the current total allocated character capacity.

> **Automatic Expansion Formula:**
> When character count exceeds current capacity, Java automatically reallocates memory using:
> 
> $$\text{New Capacity} = (\text{Old Capacity} \times 2) + 2$$
> 
> 

```java
import java.io.*;

class Geeks {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer(); // Default initial capacity = 16
      
        System.out.println(sb.capacity()); // 16
        sb.append("Hello");
      
        System.out.println(sb.capacity()); // Still 16 (length 5 <= 16)
        sb.append("java is my favourite language"); // Total length = 34
        
        // Exceeds 16 -> Reallocates: (16 * 2) + 2 = 34
        System.out.println(sb.capacity());
    }
}

```

**Output:**

```text
16
16
34

```

---

### 7. `length()` Method

Returns the actual number of characters currently present in the buffer.

```java
import java.io.*;

class Geeks {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("GeeksforGeeks");

        int len = s.length();
        System.out.println("Length of string GeeksforGeeks=" + len);
    } 
}

```

**Output:**

```text
Length of string GeeksforGeeks=13

```

---

## 5. Full Implementation Example

```java
public class StringBufferMasterDemo {
    public static void main(String[] args) {
        // Initializing with explicit capacity
        StringBuffer buffer = new StringBuffer(20);
        
        System.out.println("Initial Capacity : " + buffer.capacity()); // 20
        System.out.println("Initial Length   : " + buffer.length());   // 0

        // Method Chaining Demonstrations
        buffer.append("Thread")
              .append("-Safe")
              .append(" Buffer");
        
        System.out.println("\nAfter Append     : " + buffer);
        System.out.println("Updated Length   : " + buffer.length());
        System.out.println("Updated Capacity : " + buffer.capacity());

        // Insertion & Replacement
        buffer.insert(0, "Java ");
        System.out.println("After Insert     : " + buffer);

        buffer.replace(0, 4, "Core");
        System.out.println("After Replace    : " + buffer);

        // Deletion & Reversal
        buffer.delete(0, 5);
        System.out.println("After Deletion   : " + buffer);

        buffer.reverse();
        System.out.println("After Reversal   : " + buffer);
    }
}

```

### Console Output

```text
Initial Capacity : 20
Initial Length   : 0

After Append     : Thread-Safe Buffer
Updated Length   : 18
Updated Capacity : 20

After Insert     : Java Thread-Safe Buffer
After Replace    : Core Thread-Safe Buffer
After Deletion   : Thread-Safe Buffer
After Reversal   : reffuB efaS-daerhT

```

---

## 6. Advantages and Limitations

### Advantages

* **Mutable Operations:** In-place modifications eliminate temporary object generation in the heap.
* **Efficient Modifications:** Concatenations, deletions, and insertions execute far faster than regular `String` operations.
* **Thread-Safe / Synchronized:** Every public method is thread-synchronized, protecting data integrity in concurrent applications.

### Limitations

* **Synchronization Overhead:** Thread synchronization incurs a minor performance lock/unlock penalty.
* **Suboptimal for Single-Threaded Tasks:** In single-threaded contexts, `StringBuilder` is preferred because it avoids locking overhead.

---

## 7. Comprehensive StringBuffer Methods Reference

| Method Signature | Description |
| --- | --- |
| `StringBuffer append(String str)` | Appends text at the end of existing characters. |
| `StringBuffer appendCodePoint(int codePoint)` | Appends code point representation to sequence. |
| `int capacity()` | Returns current total character capacity allocated. |
| `char charAt(int index)` | Returns character at specified index. |
| `IntStream chars()` | Returns an `IntStream` of zero-extended char values. |
| `int codePointAt(int index)` | Returns Unicode code point at index. |
| `int codePointBefore(int index)` | Returns Unicode code point before index. |
| `int codePointCount(int begin, int end)` | Counts Unicode code points in index range. |
| `IntStream codePoints()` | Returns stream of code point values from sequence. |
| `StringBuffer delete(int start, int end)` | Deletes sequence from `start` to `end - 1`. |
| `StringBuffer deleteCharAt(int index)` | Deletes character at specified index location. |
| `void ensureCapacity(int minimumCapacity)` | Guarantees capacity is at least equal to minimum parameter. |
| `void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)` | Copies characters into destination array. |
| `int indexOf(String str)` | Finds index of first occurrence of substring. |
| `int indexOf(String str, int fromIndex)` | Finds index of first occurrence starting from `fromIndex`. |
| `StringBuffer insert(int offset, String str)` | Inserts text at specified position. |
| `int lastIndexOf(String str)` | Finds index of last occurrence of substring. |
| `int lastIndexOf(String str, int fromIndex)` | Finds index of last occurrence backwards from `fromIndex`. |
| `int length()` | Returns total character count in buffer. |
| `int offsetByCodePoints(int index, int codePointOffset)` | Returns index offset by code point count. |
| `StringBuffer replace(int start, int end, String str)` | Replaces range from `start` to `end - 1` with string. |
| `StringBuffer reverse()` | Reverses sequence order in buffer. |
| `void setCharAt(int index, char ch)` | Sets character at index to specified `ch`. |
| `void setLength(int newLength)` | Sets specific character sequence length. |
| `CharSequence subSequence(int start, int end)` | Returns a new character sequence slice. |
| `String substring(int start)` | Returns substring from `start` to end. |
| `String substring(int start, int end)` | Returns substring from `start` to `end - 1`. |
| `String toString()` | Converts sequence into standard immutable `String`. |
| `void trimToSize()` | Reduces buffer capacity down to current actual length. |

---

## 8. Common Mistakes to Avoid

1. **Confusing `capacity()` with `length()`:**
* `length()` returns the number of characters currently held in the buffer.
* `capacity()` returns the total memory space available before reallocation occurs.


2. **Expecting `equals()` to Compare Text Content:**
`StringBuffer` does **not** override `Object.equals()`. Calling `sb1.equals(sb2)` checks for object reference equality (memory location), not content similarity. Use `sb1.toString().equals(sb2.toString())` to compare text content.
3. **Using `StringBuffer` in Single-Threaded Code:**
Synchronization adds unnecessary processing cost. Prefer `StringBuilder` for non-threaded environments.

---

## 9. Practice Exercises

### Exercise 1: String Reversal Without `reverse()`

Recreate the functionality of `sb.reverse()` manually using `length()`, `charAt()`, and `setCharAt()`.

```java
public class PracticeExercise1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Developer");
        int left = 0;
        int right = sb.length() - 1;

        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }

        System.out.println("Manually Reversed: " + sb); // Output: repolreveD
    }
}

```

---

### Exercise 2: Tracing Capacity Expansion

Predict the output of the following code:

```java
StringBuffer sb = new StringBuffer("Java");
System.out.println(sb.capacity());
sb.append(" is an awesome object-oriented language");
System.out.println(sb.capacity());

```

**Step-by-Step Expansion Calculation:**

1. Initial content `"Java"` has length `4`.
2. Initial capacity is $4 + 16 = 20$.
3. Appended text length is 39 characters. Total sequence length becomes $4 + 39 = 43$.
4. Exceeds capacity 20. Reallocation formula: $(\text{Old Capacity} \times 2) + 2 = (20 \times 2) + 2 = 42$.
5. Since $43 > 42$, the buffer directly resizes to match required length $43$.
6. Output:
```text
20
43

```



---

## 10. Key Takeaways

* `StringBuffer` provides thread-safe, mutable character sequence manipulation.
* Default initial buffer capacity is **16 characters** (or `str.length() + 16` when initialized with a String).
* Reallocation formula when exceeding capacity is $(\text{Old Capacity} \times 2) + 2$ (or exact target length if larger).
* Always use `StringBuilder` if thread safety is not required to benefit from higher single-threaded performance.

---

*Last Modified: October 9, 2026*
