# Introduction to Arrays in Java

An **array** is a fundamental linear data structure in Java that holds a fixed number of values of a single data type stored in **contiguous memory locations**. It allows multiple elements to be managed under a single variable name and accessed efficiently using an index.

---

## Overview

In Java, arrays are dynamically allocated objects stored on the **Heap**. They provide fast, direct access to elements using zero-based indexing.

### Core Features
* **Homogeneous Storage:** Stores elements of the same data type (primitives like `int`, `char`, `boolean` or objects like `String`, custom classes).
* **Contiguous Memory Allocation:**
  * **Primitive Arrays:** Stores actual primitive values in adjacent memory slots.
  * **Object (Non-Primitive) Arrays:** Stores references (memory addresses) to objects in contiguous memory slots.
* **Fixed Capacity:** Once instantiated, an array's size cannot be changed.
* **Default Initialization:** Array elements allocated via the `new` keyword are automatically assigned default values (`0` for numeric, `false` for `boolean`, `null` for objects).

---

## Table of Contents
1. [Syntax & Declaration](#syntax--declaration)
2. [Memory Layout](#memory-layout)
3. [Array Operations Flowchart](#array-operations-flowchart)
4. [Pure Java Code Examples](#pure-java-code-examples)
   * [Example 1: Primitive & Non-Primitive Arrays](#example-1-primitive--non-primitive-arrays)
   * [Example 2: Core Array Operations](#example-2-core-array-operations)
   * [Example 3: Arrays of Objects](#example-3-arrays-of-objects)
   * [Example 4: Passing and Returning Arrays from Methods](#example-4-passing-and-returning-arrays-from-methods)
5. [Traceback & Common Error Analysis](#traceback--common-error-analysis)
6. [Practice Exercises](#practice-exercises)
7. [Quick Reference Table](#quick-reference-table)
8. [Key Takeaways](#key-takeaways)

---

## Syntax & Declaration

Java provides two primary ways to declare and initialize arrays:

### 1. Declaration and Allocation (`new` Keyword)

```java
// Declaration
dataType[] arrayName;

// Instantiation with fixed size
arrayName = new dataType[size];

// Combined Declaration & Instantiation
dataType[] arrayName = new dataType[size];
```

### 2. Initialization via Array Literal

```java
// Size is inferred automatically from the number of elements
dataType[] arrayName = { value1, value2, value3 };
```

---

## Memory Layout

Because array indexing is **0-based**, the index range for an array of size $N$ is always:

$$
0 \le \text{index} \le N - 1
$$

### Memory Address Calculation Formula

The exact physical address of an element at index $i$ is calculated using:

$$
\text{Address}(A[i]) = \text{Base Address} + (i \times \text{Size of Data Type})
$$

---

## Array Operations Flowchart

The following flowchart illustrates the safe execution path when accessing or updating array elements by index in Java:

```mermaid
graph TD
    A[Start: Access or Update arr[index]] --> B{Is 0 <= index < arr.length?}
    B -- Yes --> C[Access or Modify Memory Location]
    C --> D[Return Value / Complete Operation]
    B -- No --> E[JVM Throws ArrayIndexOutOfBoundsException]
    E --> F[Execution Aborted]
    D --> G[End]
```

---

## Pure Java Code Examples

### Example 1: Primitive & Non-Primitive Arrays

Demonstrates array literals for primitive types (`int`) and non-primitive reference types (`String`).

```java
public class ArrayTypesDemo {
    public static void main(String[] args) {
        // Primitive array literal
        int[] primitiveArray = {10, 20, 30, 40};
        
        System.out.print("Primitive Array -> ");
        for (int i = 0; i < primitiveArray.length; i++) {
            System.out.print(primitiveArray[i] + " ");
        }
        System.out.println();

        // Non-primitive array (String reference objects)
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

Demonstrates accessing, updating, finding size, and traversing array elements.

```java
public class ArrayOperationsDemo {
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 12, 16};

        // 1. Accessing elements
        System.out.println("First element (index 0): " + arr[0]);
        System.out.println("Fourth element (index 3): " + arr[3]);

        // 2. Size of Array
        System.out.println("Array Size: " + arr.length);

        // 3. Updating element
        arr[0] = 90;
        System.out.println("Updated first element: " + arr[0]);

        // 4. Traversing array elements
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

### Example 3: Arrays of Objects

Demonstrates allocating memory for reference arrays and instantiating individual objects inside the array.

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
        // Declare and allocate array of size 5 for Student references
        Student[] students = new Student[5];

        // Instantiate objects for each index
        students[0] = new Student(1, "Aman");
        students[1] = new Student(2, "Vaibhav");
        students[2] = new Student(3, "Shikar");
        students[3] = new Student(4, "Dharmesh");
        students[4] = new Student(5, "Mohit");

        // Traversing and reading object fields
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

Demonstrates modular code structure by passing array references into helper methods and returning new arrays.

```java
public class MethodArrayDemo {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 2, 5, 4};

        // Pass array to method
        calculateAndPrintSum(numbers);

        // Receive returned array from method
        int[] generatedArray = createPresetArray();
        System.out.print("Returned Array elements: ");
        for (int val : generatedArray) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void calculateAndPrintSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array values: " + sum);
    }

    public static int[] createPresetArray() {
        return new int[] {1, 2, 3};
    }
}
```

#### Output
```text
Sum of array values: 15
Returned Array elements: 1 2 3 
```

---

## Traceback & Common Error Analysis

### Bug 1: Array Index Out Of Bounds Exception (Runtime Error)

#### Faulty Code
```java
public class IndexBug {
    public static void main(String[] args) {
        int[] arr = new int[4]; // Valid indices: 0, 1, 2, 3
        System.out.println(arr[4]); // Out of bounds access
    }
}
```

#### Traceback Error Output
```text
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
	at IndexBug.main(IndexBug.java:4)
```

* **Root Cause:** Index `4` is requested, but the maximum valid index is `arr.length - 1` ($4 - 1 = 3$).
* **Fix:** Ensure loop conditions and direct index access stay within $0 \le \text{index} < \text{arr.length}$.

---

### Bug 2: Uninstantiated Object Elements (NullPointerException)

#### Faulty Code
```java
public class NullElementBug {
    public static void main(String[] args) {
        Student[] students = new Student[3]; // Allocates array slots, but defaults all elements to null
        System.out.println(students[0].name); // Trying to access member on null reference
    }
}
```

#### Traceback Error Output
```text
Exception in thread "main" java.lang.NullPointerException: Cannot read field "name" because "students[0]" is null
	at NullElementBug.main(NullElementBug.java:4)
```

* **Root Cause:** Creating an object array `new Student[3]` only allocates memory for references, initialized to `null`. It does **not** construct the underlying `Student` objects automatically.
* **Fix:** Instantiate each element before accessing properties: `students[0] = new Student(1, "Aman");`.

---

### Bug 3: Using `.length()` Method Call Syntax on Arrays (Compile-Time Error)

#### Faulty Code
```java
public class LengthMethodBug {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(arr.length()); // Trying to call length() as a method
    }
}
```

#### Traceback Error Output
```text
LengthMethodBug.java:4: error: cannot find symbol
        System.out.println(arr.length());
                              ^
  symbol:   method length()
  location: variable arr of type int[]
1 error
```

* **Root Cause:** In Java, `length` is a built-in **property/field** for arrays, not a method call like `String.length()`.
* **Fix:** Remove parentheses: `arr.length`.

---

## Practice Exercises

1. **Find Maximum and Minimum Element:**
   Write a program to initialize an integer array `{45, 12, 89, 2, 67}` and find both the highest and lowest values using a single loop traversal.

2. **Reverse an Array In-Place:**
   Given an integer array `{1, 2, 3, 4, 5}`, reverse the elements directly in memory using a two-pointer approach without creating a second array.

3. **Count Even and Odd Numbers:**
   Write a program that traverses an array `{12, 7, 9, 24, 18, 5}` and counts the total number of even and odd integers present.

---

## Quick Reference Table

| Feature / Operation | Syntax / Expression | Time Complexity | Description |
| :--- | :--- | :--- | :--- |
| **Declaration & Size** | `int[] arr = new int[N];` | $O(1)$ | Allocates continuous memory space for $N$ integers. |
| **Direct Access** | `arr[index]` | $O(1)$ | Fetches element at target index instantly via memory offset formula. |
| **Update Value** | `arr[index] = newValue;` | $O(1)$ | Assigns a new value to the specified index slot. |
| **Array Capacity** | `arr.length` | $O(1)$ | Built-in property returning array element count. |
| **Linear Search** | Loop checking `arr[i] == target` | $O(n)$ | Sequentially scans elements from index $0$ to $N-1$. |

---

## Key Takeaways

1. **Constant Time Access $O(1)$:** Index lookup is extremely fast because array elements reside in contiguous memory locations.
2. **Fixed Size Limitation:** Once created, array capacity cannot dynamically shrink or grow. For dynamic collections, classes like `ArrayList` should be used.
3. **Index Boundaries:** Index range always runs strictly from $0$ to $\text{arr.length} - 1$. Accessing outside throws `ArrayIndexOutOfBoundsException`.
4. **Object Arrays Contain References:** Allocating an array of objects creates slots containing `null` references until constructors are explicitly called for each index.
