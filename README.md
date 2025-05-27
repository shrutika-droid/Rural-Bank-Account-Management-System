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

## ▶️ How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/yourusername/rbams.git
   cd rbams
