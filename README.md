# 🕸️ Array List and Linked List

**Subject**: Algorithms and Data Structures  
**Name**: Ayazbek Abdanur

## 📌 Project Description

This project is a practical implementation of foundational data structures — `ArrayList` and `LinkedList` — along with advanced logical data structures: `Stack`, `Queue`, and `MinHeap`. Each logical structure is built upon a custom physical structure implementation using generics. The goal was to deepen understanding of internal data structure mechanisms by avoiding the use of `java.util.*` (except `Iterator`) and implementing everything from scratch.

## 💡 Features

* ✅ Fully functional `MyArrayList` implementation using raw object arrays.
* ✅ `MyLinkedList` implemented as a doubly linked list with internal node handling.
* ✅ Custom `MyStack`, `MyQueue`, and `MyMinHeap` structures built on top of these physical structures.
* ✅ Support for generic types with runtime type safety.
* ✅ Sorting via `Comparable` or custom `Comparator<T>`.
* ✅ Manual memory handling and edge-case testing (add/remove at head/tail/middle).
* ✅ Fully tested using `Main.java`.

## 📦 Technologies

* Java 17
* OOP (Classes, Interfaces, Generics)
* Git & GitHub (for version control and task tracking)

## 🚀 How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/MnstrsParago/ADS.ASG2.AL_LL
   cd ADS.ASG2.AL_LL
   ```

2. Compile all `.java` files:

   ```bash
   javac *.java
   ```

3. Run the test file:

   ```bash
   java Main
   ```

4. You should see console output verifying:

   * Stack operations (push, pop, peek)
   * Queue operations (enqueue, dequeue, peek)
   * MinHeap operations (insert, extractMin)

## 📘 Reflection

This project was a great reinforcement of data structure principles. Reimplementing these structures from the ground up helped me understand the internal workings of dynamic arrays and linked nodes more deeply. I learned how abstract data types like `Stack`, `Queue`, and `MinHeap` depend on lower-level structures, and how algorithmic efficiency can be shaped by physical design decisions. Doing everything manually — from resizing arrays to sorting generics — gave me a new perspective on how libraries like `java.util.*` are built.
