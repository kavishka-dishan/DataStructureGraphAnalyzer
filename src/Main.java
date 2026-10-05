import array.NumberArray;
import searching.SearchAlgorithms;
import stack.NumberStack;
import queue.NumberQueue;
import linkedlist.NumberLinkedList;
import graph.Graph;

import java.util.Scanner;

public class Main {

    // ================= OBJECTS =================

    static Scanner scanner = new Scanner(System.in);

    static NumberArray numberArray = new NumberArray(20);
    static SearchAlgorithms searchAlgorithms = new SearchAlgorithms();

    static NumberStack numberStack = new NumberStack(20);
    static NumberQueue numberQueue = new NumberQueue(20);

    static NumberLinkedList linkedList = new NumberLinkedList();

    static Graph graph = new Graph();

    // ================= MAIN =================

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n=============================================");
            System.out.println("       DATA STRUCTURE & GRAPH ANALYZER");
            System.out.println("=============================================");
            System.out.println("1. Array Operations");
            System.out.println("2. Stack Operations");
            System.out.println("3. Queue Operations");
            System.out.println("4. Linked List Operations");
            System.out.println("5. Searching Operations");
            System.out.println("6. Graph Operations");
            System.out.println("7. Performance Comparison");
            System.out.println("8. Display All Results");
            System.out.println("9. Exit");
            System.out.println("=============================================");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    arrayMenu();
                    break;

                case 2:
                    stackMenu();
                    break;

                case 3:
                    queueMenu();
                    break;

                case 4:
                    linkedListMenu();
                    break;

                case 5:
                    searchingMenu();
                    break;

                case 6:
                    graphMenu();
                    break;

                case 7:
                    performanceComparison();
                    break;

                case 8:
                    displayAllResults();
                    break;

