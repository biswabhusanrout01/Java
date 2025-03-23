# **📌 Complete Notes on Ternary Operator in Java**  

## **1️⃣ Definition**  
The **ternary operator (`?:`)** is a conditional operator that provides a **short-hand** way to write `if-else` statements. It evaluates a condition and returns one of two values based on whether the condition is `true` or `false`.  

---

## **2️⃣ Syntax**  
```java
variable = (condition) ? value_if_true : value_if_false;
```
- If the `condition` is **true**, the expression returns `value_if_true`.  
- If the `condition` is **false**, the expression returns `value_if_false`.  

---

## **3️⃣ Features of Ternary Operator**  
✔ **Conditional Operator:** Works as a replacement for simple `if-else` statements.  
✔ **Single Line Expression:** Reduces the number of lines of code.  
✔ **Returns a Value:** Can be used to directly assign values to variables.  
✔ **Faster Execution:** More efficient in some cases compared to `if-else`.  

---

## **4️⃣ Advantages**  
✅ **Concise Code:** Makes the code shorter and easier to read.  
✅ **Efficient Execution:** Works faster than `if-else` in some cases.  
✅ **Better Readability:** When used for simple conditions, it improves code clarity.  

---

## **5️⃣ Limitations**  
❌ **Not Suitable for Complex Conditions:** When multiple conditions are involved, using `if-else` is better.  
❌ **Reduces Readability if Overused:** If nested ternary operators are used, it can make the code hard to understand.  
❌ **Can’t Execute Multiple Statements:** Unlike `if-else`, the ternary operator can only return a single value.  

---

## **6️⃣ Use Cases**  
🔹 Checking conditions like **minimum/maximum numbers**.  
🔹 Validating **user input** (e.g., age for voting eligibility).  
🔹 Assigning values based on conditions in **short expressions**.  

---

## **7️⃣ Key Points to Remember**  
✔ The ternary operator is **a short alternative** to `if-else`.  
✔ It **must return a value** since it is an expression.  
✔ Best suited for **simple conditions**.  
✔ Not ideal for **complex decision-making**.  

~~~~~~~~~~~~~~~~~~~~~~~ COMPLETE NOTES ~~~~~~~~~~~~~~~~~~~~~~~