# 📚 Library Management System (Java + GUI)

This is a simple **Library Management System** built in Java using **Swing GUI** and **file handling**. It allows you to register new libraries and view all registered libraries stored in a `.txt` file.

---

## ✨ Features

- Add/Register a new library
- View all libraries in a scrollable text area
- GUI-based user interaction using `JFrame`, `JTextField`, `JButton`, `JTextArea`
- File persistence using `FileWriter` and `Scanner`
- Auto-refresh after each registration

---

## 📁 Project Structure
LibraryManagement/
├── Library.java
├── LibraryManager.java
├── LibraryGUI.java
├── Start.java
├── library.txt

---

## 🏗️ Class Details

### ✅ Library.java

- Represents the `Library` entity.
- Fields: `libraryId`, `libraryName`, `established`, `totalBooks`, `address`
- Handles parsing from string and `toString()` for saving.

### ✅ LibraryManager.java

- Responsible for writing to and reading from the `library.txt` file.
- Returns an array of all saved libraries.

### ✅ LibraryGUI.java

- GUI implementation using `Swing`.
- Allows input for new library and shows all libraries in a scroll area.
- Buttons: `Register`, `Show All`.

### ✅ Start.java

- Launches the GUI.

---

## 📝 Sample Output
Library Name: Central Library
Library ID: 101
Established: 1995
Total Books: 12000
Address: Dhaka

---

## 💾 File Format (`library.txt`)

Data is stored in comma-separated format:
101,Central Library,1995,12000,Dhaka
102,City Library,2001,8000,Chittagong

---

## 🧪 How to Run

1. Clone or download the project
2. Compile all `.java` files:
   ```bash
   javac Start.java

Run the program:
java Start






