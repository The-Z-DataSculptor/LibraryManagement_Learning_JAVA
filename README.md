# 📚 Library Management System (Java)

A menu-driven console application built in Java to manage library inventory operations using parallel arrays, procedural functions, and input validation.

---

## 📌 Features

- **Inventory Tracking:** Uses parallel arrays to synchronize book titles, authors, and quantities.
- **Duplicate Prevention:** Updates existing quantities automatically if a book already exists.
- **Transaction Handling:** Allows users to borrow and return books with stock validation.
- **Defensive Input:** Handles non-integer input gracefully to avoid runtime crashes.

---

## 🛠️ Concepts Demonstrated

- **Parallel Arrays:** `String[] titles`, `String[] authors`, and `int[] quantities`.
- **Modular Functions:** `addBook()`, `borrowBook()`, and `returnBook()`.
- **Control Structures:** `while` event loop, `switch` menu branching, and nested `for`/`if` validation.
- **Scanner Stream Management:** Buffer clearing via `input.nextLine()`.

---

## 🚀 How to Run

1. **Compile:**
   javac LibrarySystem.java

2. **Run:**
   java LibrarySystem
