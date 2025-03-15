### 📚 **Relational Operators in Java**  

Relational operators in Java are used to **compare two values**. These operators return a **boolean value** (`true` or `false`) based on the comparison.  

---

### ✅ **List of Relational Operators in Java**  

| Operator | Description               | Example (`a = 10, b = 5`) | Result  |
|----------|---------------------------|---------------------------|---------|
| `==`     | Equal to                   | `a == b`                 | `false` |
| `!=`     | Not equal to               | `a != b`                 | `true`  |
| `>`      | Greater than               | `a > b`                  | `true`  |
| `<`      | Less than                  | `a < b`                  | `false` |
| `>=`     | Greater than or equal to   | `a >= b`                 | `true`  |
| `<=`     | Less than or equal to      | `a <= b`                 | `false` |

---

### ✅ **Examples of Relational Operators**  
```java
public class RelationalExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a != b: " + (a != b));  // true
        System.out.println("a > b: " + (a > b));    // true
        System.out.println("a < b: " + (a < b));    // false
        System.out.println("a >= b: " + (a >= b));  // true
        System.out.println("a <= b: " + (a <= b));  // false
    }
}
```

---

### ✅ **Key Points to Remember**  
1. **Comparison Returns Boolean:**  
   - The result of a relational operation is always **true** or **false**.  
   - Example: `10 > 5` → **true**, `3 == 4` → **false**.  

2. **Used in Decision-Making:**  
   - Commonly used in **if-else statements**, **loops**, and **conditions**.  

3. **Applicable to Numeric Data Types:**  
   - Works with `int`, `float`, `double`, `char`, etc.  
   - Example: `'A' < 'B'` → **true** (because ASCII value of 'A' is 65 and 'B' is 66).  

---

### ✅ **Example: Using Relational Operators in Conditions**  
```java
public class RelationalCondition {
    public static void main(String[] args) {
        int age = 18;
        
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
```
**Output:**  
```
You are eligible to vote!
```

## 📚 **Relational Operators in Java – Detailed Explanation**

Relational operators in Java are used to **compare** values. They always return a **boolean result** (`true` or `false`). These operators are commonly used in **decision-making statements**, **loops**, and **conditions**.

---

### ✅ **1. Equal to (`==`)**
- Checks if two values are **equal**.
- Returns `true` if they are the same, otherwise `false`.

#### **Example:**
```java
public class EqualToExample {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 5;
        
        System.out.println(a == b); // true (10 == 10)
        System.out.println(a == c); // false (10 != 5)
    }
}
```
**Output:**
```
true
false
```

---

### ✅ **2. Not Equal to (`!=`)**
- Checks if two values are **not equal**.
- Returns `true` if values are different, otherwise `false`.

#### **Example:**
```java
public class NotEqualExample {
    public static void main(String[] args) {
        int x = 20, y = 25;
        
        System.out.println(x != y); // true (20 != 25)
        System.out.println(x != 20); // false (20 == 20)
    }
}
```
**Output:**
```
true
false
```

---

### ✅ **3. Greater than (`>`)**
- Checks if the **left operand** is **greater** than the right operand.
- Returns `true` if it is greater, otherwise `false`.

#### **Example:**
```java
public class GreaterThanExample {
    public static void main(String[] args) {
        int num1 = 15, num2 = 10;
        
        System.out.println(num1 > num2); // true (15 > 10)
        System.out.println(num2 > 20);   // false (10 is not > 20)
    }
}
```
**Output:**
```
true
false
```

---

### ✅ **4. Less than (`<`)**
- Checks if the **left operand** is **smaller** than the right operand.
- Returns `true` if it is smaller, otherwise `false`.

#### **Example:**
```java
public class LessThanExample {
    public static void main(String[] args) {
        int a = 5, b = 10;
        
        System.out.println(a < b); // true (5 < 10)
        System.out.println(b < 5); // false (10 is not < 5)
    }
}
```
**Output:**
```
true
false
```

---

### ✅ **5. Greater than or Equal to (`>=`)**
- Checks if the **left operand** is **greater than or equal to** the right operand.
- Returns `true` if it is either **greater or equal**, otherwise `false`.

#### **Example:**
```java
public class GreaterThanOrEqualExample {
    public static void main(String[] args) {
        int a = 10, b = 10, c = 5;
        
        System.out.println(a >= b); // true (10 >= 10)
        System.out.println(a >= c); // true (10 > 5)
        System.out.println(c >= a); // false (5 is not >= 10)
    }
}
```
**Output:**
```
true
true
false
```

---

### ✅ **6. Less than or Equal to (`<=`)**
- Checks if the **left operand** is **less than or equal to** the right operand.
- Returns `true` if it is either **smaller or equal**, otherwise `false`.

#### **Example:**
```java
public class LessThanOrEqualExample {
    public static void main(String[] args) {
        int x = 8, y = 10, z = 8;
        
        System.out.println(x <= y); // true (8 <= 10)
        System.out.println(x <= z); // true (8 == 8)
        System.out.println(y <= x); // false (10 is not <= 8)
    }
}
```
**Output:**
```
true
true
false
```

---

## 🎯 **Summary of Relational Operators**
| Operator | Description                  | Example (`a = 10, b = 5`) | Result |
|----------|------------------------------|---------------------------|--------|
| `==`     | Equal to                     | `a == b`                  | `false` |
| `!=`     | Not equal to                 | `a != b`                  | `true`  |
| `>`      | Greater than                 | `a > b`                   | `true`  |
| `<`      | Less than                    | `a < b`                   | `false` |
| `>=`     | Greater than or equal to     | `a >= b`                  | `true`  |
| `<=`     | Less than or equal to        | `a <= b`                  | `false` |

---

## ✅ **Practical Example: Using Relational Operators in a Conditional Statement**
```java
public class VotingEligibility {
    public static void main(String[] args) {
        int age = 18;
        
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
```
**Output:**
```
You are eligible to vote!
```

---

### 🎯 **Key Points to Remember**
✔ **Always returns a boolean value** (`true` or `false`).  
✔ **Used in decision-making** (if-else statements, loops).  
✔ **Works on numeric data types** (`int`, `float`, `double`, `char`).  
✔ **Comparisons with characters use ASCII values** (e.g., `'A' < 'B'` is `true`).  

---

