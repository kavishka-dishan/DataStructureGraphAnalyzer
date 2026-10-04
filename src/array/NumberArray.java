package array;

public class NumberArray {

    private int[] numbers;
    private int size;

    public NumberArray(int capacity) {
        numbers = new int[capacity];
        size = 0;
    }

    // Insert a new value
    public boolean insert(int value) {

        if (size == numbers.length) {
            System.out.println("Array is full.");
            return false;
        }

        numbers[size] = value;
        size++;

        System.out.println(value + " inserted successfully.");
        return true;
    }

    // Delete a value
    public boolean delete(int value) {

        int index = search(value);

        if (index == -1) {
            System.out.println("Value not found.");
            return false;
        }

        for (int i = index; i < size - 1; i++) {
            numbers[i] = numbers[i + 1];
        }

        size--;

        System.out.println(value + " deleted successfully.");
        return true;
    }

    // Linear search
    public int search(int value) {

        for (int i = 0; i < size; i++) {

            if (numbers[i] == value) {
                return i;
            }
        }

        return -1;
    }

    // Display all elements
    public void display() {

        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.println("\nArray Elements:");

        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
    }

    // Return a copy containing only stored values
    public int[] getElements() {

        int[] copy = new int[size];

        for (int i = 0; i < size; i++) {
            copy[i] = numbers[i];
        }

        return copy;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return numbers.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}