# Rural Bank Account Management System (RBAMS)

The **Rural Bank Account Management System (RBAMS)** is a console-based Java application designed to provide basic banking services (savings and current accounts) for rural areas of Nepal. It is built with Object-Oriented Programming (OOP) principles to ensure simplicity, security, and efficiency. The system helps manage multiple accounts per customer, apply interest, and handle overdraft and transaction rules. Custom exceptions handle real-world banking errors like insufficient balance.

---

## 📘 Project Description

RBAMS simulates a real-world rural banking system where each customer can have savings and current accounts. The system supports depositing, withdrawing, applying interest (for savings), and managing overdraft (for current accounts). It is menu-driven and user-friendly, designed for areas with limited literacy and access.

---

## ✨ Features

- Create customer with multiple accounts (savings and current)
- Deposit and withdraw money
- Prevent overdrawing from savings accounts
- Allow overdraft up to a limit in current accounts
- Apply interest to savings accounts
- View account details and balances
- User-friendly console interface
- Custom exceptions for invalid transactions

---

## 🧱 Class Design & OOP Concepts

| Class Name              | Description                                                                 |
|------------------------|-----------------------------------------------------------------------------|
| `BankAccount`           | Abstract class with common properties (account number, balance, etc.)      |
| `SavingsAccount`        | Inherits from `BankAccount`; supports interest addition                    |
| `CurrentAccount`        | Inherits from `BankAccount`; supports overdraft                            |
| `Customer`              | Aggregates multiple `BankAccount` objects                                  |
| `InsufficientBalanceException` | Custom exception for withdrawal limit violations                     |
| `InvalidAmountException`       | Custom exception for invalid deposit or withdrawal amounts            |
| `Main`                  | Main application file for user interaction via console                     |

### ✅ OOP Concepts Used

- **Abstraction**: `BankAccount` is an abstract base class.
- **Encapsulation**: Private variables with getters/setters.
- **Inheritance**: `SavingsAccount` and `CurrentAccount` inherit `BankAccount`.
- **Polymorphism**: Transactions handled generically via parent references.
- **Aggregation**: A `Customer` has multiple bank accounts.

---


## 📸 Screenshots
<img width="355" alt="Deposit" src="https://github.com/user-attachments/assets/66a94524-ef21-42f5-a12a-40c15e3dd7a4" />

<img width="470" alt="In trest" src="https://github.com/user-attachments/assets/38b41016-0b21-4ec7-bf20-924e4a107f78" />

<img width="528" alt="withdrawn" src="https://github.com/user-attachments/assets/7ef086c6-114d-4106-93f1-270ee69f6cd2" />

---

## ▶️ How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/rbams.git
   cd rbams

   ---




   
