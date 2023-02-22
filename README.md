# Library Management System

A simple console-based library system written in Java for my university programming assignment.

## Overview

The program lets users manage a small library catalog directly from the terminal. It uses parallel arrays to keep track of book titles, authors, and available quantities without using an external database.

## Features

- Add new books to the inventory (updates quantity if the book already exists)
- Borrow books (checks if copies are currently available)
- Return books back to inventory
- Basic input validation to prevent crashes from invalid menu choices

## How to Run

1. Open your terminal in the project directory.
2. Compile the code:
   ```bash
   javac LibrarySystem.java