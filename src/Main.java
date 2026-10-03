import array.NumberArray;
import searching.SearchAlgorithms;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static NumberArray numberArray = new NumberArray(20);

    static SearchAlgorithms searchAlgorithms = new SearchAlgorithms();

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n=============================================");
            System.out.println("       KAVISHKA - COMPONENT TEST");
            System.out.println("=============================================");
            System.out.println("1. Array Operations");
            System.out.println("2. Searching Operations");
            System.out.println("3. Exit");
            System.out.println("=============================================");

            choice = readInteger("Enter your choice: ");

            switch (choice) {

                case 1:
                    arrayMenu();
                    break;

                case 2:
                    searchingMenu();
                    break;

                case 3:
                    System.out.println("Exiting component test...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);
    }

    // ================= ARRAY MENU =================

    public static void arrayMenu() {

        int choice;

        do {

            System.out.println("\n=============================================");
            System.out.println("              ARRAY OPERATIONS");
            System.out.println("=============================================");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Return");
            System.out.println("=============================================");

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
                                + index
                        );

                    } else {

                        System.out.println(
                                "Value not found."
                        );
                    }

                    break;

                case 4:

                    numberArray.display();

                    break;

                case 5:

                    System.out.println(
                            "Returning..."
                    );

                    break;

                default:

                    System.out.println(
                            "Invalid choice."
                    );
            }

        } while (choice != 5);
    }

    // ================= SEARCHING MENU =================

    public static void searchingMenu() {

        if (numberArray.isEmpty()) {

            System.out.println(
                    "Array is empty. Insert values first."
            );

            return;
        }

        int choice;

        do {

            System.out.println("\n=============================================");
            System.out.println("            SEARCHING OPERATIONS");
            System.out.println("=============================================");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Compare Searches");
            System.out.println("4. Return");
            System.out.println("=============================================");

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
                    System.out.println("Returning...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }

    // ================= LINEAR SEARCH =================

    public static void performLinearSearch() {

        int target =
                readInteger("Enter value to search: ");

        int[] data =
                numberArray.getElements();

        long startTime =
                System.nanoTime();

        int index =
                searchAlgorithms.linearSearch(
                        data,
                        target
                );

        long endTime =
                System.nanoTime();

        if (index != -1) {

            System.out.println(
                    "Value found at index: "
                    + index
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
    }

    // ================= BINARY SEARCH =================

    public static void performBinarySearch() {

        int target =
                readInteger("Enter value to search: ");

        int[] data =
                numberArray.getElements();

        int[] sortedData =
                searchAlgorithms.getSortedArray(data);

        System.out.print("Sorted Array: ");

        for (int value : sortedData) {
            System.out.print(value + " ");
        }

        System.out.println();

        long startTime =
                System.nanoTime();

        int index =
                searchAlgorithms.binarySearch(
                        sortedData,
                        target
                );

        long endTime =
                System.nanoTime();

        if (index != -1) {

            System.out.println(
                    "Value found at sorted index: "
                    + index
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
    }

    // ================= SEARCH COMPARISON =================

    public static void compareSearches() {

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

        // Display results

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
                "Target Value : " + target
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

        System.out.println("---------------------------------------------");

        System.out.println(
                "Linear Search Complexity : O(n)"
        );

        System.out.println(
                "Binary Search Complexity : O(log n)"
        );

        System.out.println(
                "============================================="
        );
    }

    // ================= INPUT VALIDATION =================

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
}