# **📌 Notes on Increment and Decrement Operators in Java**  

## **1️⃣ Definition**  
Increment (`++`) and Decrement (`--`) operators are **used to increase or decrease** the value of a variable by **1**.

---

## **2️⃣ Types of Increment and Decrement Operators**  

| Operator | Example | Equivalent To | Description |
|----------|--------|--------------|-------------|
| `++x` (Pre-Increment) | `int y = ++x;` | `x = x + 1; y = x;` | Increments `x` first, then assigns it to `y`. |
| `x++` (Post-Increment) | `int y = x++;` | `y = x; x = x + 1;` | Assigns `x` to `y` first, then increments `x`. |
| `--x` (Pre-Decrement) | `int y = --x;` | `x = x - 1; y = x;` | Decrements `x` first, then assigns it to `y`. |
| `x--` (Post-Decrement) | `int y = x--;` | `y = x; x = x - 1;` | Assigns `x` to `y` first, then decrements `x`. |

---

## **3️⃣ Example Programs**  

### **Pre-Increment (`++x`)**
```java
int x = 5;
int y = ++x; // x = 6, y = 6
```

### **Post-Increment (`x++`)**
```java
int x = 5;
int y = x++; // y = 5, x = 6
```

### **Pre-Decrement (`--x`)**
```java
int x = 5;
int y = --x; // x = 4, y = 4
```

### **Post-Decrement (`x--`)**
```java
int x = 5;
int y = x--; // y = 5, x = 4
```

---

## **4️⃣ Real-Life Examples**  
| Scenario | Operator Used | Example |
|----------|--------------|---------|
| Countdown timer in an exam | `--` | `timeRemaining--;` |
| Fuel level decreases while driving | `--` | `fuel--;` |
| Increasing a game score | `++` | `score++;` |
| Reducing stock after a sale | `--` | `stock--;` |

---

## **5️⃣ Key Points**  
✅ **Increment (`++`)** increases value by **1**  
✅ **Decrement (`--`)** decreases value by **1**  
✅ **Pre-Increment (`++x`)** updates value **before** use  
✅ **Post-Increment (`x++`)** updates value **after** use  
✅ **Pre-Decrement (`--x`)** decreases value **before** use  
✅ **Post-Decrement (`x--`)** decreases value **after** use  

Would you like a **PDF version** for reference? 🚀