package graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    private ArrayList<String> vertices;
    private ArrayList<ArrayList<Integer>> adjacencyList;

    private int bfsSteps;
    private int dfsSteps;

    public Graph() {

        vertices = new ArrayList<>();
        adjacencyList = new ArrayList<>();

        bfsSteps = 0;
        dfsSteps = 0;
    }

    // Add a new vertex
    public void addVertex(String vertex) {

        if (vertex == null || vertex.trim().isEmpty()) {
            System.out.println("Vertex name cannot be empty.");
            return;
        }

        vertex = vertex.trim();

        if (findVertex(vertex) != -1) {
            System.out.println("Vertex already exists.");
            return;
        }

        vertices.add(vertex);

        adjacencyList.add(
                new ArrayList<>()
        );

        System.out.println(
                vertex + " added successfully."
        );
    }

    // Add an undirected edge
    public void addEdge(String vertex1, String vertex2) {

        int index1 = findVertex(vertex1);
        int index2 = findVertex(vertex2);

        if (index1 == -1 || index2 == -1) {

            System.out.println(
                    "One or both vertices do not exist."
            );

            return;
        }

        if (index1 == index2) {

            System.out.println(
                    "Cannot connect a vertex to itself."
            );

            return;
        }

        if (adjacencyList.get(index1).contains(index2)) {

            System.out.println(
                    "Edge already exists."
            );

            return;
        }

        // Undirected graph
        adjacencyList.get(index1).add(index2);
        adjacencyList.get(index2).add(index1);

        System.out.println(
                "Edge added between "
                        + vertices.get(index1)
                        + " and "
                        + vertices.get(index2)
                        + "."
        );
    }

    // Find a vertex
    private int findVertex(String vertex) {

        if (vertex == null) {
            return -1;
        }

        for (int i = 0; i < vertices.size(); i++) {

            if (vertices.get(i).equalsIgnoreCase(vertex.trim())) {
                return i;
            }
        }

        return -1;
    }

    // Display graph
    public void displayGraph() {

        if (vertices.isEmpty()) {

            System.out.println("Graph is empty.");

            return;
        }

        System.out.println("\n=================================");
        System.out.println("             GRAPH");
        System.out.println("=================================");

        for (int i = 0; i < vertices.size(); i++) {

            System.out.print(
                    vertices.get(i) + " -> "
            );

            for (int neighbor : adjacencyList.get(i)) {

                System.out.print(
                        vertices.get(neighbor) + " "
                );
            }

            System.out.println();
        }
    }

    // BFS traversal
    public void bfs(String startVertex) {

        int startIndex = findVertex(startVertex);

        if (startIndex == -1) {

            System.out.println(
                    "Starting vertex not found."
            );

            return;
        }

        boolean[] visited =
                new boolean[vertices.size()];

        Queue<Integer> queue =
                new LinkedList<>();

        bfsSteps = 0;

        visited[startIndex] = true;
        queue.offer(startIndex);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {

            int current =
                    queue.poll();

            bfsSteps++;

            System.out.print(
                    vertices.get(current) + " "
            );

            for (int neighbor :
                    adjacencyList.get(current)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;

                    queue.offer(neighbor);
                }
            }
        }

        System.out.println();

        System.out.println(
                "BFS Steps: " + bfsSteps
        );
    }

    // DFS traversal
    public void dfs(String startVertex) {

        int startIndex =
                findVertex(startVertex);

        if (startIndex == -1) {

            System.out.println(
                    "Starting vertex not found."
            );

            return;
        }

        boolean[] visited =
                new boolean[vertices.size()];

        dfsSteps = 0;

        System.out.print("DFS Traversal: ");

        dfsRecursive(
                startIndex,
                visited
        );

        System.out.println();

        System.out.println(
                "DFS Steps: " + dfsSteps
        );
    }

    // Recursive DFS method
    private void dfsRecursive(
            int current,
            boolean[] visited) {

        visited[current] = true;

        dfsSteps++;

        System.out.print(
                vertices.get(current) + " "
        );

        for (int neighbor :
                adjacencyList.get(current)) {

            if (!visited[neighbor]) {

                dfsRecursive(
                        neighbor,
                        visited
                );
            }
        }
    }

    public int getBfsSteps() {
        return bfsSteps;
    }

    public int getDfsSteps() {
        return dfsSteps;
    }

    public boolean isEmpty() {
        return vertices.isEmpty();
    }
}