# 📚 Library Management System

A **Java-based CLI (Command Line Interface)** application that simulates a basic Library Management System. This project allows a single user to **add books, view them, issue books, and return them**, using core object-oriented programming principles.

---

## 🎯 Features

- ✅ Add new books to the library
- 📋 View all books with issue status
- 📖 Issue a book to the current user
- 🔁 Return an issued book
- 🧠 Menu-driven interface for smooth navigation

---

## 🧱 Classes Used

### 1. `Book`
Represents a book with:
- ID
- Title
- Author
- Issued status (Yes/No)

### 2. `User`
Represents a user (only one user in this system) with:
- User ID
- Name

### 3. `Library`
Handles the business logic:
- Adding books
- Viewing books
- Issuing and returning books
- Storing all books in an `ArrayList`

### 4. `Main`
The starting point of the application:
- Displays menu
- Takes user input using `Scanner`
- Calls appropriate methods from `Library` class

---

## 🛠 Tech Stack

- 💻 Java
- 🧮 ArrayList Collection
- ⚙️ OOP Concepts (Encapsulation, Constructors)
- 🖥️ Command Line Interface (CLI)
- 🧪 VS Code or IntelliJ
