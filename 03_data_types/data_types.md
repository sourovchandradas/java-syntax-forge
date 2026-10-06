# Data Types in Java

## Overview





---

## Table of Contents

1. []()
2. []()
3. []()
4. []()
5. []()

---

## Java Data Types

### What are Data Types?

A data type in Java specifies the type of value a variable can hold and the operations that can be performed on it. Java is a statically typed language, meaning every variable must be declared with a data type at compile time. They help the compiler allocate memory efficiently and ensure type safety.

* Memory allocation determines how much memory is required for each variable
* Operations support defines what operations can be performed on data
* Each data type has a default value when not initialized

**Easy Think:**
Think of data type like a box. The box decides what kind of thing you can put inside. Example: If the box is for numbers, you can’t put text inside.

**Syntax:**   `dataType variableName = value;`

### Types of Data Types

Java data types are broadly divided into two categories:

* **Primitive Data Types:** Store simple values directly in memory.
* **Non-primitive (Reference) Data Types:** Store memory references to objects.  
```
                    +---------------------------------------------------------------------------------------+
                    |                                  DATA TYPES IN JAVA                                   |
                    +---------------------------------------------------------------------------------------+
                                                                |
                                       +------------------------+------------------------+
                                       |                                                 |
                                       v                                                 v
                    +-------------------------------------+           +-------------------------------------+
                    |        Primitive Data Types         |           |      Non-Primitive Data Types       |
                    +-------------------------------------+           +-------------------------------------+
                             |                   |                               |         |         |
                             v                   v                               v         v         v
                      +--------------+    +--------------+                  +--------+ +-------+ +---------+
                      | Boolean Type |    | Numeric Type |                  | String | | Array | | Classes |
                      +--------------+    +--------------+                  +--------+ +-------+ +---------+
                             |                   |
                             v          +--------+--------+
                      +--------------+  |                 |
                      |   boolean    |  v                 v
                      +--------------+ +---------+  +----------------+
                                       | Integer |  | Floating Point |
                                       +---------+  +----------------+
                                            |                |
                                            v                v
                                      +-----------+    +-----------+
                                      |   byte    |    |   float   |
                                      |   short   |    |  double   |
                                      |    int    |    +-----------+
                                      |   long    |
                                      |   char    |
                                      +-----------+
```

### 1. Primitive Data Types
In Java, primitive data types are the most basic types of data. They are predefined by the Java language and store simple values directly in memory, each with a fixed size and range. There are 8 primitive types:
| Type | Description | Default | Size | Example | Range |
| :--- | :--- | :---: | :---: | :--- | :--- |
| `boolean` | Logical values | `false` | Not JVM-defined | `true`, `false` | `true` or `false` |
| `byte` | 8-bit signed integer | `0` | 1 byte | `10` | -128 to 127 |
| `char` | 16-bit Unicode character | `'\u0000'` | 2 bytes | `'A'`, `'\u0041'` | 0 to 65,535 |
| `short` | 16-bit signed integer | `0` | 2 bytes | `2000` | -32,768 to 32,767 |
| `int` | 32-bit signed integer | `0` | 4 bytes | `1000`, `-500` | -2,147,483,648 to 2,147,483,647 |
| `long` | 64-bit signed integer | `0L` | 8 bytes | `123456789L` | ±9.22e18 |
| `float` | 32-bit floating point | `0.0f` | 4 bytes | `3.14f` | ~6–7 digits precision |
| `double` | 64-bit floating point | `0.0d` | 8 bytes | `3.14159d` | ~15–16 digits precision |

---

### 1.1 boolean Data Type

In Java, the boolean data type is a primitive type that can hold only two possible values `true` or `false`

* **Usage:** Boolean is mainly used for logical conditions and control statements like `if`, `while`, `for`.
* **Syntax:** `boolean booleanVar`;

### Implementation Example
```java
public class data_types {
    public static void main(String[] args){
        boolean isFavoriteCar = true;
        boolean isFavoriteFood = false;
        System.out.println("Is Mercedes-Benz your favorite car? " + isFavoriteCar);
        System.out.println("Is Pizza your favorite food? " + isFavoriteFood);
    }
}
```

**Output**
```java
Is Mercedes-Benz your favorite car? true
Is Pizza your favorite food? false
```

---

### 1.2 byte Date Type

An 8-bit signed integer used to save memory in large numeric arrays.

