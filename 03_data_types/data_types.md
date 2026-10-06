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

**Syntax:**   ```dataType variableName = value;```

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

