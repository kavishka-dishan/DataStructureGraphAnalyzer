import linkedlist.NumberLinkedList;
import graph.Graph;

public class Main {

    public static void main(String[] args) {

        // =========================
        // LINKED LIST TEST
        // =========================

        System.out.println("=== LINKED LIST TEST ===");

        NumberLinkedList list =
                new NumberLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();

        if (list.search(30)) {
            System.out.println("30 found in the Linked List.");
        } else {
            System.out.println("30 not found.");
        }

        list.delete(20);

        list.display();


        // =========================
        // GRAPH TEST
        // =========================

        System.out.println("\n=== GRAPH TEST ===");

        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        graph.addEdge("D", "E");

        graph.displayGraph();

        System.out.println();

        graph.bfs("A");

        System.out.println();

        graph.dfs("A");
    }
}