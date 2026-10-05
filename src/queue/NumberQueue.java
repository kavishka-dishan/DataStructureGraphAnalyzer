package queue;

public class NumberQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public NumberQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // Add a value to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }

        rear = (rear + 1) % queue.length;
        queue[rear] = value;
        size++;
        System.out.println(value + " enqueued successfully.");
    }

    // Remove the front value
    public Integer dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }

        int value = queue[front];
        front = (front + 1) % queue.length;
        size--;
        System.out.println(value + " dequeued successfully.");
        return value;
    }

    // View the front value
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }

        return queue[front];
    }

    // Display queue from front to rear
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("\nQueue Elements (Front to Rear):");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % queue.length;
            System.out.print(queue[index] + " ");
        }

        System.out.println();
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public int getSize() {
        return size;
    }
}