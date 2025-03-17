### **📌 Types of Operators in Java**  
Java provides different types of operators to perform various operations. These operators are categorized as follows:  

---

## **1️⃣ Arithmetic Operators**  
👉 **Used for basic mathematical operations.**  
| Operator | Description | Example (`a = 10, b = 5`) | Result |
|----------|------------|----------------|--------|
| `+` | Addition | `a + b` | `15` |
| `-` | Subtraction | `a - b` | `5` |
| `*` | Multiplication | `a * b` | `50` |
| `/` | Division | `a / b` | `2` |
| `%` | Modulus (Remainder) | `a % b` | `0` |

**Example:**  
```java
public class ArithmeticExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Quotient: " + (a / b));
        System.out.println("Remainder: " + (a % b));
    }
}
```

---

## **2️⃣ Relational (Comparison) Operators**  
👉 **Used to compare values. Returns `true` or `false`.**  
| Operator | Description | Example (`a = 10, b = 5`) | Result |
|----------|------------|----------------|--------|
| `==` | Equal to | `a == b` | `false` |
| `!=` | Not equal to | `a != b` | `true` |
| `>` | Greater than | `a > b` | `true` |
| `<` | Less than | `a < b` | `false` |
| `>=` | Greater than or equal to | `a >= b` | `true` |
| `<=` | Less than or equal to | `a <= b` | `false` |

**Example:**  
```java
public class RelationalExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println(a == b); // false
        System.out.println(a != b); // true
        System.out.println(a > b);  // true
        System.out.println(a < b);  // false
    }
}
```

---

## **3️⃣ Logical Operators**  
👉 **Used to combine multiple conditions.**  
| Operator | Description | Example (`a = 10, b = 5`) | Result |
|----------|------------|-----------------|---------|
| `&&` | Logical AND | `(a > 5 && b < 10)` | `true` |
| `||` | Logical OR | `(a < 5 || b < 10)` | `true` |
| `!` | Logical NOT | `!(a > b)` | `false` |

**Example:**  
```java
public class LogicalExample {
    public static void main(String[] args) {
        int age = 20;
        boolean hasID = true;
        System.out.println(age >= 18 && hasID); // true
        System.out.println(age < 18 || hasID);  // true
        System.out.println(!(age >= 18));       // false
    }
}
```

---

## **4️⃣ Bitwise Operators**  
👉 **Used for binary (bit-level) operations.**  
| Operator | Description | Example (`a = 5 (0101), b = 3 (0011)`) | Result |
|----------|------------|-------------------|--------|
| `&` | Bitwise AND | `a & b` | `1` (0001) |
| `|` | Bitwise OR | `a | b` | `7` (0111) |
| `^` | Bitwise XOR | `a ^ b` | `6` (0110) |
| `~` | Bitwise Complement | `~a` | `-6` |
| `<<` | Left shift | `a << 1` | `10` (1010) |
| `>>` | Right shift | `a >> 1` | `2` (0010) |

**Example:**  
```java
public class BitwiseExample {
    public static void main(String[] args) {
        int a = 5, b = 3;
        System.out.println(a & b);  // 1
        System.out.println(a | b);  // 7
        System.out.println(a ^ b);  // 6
        System.out.println(~a);     // -6
        System.out.println(a << 1); // 10
        System.out.println(a >> 1); // 2
    }
}
```

---

## **5️⃣ Assignment Operators**  
👉 **Used to assign values to variables.**  
| Operator | Description | Example (`a = 10`) | Equivalent To |
|----------|------------|----------------|--------------|
| `=` | Assign | `a = 5` | `a = 5` |
| `+=` | Add and assign | `a += 5` | `a = a + 5` |
| `-=` | Subtract and assign | `a -= 5` | `a = a - 5` |
| `*=` | Multiply and assign | `a *= 5` | `a = a * 5` |
| `/=` | Divide and assign | `a /= 5` | `a = a / 5` |
| `%=` | Modulus and assign | `a %= 5` | `a = a % 5` |

**Example:**  
```java
public class AssignmentExample {
    public static void main(String[] args) {
        int a = 10;
        a += 5; // a = 15
        System.out.println(a);
    }
}
```

---

## **6️⃣ Increment & Decrement Operators**  
👉 **Used to increase or decrease a value by 1.**  
| Operator | Description | Example (`a = 5`) | Result |
|----------|------------|-------------|--------|
| `++a` | Pre-increment | `++a` | `6` |
| `a++` | Post-increment | `a++` | `5` (then `6`) |
| `--a` | Pre-decrement | `--a` | `4` |
| `a--` | Post-decrement | `a--` | `5` (then `4`) |

**Example:**  
```java
public class IncrementExample {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(++a); // 6
        System.out.println(a--); // 6 (then a becomes 5)
    }
}
```

---

## **7️⃣ Ternary Operator (`? :`)**  
👉 **A shorthand for `if-else` statements.**  
| Syntax | `condition ? trueValue : falseValue` |
|--------|----------------------------------|
| Example | `int min = (a < b) ? a : b;` |

**Example:**  
```java
public class TernaryExample {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int min = (a < b) ? a : b;
        System.out.println("Minimum: " + min);
    }
}
```
🔹 If `a < b` is true, `min = a`, otherwise `min = b`.

---

## **8️⃣ Instanceof Operator**  
👉 **Checks if an object is an instance of a class.**  
```java
public class InstanceofExample {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(str instanceof String); // true
    }
}
```

---

## 🎯 **Summary**
✔ **Arithmetic** → `+`, `-`, `*`, `/`, `%`  
✔ **Relational** → `==`, `!=`, `>`, `<`, `>=`, `<=`  
✔ **Logical** → `&&`, `||`, `!`  
✔ **Bitwise** → `&`, `|`, `^`, `~`, `<<`, `>>`  
✔ **Assignment** → `=`, `+=`, `-=`, `*=`, `/=`, `%=`  
✔ **Increment/Decrement** → `++`, `--`  
✔ **Ternary** → `? :`  
✔ **Instanceof** → `instanceof`  