* **Usage:** Mainly used when memory saving is important, especially in large arrays. It is
also useful for working with raw binary data (like file handling, streams).

* **Syntax:** `byte byteVar`

### Implementation Example
```java
public class data_types {
    public static void main(String[] args){
        byte age = 23;
        byte temperature = -3;
        System.out.println("Age: " + age);
        System.out.println("Temperature: " + temperature);
    }
}
```

**Output:**
```java
Age: 23
Temperature: -3
```

---

### 1.3 short Data Type

A 16-bit signed integer often used when memory is limited and values are moderate in size.

**Usage:**  Used when memory saving is important, and the range of values is larger than `byte` but smaller than `int`. Often used in large arrays where memory matters.

**Syntax:** `short shortVar;`

### Implementation Example

```java
public class data_types {
    public static void main(String[] args){
        short people = 1120;
        short temperature = -273;
        System.out.println("Number of people: " + people);
        System.out.println("Temperature: " + temperature);
    }
}
```

**Output:**
```java
Number of people: 1120
Temperature: -273
```

---

### 1.4 int Data types

A 32-bit signed integer and the most commonly used numeric data type.

* **Usage:**  Used for storing whole numbers in most programs. It is the default choice for integer values unless memory saving is critical (`byte`/`short`) or very large numbers are needed (`long`).
* **Syntax:** `int intVar;`
* **Size:** 4 bytes (32 bits)

### Implementation Example
```java
public class data_types {
    public static void main(String[] args){
        int population  = 30000000;
        int distance = 130000000;
        System.out.println("Population: " + population);
        System.out.println("Distance: " + distance);
    }
}
```

**Output:**
```
Population: 30000000
Distance: 130000000
```

---

### 1.5 long Data Type

In Java, the long data type is a primitive integer type used to store very large whole numbers.

* **Usage:** Used when `int` is not enough to store big values, such as population counts, financial calculations, or scientific data.
* **Syntax:** `long longVar;`
* **Size:** 8 bytes (64 bits)

### Implementation Example
```java
public class data_types {
    public static void main(String[] args) {
        long worldPopulation = 7800000000L;
        long lightYears = 9460730472580800L;
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Light Years: " + lightYears);
    }
}
```

**Output**
```java
World Population: 7800000000
Light Year Distance: 9460730472580800
```

---

### 1.6 float Data Type

In Java, the float data type is a primitive type used to store decimal numbers (floating‑point values).

* **Usage:** Used when you need fractional numbers but don’t require very high precision. For more precise values, `double` is preferred.
* **Syntax:** `float floatVar;`
* **Size:** 4 bytes (32 bits)

### Implementation Example
```java
public class data_types {
    public static void main(String[] args) {
        float pi = 3.14f;
        float gravity = 9.81f;
        System.out.println("Pi: " + pi);
        System.out.println("Gravity: " + gravity);
    }
}
```

**Output**
```java
Value of Pi: 3.14
Gravity: 9.81
```

---

### double Data Type

In Java, the double data type is a primitive type used to store decimal numbers with higher precision than float.

* **Usage:** Used when you need more accurate decimal values, such as scientific calculations, financial data, or measurements.
* **Syntax:** `double doubleVar;`
* **Size:** 8 bytes (64 bits)

### Implementation Example
```java
public class data_types {
    public static void main(String[] args) {
        double pi = 3.141592653589793;
        double avogadro = 6.02214076e23;
        System.out.println("Pi: " + pi);
        System.out.println("Avogadro's Number: " + avogadro);
    }
}
```

**Output**
```java
Value of Pi: 3.141592653589793
Avogadro's Number: 6.02214076E23
```

---

### 1.8 char Data Type

A 16-bit Unicode character used to store single symbols or letters.

* **Usage:** Used to represent letters, digits, or symbols. Since Java uses Unicode, `char` can store characters from many languages and special symbols.
* **Syntax:** `char charVar;`
* **Size:** 2 bytes (16 bits)

 ### Implementation Example
 ```java
public class Geeks {
    public static void main(String[] args) {
        char grade = 'A';
        char symbol = '$';
        System.out.println("Grade: " + grade);
        System.out.println("Symbol: " + symbol);
    }
}
```

**Output**
```java
Grade: A
Symbol: $
```

---


## 2. Non-Primitive (Reference) Data Types




---







