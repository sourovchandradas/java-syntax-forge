# Introduction to Arrays in Java

An **array** is a foundational linear data structure in Java used to store a fixed-size collection of elements of the same data type in **contiguous memory locations**. It allows programmers to manipulate multiple items using a single variable name combined with zero-based index access.

## Overview

In Java, arrays are dynamically allocated objects created on the **Heap memory**. They provide constant-time $O(1)$ random access to elements using their index position.

### Key Characteristics

* **Homogeneous Elements:** Stores data items of the same data type—either primitives (e.g., `int`, `char`, `boolean`) or reference types (e.g., `String`, custom objects).
* **Contiguous Allocation:**
  * **Primitive Arrays:** Direct values are stored sequentially in memory.
  * **Object Arrays:** Sequential references (pointers to Heap objects) are stored.
* **Fixed Length:** Once instantiated, an array's length cannot be expanded or shrunk.
* **Default Initialization:** Array elements created using `new` are assigned initial default values (`0` for numbers, `false` for booleans, `null` for reference objects).

---

## Table of Contents

1. [Syntax & Declaration](#syntax--declaration)
2. [Memory Architecture & Indexing](#memory-architecture--indexing)
3. [Array Execution Flowchart](#array-execution-flowchart)
4. [Pure Java Code Examples](#pure-java-code-examples)
   * [Example 1: Primitive & Reference Arrays](#example-1-primitive--reference-arrays)
   * [Example 2: Core Array Operations](#example-2-core-array-operations)
   * [Example 3: Array of Objects](#example-3-array-of-objects)
   * [Example 4: Passing and Returning Arrays from Methods](#example-4-passing-and-returning-arrays-from-methods)
5. [Traceback & Common Bug Analysis](#traceback--common-bug-analysis)
6. [Practice Exercises](#practice-exercises)
7. [Quick Reference Table](#quick-reference-table)
8. [Key Takeaways](#key-takeaways)

---

## Syntax & Declaration

Java supports two main syntaxes for array declaration and instantiation:

### 1. Declaration and Dynamic Allocation

```java
// Declaration syntax (Recommended)
dataType[] arrayName;

// Memory allocation with fixed capacity
arrayName = new dataType[arraySize];

// Combined single-line statement
dataType[] arrayName = new dataType[arraySize];
```

### 2. Direct Literal Initialization

```java
// Size is automatically determined by the element count
dataType[] arrayName = { element1, element2, element3 };
```

---

## Memory Architecture & Indexing

Java arrays utilize **zero-based indexing**. For an array of length $N$, valid index bounds are defined as:

$$
0 \le \text{index} \le N - 1
$$

### Address Calculation Formula

The memory offset for accessing element at index $i$ is calculated as:

$$
\text{Address}(A[i]) = \text{Base Address} + (i \times \text{Size of Data Type})
$$

---

## Array Execution Flowchart

The diagram below shows how Java safely processes element access and update requests:

```mermaid
    Start[Start: Access/Update arr[index]] --> Check{Is 0 <= index < arr.length?}
    Check -- Yes --> Access[Locate Memory Address via Offset]
    Access --> Process[Perform Read / Write Operation]
    Process --> End[Complete Execution]
    Check -- No --> Exception[JVM Throws ArrayIndexOutOfBoundsException]
    Exception --> Terminate[Program Execution Terminated]
```

---

## Pure Java Code Examples

### Example 1: Primitive & Reference Arrays

Demonstrates array initialization for primitive types (`int`) and reference types (`String`).

```java
public class ArrayTypeDemo {
    public static void main(String[] args) {
        // Primitive array initialization
        int[] numbers = {10, 20, 30, 40};

        System.out.print("Primitive Array -> ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Reference (Object) array initialization
        String[] names = {"Lakshit", "Rahul", "Pankaj"};

        System.out.print("Non-Primitive Array -> ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
    }
}
```

#### Output
```text
Primitive Array -> 10 20 30 40 
Non-Primitive Array -> Lakshit Rahul Pankaj 
```

---

### Example 2: Core Array Operations

Demonstrates accessing, modifying, measuring size, and traversing array elements.

```java
public class ArrayOperationsDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 12, 16};

        // 1. Accessing elements
        System.out.println("First element (index 0): " + arr[0]);
        System.out.println("Fourth element (index 3): " + arr[3]);

        // 2. Getting Array Size
        System.out.println("Array Size: " + arr.length);

        // 3. Updating an element
        arr[0] = 90;
        System.out.println("Updated first element: " + arr[0]);

        // 4. Traversing array
        System.out.print("Traversed Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
```

#### Output
```text
First element (index 0): 2
Fourth element (index 3): 12
Array Size: 5
Updated first element: 90
Traversed Array: 90 4 8 12 16 
```

---

### Example 3: Array of Objects

Demonstrates creating custom class objects inside reference arrays.

```java
class Student {
    public int rollNo;
    public String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class ObjectArrayDemo {
    public static void main(String[] args) {
        // Allocating space for 5 Student references
        Student[] students = new Student[5];

        // Instantiating objects into array slots
        students[0] = new Student(1, "Aman");
        students[1] = new Student(2, "Vaibhav");
        students[2] = new Student(3, "Shikar");
        students[3] = new Student(4, "Dharmesh");
        students[4] = new Student(5, "Mohit");

        // Displaying contents
        for (int i = 0; i < students.length; i++) {
            System.out.println("Element at " + i + " : { " 
                               + students[i].rollNo + " " 
                               + students[i].name + " }");
        }
    }
}
```

#### Output
```text
Element at 0 : { 1 Aman }
Element at 1 : { 2 Vaibhav }
Element at 2 : { 3 Shikar }
Element at 3 : { 4 Dharmesh }
Element at 4 : { 5 Mohit }
```

---

### Example 4: Passing and Returning Arrays from Methods

Demonstrates passing arrays as arguments and returning array references from methods.

```java
public class MethodArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 5, 4};

        // Pass array to helper method
        calculateSum(numbers);

        // Receive returned array from method
        int[] generated = generatePresetArray();
        System.out.print("Returned Array: ");
        for (int val : generated) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array values: " + sum);
    }

    public static int[] generatePresetArray() {
        return new int[]{1, 2, 3};
    }
}
```

#### Output
```text
Sum of array values: 15
Returned Array: 1 2 3 
```

---

## Traceback & Common Bug Analysis

### Bug 1: Array Index Out Of Bounds Exception

#### Faulty Code
```java
public class IndexBug {
    public static void main(String[] args) {
        int[] numbers = new int[4]; // Valid indices: 0, 1, 2, 3
        System.out.println(numbers[5]); // Attempting to access invalid index 5
    }
}
```

#### Traceback Output
```text
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
	at IndexBug.main(IndexBug.java:4)
```

* **Root Cause:** Accessing an index outside $0 \le \text{index} < \text{arr.length}$. Index `5` is beyond the array's maximum valid index `3`.
* **Fix:** Verify indices before lookup or use condition `i < arr.length` inside loops.

---

### Bug 2: Accessing Uninstantiated Object Elements

#### Faulty Code
```java
public class NullElementBug {
    public static void main(String[] args) {
        Student[] list = new Student[3]; // Allocates reference array slots, initialized to null
        System.out.println(list[0].name); // Invoking field on null reference
    }
}
```

#### Traceback Output
```text
Exception in thread "main" java.lang.NullPointerException: Cannot read field "name" because "list[0]" is null
	at NullElementBug.main(NullElementBug.java:4)
```

* **Root Cause:** `new Student[3]` allocates memory for references, not objects. Individual index slots contain `null` until constructors are explicitly called.
* **Fix:** Instantiate each object element before accessing properties: `list[0] = new Student(1, "Aman");`.

---

### Bug 3: Using `.length()` Method Call on Arrays

#### Faulty Code
```java
public class LengthMethodBug {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr.length()); // Syntax Error: length() as a method
    }
}
```

#### Traceback Output
```text
LengthMethodBug.java:4: error: cannot find symbol
        System.out.println(arr.length());
                              ^
  symbol:   method length()
  location: variable arr of type int[]
1 error
```

* **Root Cause:** Array size is an instance field (`.length`), whereas `String` objects use the method (`.length()`).
* **Fix:** Remove parentheses: `arr.length`.

---

## Practice Exercises

1. **Find Highest & Lowest Elements:**
   Initialize an integer array `{45, 12, 89, 2, 67}` and find both the minimum and maximum values using a single loop iteration.

2. **In-Place Array Reversal:**
   Reverse an integer array `{1, 2, 3, 4, 5}` in-place using a two-pointer approach without instantiating a second array.

3. **Odd/Even Counter:**
   Write a program that traverses an array `{12, 7, 9, 24, 18, 5}` and prints the count of total even and odd numbers.

---

## Quick Reference Table

| Operation / Feature | Code Syntax | Time Complexity | Notes / Description |
| :--- | :--- | :--- | :--- |
| **Allocation** | `int[] arr = new int[N];` | $O(1)$ | Allocates contiguous Heap memory for $N$ elements. |
| **Element Access** | `arr[index]` | $O(1)$ | Direct element lookup via index offset formula. |
| **Element Update** | `arr[index] = val;` | $O(1)$ | Replaces existing value at specified index. |
| **Array Capacity** | `arr.length` | $O(1)$ | Built-in property returning fixed length. |
| **Linear Search** | Loop checking `arr[i] == target` | $O(N)$ | Sequential scan across array elements. |

---

## Key Takeaways

1. **Fast Random Access:** Accessing any element by index runs in $O(1)$ constant time due to contiguous memory allocation.
2. **Fixed Size Limitation:** Array length is immutable after instantiation. Dynamic sizing requires collections like `ArrayList`.
3. **Strict Bounds Checking:** Accessing indices $< 0$ or $\ge \text{arr.length}$ causes `ArrayIndexOutOfBoundsException`.
4. **Reference Arrays Hold Nulls:** Instantiating object arrays only allocates reference slots; objects must be individually created using `new`.
