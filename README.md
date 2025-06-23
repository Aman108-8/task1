# task1
# 🧮 Java Console Calculator

This is a simple Java-based calculator that runs in the console. It performs basic arithmetic operations: addition, subtraction, multiplication, and division. The calculator repeatedly prompts the user until they choose to exit.

---

## 🚀 Features

- Add (`+`)
- Subtract (`-`)
- Multiply (`*`)
- Divide (`/`) — with error handling for division by zero
- Loop-based interface: continue calculations as long as you type `Y` or `y`

---

## 🛠️ How It Works

1. The program asks the user to input:
   - First number
   - Second number
   - Arithmetic operator (`+`, `-`, `*`, `/`)
2. Based on the operator:
   - Performs the corresponding operation.
   - Handles invalid operations and division by zero using try-catch.
3. After showing the result, the user is prompted:
   - Type `Y` to continue or any other key to exit.

---

## 📦 How to Run

### ✅ Requirements
- Java JDK (8 or above)
- A terminal or command prompt

### 🔧 Compile

```bash
javac Calculator.java
java Calculator

Enter first value
5
Enter second value
0
Enter an operation (+, -, *, /):
/
Cannot divide by zero. Please enter values again.
Type y.....for continue
