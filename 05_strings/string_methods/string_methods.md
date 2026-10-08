# String Methods in Java

## Overview

Java String methods are built-in functions provided by the `java.lang.String` class to perform various operations on strings. These methods help in manipulating, comparing, searching, and formatting text efficiently. They simplify string handling, text processing, and data validation in Java applications.

### What This Guide Covers

* **Text Processing & Length:** Extracting string length, characters by index, and character arrays.
* **Substring & Search Operations:** Extracting portions of text, finding occurrences with `indexOf()` and `lastIndexOf()`.
* **String Comparison & Equality:** Exact matching, case-insensitive checks, and lexicographical comparison with `compareTo()`.
* **Case Conversion & Formatting:** Whitespace trimming, lower/upper case conversion, and character replacement.
* **Prefix & Content Checking:** Validating string contents using `contains()` and `startsWith()`.
* **Full Examples, Pitfalls, & Exercises:** Executable code, output tracing, common mistakes, and practice problems with solutions.

---

## Table of Contents

1. [1. Overview of Java String Methods](#-overview-of-java-string-methods)
2. [2. Detailed Breakdown of Common String Methods](#-detailed-breakdown-of-common-string-methods)
* [Method 1: int length()](#-int-length-)
* [Method 2: char charAt(int i)](#-char-charatint-i)
* [Method 3: String substring(int i)](#-string-substringint-i)
* [Method 4: String substring(int i, int j)](https://www.google.com/search?q=%234-string-substringint-i-int-j)
* [Method 5: String concat(String str)](https://www.google.com/search?q=%235-string-concatstring-str)
* [Method 6: int indexOf(String s)](https://www.google.com/search?q=%236-int-indexofstring-s)
* [Method 7: int indexOf(String s, int i)](https://www.google.com/search?q=%237-int-indexofstring-s-int-i)
* [Method 8: int lastIndexOf(String s)](https://www.google.com/search?q=%238-int-lastindexofstring-s)
* [Method 9: boolean equals(Object otherObj)](https://www.google.com/search?q=%239-boolean-equalsobject-otherobj)
* [Method 10: boolean equalsIgnoreCase(String anotherString)](https://www.google.com/search?q=%2310-boolean-equalsignorecasestring-anotherstring)
* [Method 11: int compareTo(String anotherString)](https://www.google.com/search?q=%2311-int-comparetostring-anotherstring)
* [Method 12: int compareToIgnoreCase(String anotherString)](https://www.google.com/search?q=%2312-int-comparetoignorecasestring-anotherstring)
* [Method 13: String toLowerCase()](https://www.google.com/search?q=%2313-string-tolowercase)
* [Method 14: String toUpperCase()](https://www.google.com/search?q=%2314-string-touppercase)
* [Method 15: String trim()](https://www.google.com/search?q=%2315-string-trim)
* [Method 16: String replace(char oldChar, char newChar)](https://www.google.com/search?q=%2316-string-replacechar-oldchar-char-newchar)
* [Method 17: boolean contains(CharSequence sequence)](https://www.google.com/search?q=%2317-boolean-containscharsequence-sequence)
* [Method 18: char[] toCharArray()](https://www.google.com/search?q=%2318-char-tochararray)
* [Method 19: boolean startsWith(String prefix)](#boolean-startswithstring-prefix)
3. [Full Implementation Example](#full-implementation-example)
4. [Why This Matters](#why-this-matters)
5. [Common Mistakes to Avoid](#common-mistakes-to-avoid)
6. [Practice Exercises](#practice-exercises)
7. [Quick Summary Table](#quick-summary-table)
8. [Related Topics](#related-topics)
9. [Additional Resources](#additional-resources)
10. [Key Takeaways](#key-takeaways)

---

## Overview of Java String Methods

Java provides a comprehensive set of built-in methods in the `String` class. These utility methods allow developers to manipulate text without needing to write custom character-iteration loops.

### Introductory Example

```java
public class Geeks {
    public static void main(String[] args) {
        String str = "GeeksforGeeks";

        System.out.println("Length: " + str.length());  
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring: " + str.substring(2, 6));
    }
}
```

**Output:**

```text
Length: 13
Uppercase: GEEKSFORGEEKS
Substring: eksf
```

---

## 2. Detailed Breakdown of Common String Methods

### 1. `int length()`

Provides the total count of characters in the string.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.length());
    }
}
```

**Output:**

```text
13
```

---

### 2. `char charAt(int i)`

Returns the character at the specified $i^{th}$ index (0-based indexing).

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.charAt(7));
    }
}
```

**Output:**

```text
W
```

---

### 3. `String substring(int i)`

Returns the substring starting from the $i^{th}$ index character to the end of the string.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.substring(7));
    }
}
```

**Output:**

```text
World!
```

---

### 4. `String substring(int i, int j)`

Returns the substring starting from index $i$ up to index $j-1$ (index $j$ is excluded).

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.substring(7, 12));
    }
}
```

**Output:**

```text
World
```

---

### 5. `String concat(String str)`

Appends the specified string to the end of the current string.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.concat("!!!"));
    }
}
```

**Output:**

```text
Hello, World!!!!
```

---

### 6. `int indexOf(String s)`

Returns the index within the string of the first occurrence of the specified substring. If the specified string `s` is not found, it returns `-1` by default.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.indexOf("World"));
    }
}
```

**Output:**

```text
7
```

---

### 7. `int indexOf(String s, int i)`

Returns the index within the string of the first occurrence of the specified substring, starting the search at the specified index $i$.

```java
public class Geeks {
    public static void main(String[] args) {
        String str = "Hello, World!";
        System.out.println(str.indexOf("l", 4));
    }
}
```

**Output:**

```text
10
```

---

### 8. `int lastIndexOf(String s)`

Returns the index within the string of the last occurrence of the specified substring. If not found, it returns `-1` by default.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.lastIndexOf("l"));
    }
}
```

**Output:**

```text
10
```

---

### 9. `boolean equals(Object otherObj)`

Compares this string to the specified object to check if their contents are identical.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.equals("Hello, World!"));
    }
}
```

**Output:**

```text
true
```

---

### 10. `boolean equalsIgnoreCase(String anotherString)`

Checks if two strings are equal, ignoring letter case (uppercase vs. lowercase).

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.equalsIgnoreCase("hello, world!"));
    }
}
```

**Output:**

```text
true
```

---

### 11. `int compareTo(String anotherString)`

Compares two strings lexicographically based on the Unicode value of each character. Returns `0` if equal, a negative integer if this string precedes `anotherString`, or a positive integer if it follows it.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.compareTo("Hello, Java!"));
    }
}
```

**Output:**

```text
13
```

---

### 12. `int compareToIgnoreCase(String anotherString)`

Compares two strings lexicographically, ignoring case differences.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.compareToIgnoreCase("hello, java!"));
    }
}
```

**Output:**

```text
13
```

---

### 13. `String toLowerCase()`

Converts all characters in the string to lowercase.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.toLowerCase());
    }
}
```

**Output:**

```text
hello, world!
```

---

### 14. `String toUpperCase()`

Converts all characters in the string to uppercase.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.toUpperCase());
    }
}
```

**Output:**

```text
HELLO, WORLD!
```

---

### 15. `String trim()`

Returns a copy of the string with whitespace removed from both leading and trailing ends. Whitespace characters inside the string remain unchanged.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "   Hello, Trim!   ";
        System.out.println("'" + s.trim() + "'");
    }
}
```

**Output:**

```text
'Hello, Trim!'
```

---

### 16. `String replace(char oldChar, char newChar)`

Returns a new string where every instance of `oldChar` is replaced with `newChar`.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.replace('l', 'x'));
    }
}
```

**Output:**

```text
Hexxo, Worxd!
```

---

### 17. `boolean contains(CharSequence sequence)`

Returns `true` if the string contains the specified character sequence.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.contains("World"));
    }
}
```

**Output:**

```text
true
```

---

### 18. `char[] toCharArray()`

Converts the string into a new character array.

```java
public class Geeks {
    public static void main(String[] args) {
        String str = "Hello";
        char[] chars = str.toCharArray();
        for(char c : chars) {
            System.out.print(c + " ");
        }
    }
}
```

**Output:**

```text
H e l l o 
```

---

### 19. `boolean startsWith(String prefix)`

Returns `true` if the string begins with the specified prefix.

```java
public class Geeks {
    public static void main(String[] args) {
        String s = "Hello, World!";
        System.out.println(s.startsWith("Hello"));
    }
}
```

**Output:**

```text
true
```

---

## Full Implementation Example

```java
public class StringMethodsMasterDemo {

    public static void main(String[] args) {
        String sampleText = "   Java Programming Guide   ";

        // 1. Cleaning & Dimension Checks
        String cleanedText = sampleText.trim();
        System.out.println("Original Length : " + sampleText.length());
        System.out.println("Cleaned Length  : " + cleanedText.length());

        // 2. Case Manipulation & Extraction
        String upper = cleanedText.toUpperCase();
        System.out.println("Uppercase       : " + upper);
        System.out.println("First Character : " + cleanedText.charAt(0));
        System.out.println("Sub-sequence    : " + cleanedText.substring(5, 16));

        // 3. Search & Validation Operations
        System.out.println("Contains 'Prog' : " + cleanedText.contains("Prog"));
        System.out.println("Starts with 'J' : " + cleanedText.startsWith("J"));
        System.out.println("Index of 'a'    : " + cleanedText.indexOf("a"));
        System.out.println("Last Index 'a'  : " + cleanedText.lastIndexOf("a"));

        // 4. Comparison Operations
        String compareTarget = "java programming guide";
        System.out.println("equals() Check  : " + cleanedText.equals(compareTarget));
        System.out.println("equalsIgnoreCase: " + cleanedText.equalsIgnoreCase(compareTarget));
    }
}
```

### Console Output

```text
Original Length : 28
Cleaned Length  : 22
Uppercase       : JAVA PROGRAMMING GUIDE
First Character : J
Sub-sequence    : Programming
Contains 'Prog' : true
Starts with 'J' : true
Index of 'a'    : 1
Last Index 'a'  : 3
equals() Check  : false
equalsIgnoreCase: true
```

---

## Why This Matters

1. **Data Sanitization & Parsing:** Processing user forms, API payloads, and raw files requires methods like `trim()`, `toLowerCase()`, `substring()`, and `indexOf()`.
2. **Search Operations:** Building search filters, text matchers, or URL routing relies heavily on `contains()`, `startsWith()`, and index searches.
3. **Lexicographical Sorting:** Implementing custom search-and-sort algorithms or sorting lists of strings requires `compareTo()` and `compareToIgnoreCase()`.

---

## Common Mistakes to Avoid

1. **Off-by-One Error in `substring(i, j)`:**
Forgetting that the ending index $j$ is **exclusive**. For example, `substring(0, 4)` extracts indices `0, 1, 2, 3` (4 characters in total).
2. **IndexOutOfBoundsException with `charAt()` and `substring()`:**
Passing an index less than `0` or greater than/equal to `length()` causes `StringIndexOutOfBoundsException`. Always verify string bounds beforehand.
3. **Expecting Unassigned Method Output to Modify original String:**
Remembering that `String` objects are immutable. Calling `str.toUpperCase()` or `str.replace()` without assigning the returned string does not alter `str`.
4. **Ignoring `-1` Output from Search Methods:**
Assuming `indexOf()` always returns a valid index. If the target substring is missing, it returns `-1`, which can break subsequent index calculations if unchecked.

---

## Practice Exercises

### Exercise 1: Finding Character Frequency

Write a short code snippet to count how many times the character `'o'` appears in `"Hello, World!"` using string methods.

```java
public class Exercise1 {
    public static void main(String[] args) {
        String text = "Hello, World!";
        int count = 0;
        
        for (char c : text.toCharArray()) {
            if (c == 'o') {
                count++;
            }
        }
        
        System.out.println("Count of 'o': " + count); // Output: 2
    }
}
```

---

### Exercise 2: Tracing Substring & Index Extraction

Predict the output of the following Java snippet:

```java
String msg = "Welcome to Java";
int spaceIdx = msg.indexOf(" ");
String firstWord = msg.substring(0, spaceIdx);
System.out.println(firstWord.toUpperCase());
```

**Step-by-Step Breakdown:**

1. `msg.indexOf(" ")` searches for the first space, returning index `7`.
2. `msg.substring(0, 7)` extracts characters from index `0` to `6`, resulting in `"Welcome"`.
3. `firstWord.toUpperCase()` converts `"Welcome"` to `"WELCOME"`.
4. Output: **`WELCOME`**

---

## Quick Summary Table

| String Method | Description |
| --- | --- |
| `int length()` | Returns the number of characters in the String. |
| `char charAt(int i)` | Returns the character at $i^{th}$ index. |
| `String substring(int i)` | Returns the substring from $i^{th}$ index character to end. |
| `String substring(int i, int j)` | Returns the substring from $i$ to $j-1$ index. |
| `String concat(String str)` | Concatenates specified string to the end of this string. |
| `int indexOf(String s)` | Finds the position of the first occurrence of the given substring within the main string. Returns `-1` if not found. |
| `int indexOf(String s, int i)` | Returns the index within the string of the first occurrence of specified string, starting at specified index. |
| `int lastIndexOf(String s)` | Returns the index within the string of the last occurrence of specified string. Returns `-1` if not found. |
| `boolean equals(Object otherObj)` | Compares this string to the specified object for exact equality. |
| `boolean equalsIgnoreCase(String anotherString)` | Compares string to another string, ignoring case considerations. |
| `int compareTo(String anotherString)` | Compares two strings lexicographically. |
| `int compareToIgnoreCase(String anotherString)` | Compares two strings lexicographically, ignoring case considerations. |
| `String toLowerCase()` | Converts all characters in the String to lower case. |
| `String toUpperCase()` | Converts all characters in the String to upper case. |
| `String trim()` | Returns a copy of the String with whitespaces removed at both ends. |
| `String replace(char oldChar, char newChar)` | Generates a new string where every instance of `oldChar` is substituted with `newChar`. |
| `boolean contains(CharSequence sequence)` | Returns `true` if string contains the given character sequence. |
| `char[] toCharArray()` | Converts this String to a new character array. |
| `boolean startsWith(String prefix)` | Returns `true` if string starts with the specified prefix. |

---

## Related Topics

* **`StringBuilder` and `StringBuffer` Methods:** Mutable alternatives for string concatenation and character manipulation.
* **Regular Expressions (`Pattern` & `Matcher`):** Advanced pattern searching and replacement with `replaceAll()` and `split()`.
* **`CharSequence` Interface:** Common interface implemented by `String`, `StringBuilder`, and `StringBuffer`.

---

## Additional Resources

* [GeeksfoGeeks](https://www.geeksforgeeks.org/java/java-string-methods/)
* [w3schools](https://www.w3schools.com/java/java_ref_string.asp)

---

## Key Takeaways

Java's `String` class offers a rich API for text manipulation, searching, inspection, and comparison. Because `String` objects are immutable, every transformation method (like `toLowerCase()`, `trim()`, or `replace()`) returns a brand-new `String` object without altering the original. Always re-assign the returned string or store it in a new variable to preserve changes.

---

*Last Modified: October 8, 2026*
