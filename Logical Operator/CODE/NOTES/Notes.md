Here are **complete notes on Logical Operators in Java** with explanations and examples for future reference.  

---

## 📚 **Logical Operators in Java**

Logical operators in Java are used to perform **logical operations** on boolean values (`true` or `false`). These operators are mostly used in **decision-making** (`if-else` statements) and **looping conditions**.

---

## ✅ **List of Logical Operators in Java**

| Operator | Name          | Description                                      | Example (`a=true, b=false`) | Result  |
|----------|--------------|--------------------------------------------------|----------------------------|---------|
| `&&`     | Logical AND  | Returns `true` if **both** conditions are true  | `a && b`                   | `false` |
| `||`     | Logical OR   | Returns `true` if **at least one** condition is true | `a || b`               | `true`  |
| `!`      | Logical NOT  | **Reverses** the value (`true` → `false`, `false` → `true`) | `!a`                    | `false` |

---

## ✅ **1. Logical AND (`&&`)**
- Returns `true` **only if both conditions are true**.
- If any condition is `false`, the result is `false`.

### 🔹 **Example:**
```java
public class LogicalAndExample {
    public static void main(String[] args) {
        boolean a = true, b = false;
        
        System.out.println(a && b); // false (true AND false → false)
        System.out.println(a && true); // true (true AND true → true)
    }
}
```
**Output:**
```
false
true
```

#### ✅ **Practical Use Case:**
Checking if a person is eligible to vote (age must be **18 or older** and must be a **citizen**).
```java
public class VotingEligibility {
    public static void main(String[] args) {
        int age = 20;
        boolean isCitizen = true;
        
        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }
}
```
**Output:**
```
You are eligible to vote.
```

---

## ✅ **2. Logical OR (`||`)**
- Returns `true` if **at least one condition is true**.
- Returns `false` only if **both conditions are false**.

### 🔹 **Example:**
```java
public class LogicalOrExample {
    public static void main(String[] args) {
        boolean a = true, b = false;
        
        System.out.println(a || b); // true (true OR false → true)
        System.out.println(false || false); // false (false OR false → false)
    }
}
```
**Output:**
```
true
false
```

#### ✅ **Practical Use Case:**
Checking if a student passes an exam (either in Math **or** Science).
```java
public class ExamResult {
    public static void main(String[] args) {
        int mathScore = 40, scienceScore = 85;
        
        if (mathScore >= 50 || scienceScore >= 50) {
            System.out.println("You passed the exam.");
        } else {
            System.out.println("You failed.");
        }
    }
}
```
**Output:**
```
You passed the exam.
```

---

## ✅ **3. Logical NOT (`!`)**
- **Reverses** the boolean value (`true` → `false`, `false` → `true`).

### 🔹 **Example:**
```java
public class LogicalNotExample {
    public static void main(String[] args) {
        boolean a = true;
        
        System.out.println(!a); // false (NOT true → false)
        System.out.println(!false); // true (NOT false → true)
    }
}
```
**Output:**
```
false
true
```

#### ✅ **Practical Use Case:**
Checking if a user **is NOT** logged in.
```java
public class UserLogin {
    public static void main(String[] args) {
        boolean isLoggedIn = false;
        
        if (!isLoggedIn) {
            System.out.println("Please log in first.");
        } else {
            System.out.println("Welcome back!");
        }
    }
}
```
**Output:**
```
Please log in first.
```

---

## ✅ **Summary Table**

| Operator | Name          | Returns `true` when...                | Example (`a = true, b = false`) | Result  |
|----------|--------------|--------------------------------------|--------------------------------|---------|
| `&&`     | Logical AND  | **Both conditions** are true        | `a && b`                       | `false` |
| `||`     | Logical OR   | **At least one** condition is true  | `a || b`                       | `true`  |
| `!`      | Logical NOT  | **Reverses** the boolean value      | `!a`                            | `false` |

---

## ✅ **Final Example: Combining Logical Operators**
```java
public class LogicalOperatorsExample {
    public static void main(String[] args) {
        int age = 25;
        boolean hasID = true;
        
        if (age >= 18 && hasID) {
            System.out.println("You can enter the club.");
        } else {
            System.out.println("You are not allowed.");
        }

        boolean isWeekend = false;
        boolean isHoliday = true;
        
        if (isWeekend || isHoliday) {
            System.out.println("You can relax today!");
        } else {
            System.out.println("It's a workday.");
        }
    }
}
```
**Output:**
```
You can enter the club.
You can relax today!
```

---

## 🎯 **Key Takeaways**
✔ **Logical AND (`&&`)** → Returns `true` only if **both** conditions are `true`.  
✔ **Logical OR (`||`)** → Returns `true` if **at least one** condition is `true`.  
✔ **Logical NOT (`!`)** → Reverses the boolean value (`true` → `false`, `false` → `true`).  
✔ **Used in decision-making statements** (`if-else`, loops, authentication, etc.).  

---

