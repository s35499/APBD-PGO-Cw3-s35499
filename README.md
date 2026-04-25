# Cafe System (OOP Project)

##  Project Description
This project is a simple console-based Java application that models a basic cafe ordering system.

The goal of the project is to demonstrate fundamental OOP concepts such as:

- classes and objects  
- encapsulation (private fields, public methods)  
- constructors  
- ArrayList usage  
- static fields and methods  
- overriding `toString()` and `equals()`  
- simple business logic  

---

## Project Structure

The project consists of the following classes:

---

### MenuItem
Represents a single product available in the cafe menu.

**Fields:**
- code
- name
- price
- category
- static count (number of created items)

**Methods:**
- constructor
- getters
- `getPrice()`
- `getCode()`
- `getCount()`
- `toString()`
- `equals()` (compares by `code`)

---

### Client
Represents a cafe customer.

**Fields:**
- id
- name
- surname
- email

**Methods:**
- `getId()`
- `getEmail()`
- `toString()`
- `equals()`

---

### Order
Represents a single order made by a client.

**Fields:**
- id
- client (Client object)
- items (ArrayList of MenuItem)
- isPaid
- static nextId (auto-increment order number)

**Methods:**
- constructor
- `addItem(MenuItem item)`
- `totalPrice()`
- `itemCount()`
- `markPaid()`
- `toString()`

---

### Main
Contains a simple test scenario demonstrating how the system works.

---

## How It Works
The application simulates basic café operations:

- Creating menu items
- Creating a client
- Creating an order
- Adding items to the order (ArrayList)
- Calculating total price
- Printing order summary
- Comparing products using `equals()`
- Marking order as paid

All results are displayed in the console.

---

## How to Run

### Requirements:
- Java JDK 21 (recommended)
---

### Run via terminal:

1. Go to project folder:
```bash
cd path/to/APBD-PGO-Cw3-s35499/src

javac *.java
java Main
```