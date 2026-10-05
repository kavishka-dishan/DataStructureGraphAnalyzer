# Data Structure and Graph Performance Analyzer

## Project Description

The **Data Structure and Graph Performance Analyzer** is a Java console-based application developed for the CIT300 Data Structures and Algorithms Graded Practical Assignment 2.

The system demonstrates the practical implementation of different data structures and algorithms, including Array, Stack, Queue, Linked List, Searching, Graph, BFS, DFS, and performance comparison.

---

## Team Members and Contributions

### Member 1 - Kavishka Silva
**Student ID:**  23DA2-0375

**Assigned Responsibility:** Array, Searching, Performance Comparison, and Final Integration

**Individual Contribution:**
- Implemented Array operations: Insert, Delete, Search, and Display.
- Implemented Linear Search and Binary Search.
- Added search step counting and execution time measurement.
- Implemented performance and complexity comparison.
- Integrated all components into the final main menu.
- Added input validation and performed final system testing.

### Member 2 - Senuri Gunasekara
**Student ID:** 23DA2-0114

**Assigned Responsibility:** Stack and Queue

**Individual Contribution:**
- Implemented Stack operations: Push, Pop, Peek, and Display.
- Implemented Queue operations: Enqueue, Dequeue, Peek, and Display.
- Added handling for empty Stack and Queue conditions.
- Tested Stack and Queue functionality.

### Member 3 - Lahiru Priyamantha
**Student ID:**  23DA2-0415

**Assigned Responsibility:** Linked List and Graph

**Individual Contribution:**
- Implemented Linked List operations: Insert, Delete, Search, and Display.
- Implemented Graph using an adjacency list.
- Implemented Add Vertex and Add Edge operations.
- Implemented Graph display functionality.
- Implemented Breadth First Search (BFS).
- Implemented Depth First Search (DFS).
- Tested Linked List and Graph functionality.

---

## Main Features

The system provides the following features:

1. **Array Operations**
   - Insert
   - Delete
   - Search
   - Display

2. **Stack Operations**
   - Push
   - Pop
   - Peek
   - Display

3. **Queue Operations**
   - Enqueue
   - Dequeue
   - Peek
   - Display

4. **Linked List Operations**
   - Insert
   - Delete
   - Search
   - Display

5. **Searching Operations**
   - Linear Search
   - Binary Search
   - Search performance comparison

6. **Graph Operations**
   - Add Vertex
   - Add Edge
   - Display Graph
   - BFS Traversal
   - DFS Traversal

7. **Performance Comparison**
   - Number of search steps
   - Execution time
   - Time complexity comparison

8. **Display All Results**
   - Displays the current data stored in the implemented data structures.

---

## Time Complexities

| Operation / Algorithm | Time Complexity |
|---|---|
| Array Search | O(n) |
| Stack Push / Pop | O(1) |
| Queue Enqueue / Dequeue | O(1) |
| Linked List Search | O(n) |
| Linear Search | O(n) |
| Binary Search | O(log n) |
| BFS | O(V + E) |
| DFS | O(V + E) |

---

## Technologies Used

- Java
- Git
- GitHub

---

## Project Structure

```text
src/
├── array/
│   └── NumberArray.java
├── stack/
│   └── NumberStack.java
├── queue/
│   └── NumberQueue.java
├── linkedlist/
│   ├── Node.java
│   └── NumberLinkedList.java
├── searching/
│   └── SearchAlgorithms.java
├── graph/
│   └── Graph.java
└── Main.java
