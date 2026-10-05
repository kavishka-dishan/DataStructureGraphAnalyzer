package linkedlist;

public class NumberLinkedList {

    private Node head;

    public NumberLinkedList() {
        head = null;
    }

    // Insert a value at the end
    public void insert(int value) {

        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;

            System.out.println(
                    value + " inserted successfully."
            );

            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;

        System.out.println(
                value + " inserted successfully."
        );
    }

    // Delete a value
    public boolean delete(int value) {

        if (head == null) {
            System.out.println("Linked List is empty.");
            return false;
        }

        // Delete the first node
        if (head.data == value) {

            head = head.next;

            System.out.println(
                    value + " deleted successfully."
            );

            return true;
        }

        Node current = head;

        while (current.next != null) {

            if (current.next.data == value) {

                current.next = current.next.next;

                System.out.println(
                        value + " deleted successfully."
                );

                return true;
            }

            current = current.next;
        }

        System.out.println("Value not found.");

        return false;
    }

    // Search for a value
    public boolean search(int value) {

        Node current = head;

        while (current != null) {

            if (current.data == value) {
                return true;
            }

            current = current.next;
        }

        return false;
    }

    // Display all values
    public void display() {

        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        System.out.println("\nLinked List:");

        Node current = head;

        while (current != null) {

            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println(" -> NULL");
    }

    public boolean isEmpty() {
        return head == null;
    }
}