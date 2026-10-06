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

### 1.1 Boolean Data Type

In Java, the boolean data type is a primitive type that can hold only two possible values:
* `true`
* `false`
**Usage:** Boolean is mainly used for logical conditions and control statements like `if`, `while`, `for`.

**Syntax:** `boolean booleanVar`;

