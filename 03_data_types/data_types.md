# Data Types in Java

## Overview

Java data types define the type of data a variable can store in a program. They help the compiler allocate memory efficiently and ensure type safety. Java provides two main categories of data types: primitive and non-primitive.

This guide covers:

* **Data Types Hierarchy** - A visual structural tree of Java data types
* **Primitive Data Types** - 8 built-in types for simple values   
* **Non-Primitive (Reference) Data Types** - User-defined or built-in reference objects   
* **Key Advantages & Practices** - Memory efficiency and type safety benefits   

---

## Table of Contents

1. [Java Data Types](#java-data-types)
2. [Primitive Data Types](#primitive-data-types)
3. [Non-Primimtive Data Types](#none-primitive-data-types)
4. [Advantages of Data Types](#advantages-of-data-types)
5. [Common Mistakes and Errors](#common-mistakes-and-errors)
6. [Exercise](#exercise)
7. [Quick Reference](#quick-reference)
8. [Related Topics](#related-topic)
9. [Why this matters](#why-this-matters)
10. [Additional Resources](#additional-resources)

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

## Primitive Data Types
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

### 1. boolean Data Type

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

### 2. byte Date Type

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

### 3. short Data Type

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

### 4. int Data types

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

### 5. long Data Type

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

### 6. float Data Type

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

### 7. double Data Type

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

### 8. char Data Type

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


## Non-Primitive (Reference) Data Types

Non-primitive data types store references (memory addresses) rather than actual values. They are created by users and include types like String, Class, Object, Interface, and Array.

**Easy Think**
Think of non‑primitive types like big boxes that point to other boxes.
* They don’t hold the value directly, they hold the address of the object.
* They are more powerful than primitive types because they can store complex data.

The main kinds of non‑primitive data types are:

### 1. String

In Java, **String** is a **non‑primitive (reference) data type** that represents a sequence of characters.

* **Class:** [String](../../08_string/string.md) is a class in `java.lang` package.
* **Immutable:** Once created, a String cannot be changed. Any modification creates a new String object.
* **Default value:** `null`
* **Usage:** Used to store text such as words, sentences, or any sequence of characters.
* **Syntax:** `String str = "Hello!";`

### Implementation Example
```java
public class data_types {
    public static void main(String[] args){
        String name = "Sourov";
        String message = "Welcomme to Java";
        System.out.println("Name: " + name);
        System.out.println("Message: " + message);
    }
}
```
**Output**
```java
Name: Sourov
Message: Welcomme to Java
```

**Explanation:** The example creates two String objects, name and message, and stores text values in them. The println() statements display these values on the console.

**Note**
```
String cannot be modified after creation.
```

---


### 2. Class



### Implementation Example
```java
class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println(model + " " + year);
    }
}

public class Geeks {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2020);
        myCar.display(); 
    }
}
```


**Output**
```
Mercedes-Benz 2019
```

---

### 3. Object



### Implementation Example
```
class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

public class Geeks {
    public static void main(String[] args) {
        Car myCar = new Car("Honda", 2021);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
    }
}
```

**Output**
```
Car Model: Honda
Car Year: 2021
```

---

### 4. Interface


### Implementation Example
```
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof");
    }
}

public class Geeks {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound();
    }
}
```

**Output**
```
Woof
```

---

### 5. Array



### Implementation Example
```
public class Geeks {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        String[] names = {"Geek1", "Geek2", "Geek3"};
        System.out.println("First number: " + numbers[0]);
        System.out.println("Second name: " + names[1]);
    }
}
```

**Output**
```
First number: 1
Second name: Geek2
```

---

## Advantages of Java Data Types

* **Type Safety:** Ensures variables only hold valid data, reducing runtime bugs.
* **Memory Efficiency:** Allows precise selection of memory size (e.g., using `byte` vs `long`).
* **Early Error Detection:** Helps the compiler identify type-mismatch errors during compilation.
* **Performance Optimization:** Direct use of primitive types boosts execution speed.

---

## Common Mistakes

1. a
2. a
3. a
4. a
5. a

---

## Exercise


---

## References

| Type | Description | Default | Size | Example | Range |
| --- | --- | --- | --- | --- | --- |
| `boolean`<br> | Logical values

 | `false`<br> | Not JVM-defined

 | `true`, `false`<br> | `true` or `false`<br> |
| `byte`<br> | 8-bit signed integer

 | `0`<br> | 1 byte

 | `10`<br> | -128 to 127

 |
| `char`<br> | 16-bit Unicode character

 | `'\u0000'`<br> | 2 bytes

 | `'A'`, `'\u0041'`<br> | 0 to 65,535

 |
| `short`<br> | 16-bit signed integer

 | `0`<br> | 2 bytes

 | `2000`<br> | -32,768 to 32,767

 |
| `int`<br> | 32-bit signed integer

 | `0`<br> | 4 bytes

 | `1000`, `-500`<br> | -2,147,483,648 to 2,147,483,647

 |
| `long`<br> | 64-bit signed integer

 | `0L`<br> | 8 bytes

 | `123456789L`<br> | ±9.22e18

 |
| `float`<br> | 32-bit floating point

 | `0.0f`<br> | 4 bytes

 | `3.14f`<br> | ~6–7 digits precision

 |
| `double`<br> | 64-bit floating point

 | `0.0d`<br> | 8 bytes

 | `3.14159d`<br> | ~15–16 digits precision

 |



---


## Related Topics

---

## Additional Resources


---



*Last updated: October 6, 2026*


