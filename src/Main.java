import stack.NumberStack;
import queue.NumberQueue;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== STACK TEST ===");

        NumberStack stack =
                new NumberStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        System.out.println(
                "Top Value: " + stack.peek()
        );

        stack.pop();
        stack.display();

        System.out.println("\n=== QUEUE TEST ===");

        NumberQueue queue =
                new NumberQueue(5);

        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);

        queue.display();

        System.out.println(
                "Front Value: " + queue.peek()
        );

        queue.dequeue();
        queue.display();
    }
}