                case 9:
                    System.out.println("\nThank you for using the system.");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please enter a number from 1 to 9."
                    );
            }

        } while (choice != 9);
    }

    // =====================================================
    // ARRAY
    // =====================================================

    public static void arrayMenu() {

        int choice;

        do {

            System.out.println("\n--------------- ARRAY OPERATIONS ---------------");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:

                    int insertValue =
                            readInteger("Enter value to insert: ");

                    numberArray.insert(insertValue);
                    break;

                case 2:

                    int deleteValue =
                            readInteger("Enter value to delete: ");

                    numberArray.delete(deleteValue);
                    break;

                case 3:

                    int searchValue =
                            readInteger("Enter value to search: ");

                    int index =
                            numberArray.search(searchValue);

                    if (index != -1) {
                        System.out.println(
                                searchValue
                                + " found at index "
                                + index + "."
                        );
                    } else {
                        System.out.println("Value not found.");
                    }

                    break;

                case 4:
                    numberArray.display();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    // =====================================================
    // STACK
    // =====================================================

    public static void stackMenu() {

        int choice;

        do {

            System.out.println("\n--------------- STACK OPERATIONS ---------------");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:

                    int value =
                            readInteger("Enter value to push: ");

                    numberStack.push(value);
                    break;

                case 2:
                    numberStack.pop();
                    break;

                case 3:

                    Integer top =
                            numberStack.peek();

                    if (top != null) {
                        System.out.println(
                                "Top value: " + top
                        );
                    }

                    break;

                case 4:
                    numberStack.display();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    // =====================================================
    // QUEUE
    // =====================================================

    public static void queueMenu() {

        int choice;

        do {

            System.out.println("\n--------------- QUEUE OPERATIONS ---------------");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek / Front");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:

                    int value =
                            readInteger("Enter value to enqueue: ");

                    numberQueue.enqueue(value);
                    break;

                case 2:
                    numberQueue.dequeue();
                    break;

                case 3:

                    Integer front =
                            numberQueue.peek();

                    if (front != null) {
                        System.out.println(
                                "Front value: " + front
                        );
                    }

                    break;

                case 4:
                    numberQueue.display();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    // =====================================================
    // LINKED LIST
    // =====================================================

    public static void linkedListMenu() {

        int choice;

        do {

            System.out.println(
                    "\n------------ LINKED LIST OPERATIONS ------------"
            );

            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:

                    int insertValue =
                            readInteger("Enter value to insert: ");

                    linkedList.insert(insertValue);
                    break;

                case 2:

                    int deleteValue =
                            readInteger("Enter value to delete: ");

                    linkedList.delete(deleteValue);
                    break;

                case 3:

                    int searchValue =
                            readInteger("Enter value to search: ");

                    if (linkedList.search(searchValue)) {

                        System.out.println(
                                searchValue
                                + " found in the Linked List."
                        );

                    } else {

                        System.out.println(
                                "Value not found."
                        );
                    }

                    break;

                case 4:
                    linkedList.display();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    // =====================================================
    // SEARCHING
    // =====================================================

    public static void searchingMenu() {

        if (numberArray.isEmpty()) {

            System.out.println(
                    "\nArray is empty."
            );

            System.out.println(
                    "Please insert values using Array Operations first."
            );

            return;
        }

        int choice;

        do {

            System.out.println(
                    "\n-------------- SEARCHING OPERATIONS --------------"
            );

            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Compare Linear and Binary Search");
            System.out.println("4. Return to Main Menu");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    performLinearSearch();
                    break;

                case 2:
                    performBinarySearch();
                    break;

                case 3:
                    compareSearches();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }

    // =====================================================
    // LINEAR SEARCH
    // =====================================================

    public static void performLinearSearch() {

        int target =
                readInteger("Enter value to search: ");

        int[] data =
                numberArray.getElements();

        long startTime =
                System.nanoTime();

        int result =
                searchAlgorithms.linearSearch(
                        data,
                        target
                );

        long endTime =
                System.nanoTime();

        if (result != -1) {

            System.out.println(
                    "Value found at index: "
                    + result
            );

        } else {

            System.out.println(
                    "Value not found."
            );
        }

        System.out.println(
                "Steps: "
                + searchAlgorithms.getLinearSteps()
        );

        System.out.println(
                "Execution Time: "
                + (endTime - startTime)
                + " ns"
        );

        System.out.println(
                "Time Complexity: O(n)"
        );
    }

    // =====================================================
    // BINARY SEARCH
    // =====================================================

    public static void performBinarySearch() {

        int target =
                readInteger("Enter value to search: ");

        int[] originalData =
                numberArray.getElements();

        int[] sortedData =
                searchAlgorithms.getSortedArray(
                        originalData
                );

        System.out.print("Sorted Array: ");

        for (int value : sortedData) {
            System.out.print(value + " ");
        }

        System.out.println();

        long startTime =
                System.nanoTime();

        int result =
                searchAlgorithms.binarySearch(
                        sortedData,
                        target
                );

        long endTime =
                System.nanoTime();

        if (result != -1) {

            System.out.println(
                    "Value found at sorted index: "
                    + result
            );

        } else {

            System.out.println(
                    "Value not found."
            );
        }

        System.out.println(
                "Steps: "
                + searchAlgorithms.getBinarySteps()
        );

        System.out.println(
                "Execution Time: "
                + (endTime - startTime)
                + " ns"
        );

        System.out.println(
                "Time Complexity: O(log n)"
        );
    }

    // =====================================================
    // SEARCH COMPARISON
    // =====================================================

    public static void compareSearches() {

        if (numberArray.isEmpty()) {

            System.out.println(
                    "Array is empty. Insert values first."
            );

            return;
        }

        int target =
                readInteger(
                        "Enter value to search and compare: "
                );

        int[] originalData =
                numberArray.getElements();

        int[] sortedData =
                searchAlgorithms.getSortedArray(
                        originalData
                );

        // Linear Search

        long linearStart =
                System.nanoTime();

        int linearResult =
                searchAlgorithms.linearSearch(
                        originalData,
                        target
                );

        long linearEnd =
                System.nanoTime();

        int linearSteps =
                searchAlgorithms.getLinearSteps();

        long linearTime =
                linearEnd - linearStart;

        // Binary Search

        long binaryStart =
                System.nanoTime();

        int binaryResult =
                searchAlgorithms.binarySearch(
                        sortedData,
                        target
                );

        long binaryEnd =
                System.nanoTime();

        int binarySteps =
                searchAlgorithms.getBinarySteps();

        long binaryTime =
                binaryEnd - binaryStart;

        // Results

        System.out.println(
                "\n============================================="
        );

        System.out.println(
                "          SEARCH PERFORMANCE"
        );

        System.out.println(
                "============================================="
        );

        System.out.println(
                "Target Value: " + target
        );

        System.out.println("---------------------------------------------");

        System.out.println(
                "Linear Search Result : "
                + (linearResult != -1
                        ? "Found"
                        : "Not Found")
        );

        System.out.println(
                "Linear Search Steps  : "
                + linearSteps
        );

        System.out.println(
                "Linear Search Time   : "
                + linearTime
                + " ns"
        );

        System.out.println(
                "Linear Complexity    : O(n)"
        );

        System.out.println("---------------------------------------------");

        System.out.println(
                "Binary Search Result : "
                + (binaryResult != -1
                        ? "Found"
                        : "Not Found")
        );

        System.out.println(
                "Binary Search Steps  : "
                + binarySteps
        );

        System.out.println(
                "Binary Search Time   : "
                + binaryTime
                + " ns"
        );

        System.out.println(
                "Binary Complexity    : O(log n)"
        );

        System.out.println(
                "============================================="
        );
    }

    // =====================================================
    // GRAPH
    // =====================================================

    public static void graphMenu() {

        int choice;

        do {

            System.out.println(
                    "\n--------------- GRAPH OPERATIONS ---------------"
            );

            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Return to Main Menu");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:

                    String vertex =
                            readNonEmptyString(
                                    "Enter vertex name: "
                            );

                    graph.addVertex(vertex);

                    break;

                case 2:

                    String vertex1 =
                            readNonEmptyString(
                                    "Enter first vertex: "
                            );

                    String vertex2 =
                            readNonEmptyString(
                                    "Enter second vertex: "
                            );

                    graph.addEdge(
                            vertex1,
                            vertex2
                    );

                    break;

                case 3:
                    graph.displayGraph();
                    break;

                case 4:

                    if (graph.isEmpty()) {

                        System.out.println(
                                "Graph is empty."
                        );

                        break;
                    }

                    String bfsStart =
                            readNonEmptyString(
                                    "Enter starting vertex: "
                            );

                    graph.bfs(bfsStart);

                    break;

                case 5:

                    if (graph.isEmpty()) {

                        System.out.println(
                                "Graph is empty."
                        );

                        break;
                    }

                    String dfsStart =
                            readNonEmptyString(
                                    "Enter starting vertex: "
                            );

                    graph.dfs(dfsStart);

                    break;

                case 6:
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);
    }

    // =====================================================
    // PERFORMANCE COMPARISON
    // =====================================================

    public static void performanceComparison() {

        System.out.println(
                "\n============================================="
        );

        System.out.println(
                "          PERFORMANCE COMPARISON"
        );

        System.out.println(
                "============================================="
        );

        if (numberArray.isEmpty()) {

            System.out.println(
                    "Search Comparison : No array data available."
            );

        } else {

            compareSearches();
        }

        System.out.println(
                "\n--------------- COMPLEXITY SUMMARY ---------------"
        );

        System.out.println(
                "Array Search            : O(n)"
        );

        System.out.println(
                "Stack Push/Pop          : O(1)"
        );

        System.out.println(
                "Queue Enqueue/Dequeue   : O(1)"
        );

        System.out.println(
                "Linked List Search      : O(n)"
        );

        System.out.println(
                "Linear Search           : O(n)"
        );

        System.out.println(
                "Binary Search           : O(log n)"
        );

        System.out.println(
                "BFS Traversal           : O(V + E)"
        );

        System.out.println(
                "DFS Traversal           : O(V + E)"
        );

        System.out.println(
                "=================================================="
        );

        System.out.println(
                "Note: Execution time can vary between program runs."
        );
    }

    // =====================================================
    // DISPLAY ALL
    // =====================================================

    public static void displayAllResults() {

        System.out.println(
                "\n============================================="
        );

        System.out.println(
                "             ALL CURRENT DATA"
        );

        System.out.println(
                "============================================="
        );

        System.out.println("\n--- ARRAY ---");
        numberArray.display();

        System.out.println("\n--- STACK ---");
        numberStack.display();

        System.out.println("\n--- QUEUE ---");
        numberQueue.display();

        System.out.println("\n--- LINKED LIST ---");
        linkedList.display();

        System.out.println("\n--- GRAPH ---");
        graph.displayGraph();

        System.out.println(
                "\n============================================="
        );
    }

    // =====================================================
    // INPUT VALIDATION
    // =====================================================

    public static int readInteger(String message) {

        while (true) {

            System.out.print(message);

            if (scanner.hasNextInt()) {

                int value =
                        scanner.nextInt();

                scanner.nextLine();

                return value;
            }

            System.out.println(
                    "Invalid input. Please enter a valid integer."
            );

            scanner.nextLine();
        }
    }

    public static String readNonEmptyString(String message) {

        while (true) {

            System.out.print(message);

            String input =
                    scanner.nextLine().trim();

            if (!input.isEmpty()) {
                return input;
            }

            System.out.println(
                    "Input cannot be empty. Please try again."
            );
        }
    }
}