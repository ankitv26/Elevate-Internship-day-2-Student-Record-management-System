# Elevate Internship Day 2 - Student Record Management System

This is a CLI-based CRUD system implemented in Java for managing student records.  
You can add, view, update, and delete student records stored in-memory.

---

## Features

- Add a new student (ID, name, marks)
- View all student records
- Update existing student records
- Delete student records

---

## Project Structure

- `Student.java` — The student model class with fields like ID, name, marks.
- `StudentManagement.java` — Handles CRUD operations and manages the student list.
- `Main.java` — Contains the main method and menu-driven interface for user interaction.

---

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/ankitv26/Elevate-Internship-day-2-Student-Record-management-System.git
   ```
2. Compile the Java files:
    javac src/*.java

3. Run the program:
    java src.Main

Tools Used
Java

Git

VS Code / IntelliJ Community Edition

## What Does This Program Do?
    This Student Record Management System is a simple command-line Java application that helps you manage student information easily. It allows you to:

        + Add new students with an ID, name, and marks.
        + View the list of all students and their details.
        + Update a student's information by searching with  their ID.
        + Delete a student's record from the system.

    The data is stored temporarily while the program runs using an ArrayList of Student objects. This program demonstrates basic CRUD (Create, Read, Update, Delete) operations in Java with a user-friendly menu system.

## How Did I Create This Program?
1. Designed the Student Class:
    I created a Student class with attributes like id, name, and marks to represent each student’s record.

2. Managed Data Using ArrayList:
    To hold multiple student records, I used Java's ArrayList<Student> which allows dynamic resizing and easy access.

3. Implemented CRUD Operations:
    In a separate StudentManagement class, I implemented methods to:

        + Add a student to the list.
        + View all students.
        + Update student details by ID.
        + Delete a student by ID.

4. Built a Command-Line Interface:
    The Main class contains a loop with a menu that takes user input and calls the appropriate methods to perform actions. This makes the program interactive and easy to use.

5. Tested and Debugged:
    I tested all functionalities to ensure they work correctly and handle invalid inputs gracefully.

