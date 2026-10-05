package stack;

public class NumberStack {

    private int[] stack;
    private int top;

    public NumberStack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    // Push a value to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full.");
            return;
        }

        top++;
        stack[top] = value;
        System.out.println(value + " pushed successfully.");
    }

    // Remove the top value
    public Integer pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return null;
        }

        int value = stack[top];
        top--;
        System.out.println(value + " popped successfully.");
        return value;
    }

    // View the top value
    public Integer peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }

        return stack[top];
    }

    // Display stack from top to bottom
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("\nStack Elements (Top to Bottom):");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public int getSize() {
        return top + 1;
    }
}