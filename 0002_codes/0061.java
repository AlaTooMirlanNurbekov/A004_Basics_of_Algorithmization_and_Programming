/*
 * Task 0061 : breadth-first search (BFS)
 *
 * Description:
 * This task performs a BFS traversal on a graph represented with an adjacency
 * list. BFS explores the graph level-by-level using a queue. The user enters:
 * - number of vertices
 * - number of edges
 * - edges as pairs (undirected graph)
 * - a starting vertex for BFS
 *
 * The program prints the order in which vertices are visited.
 *
 * Concept explained:
 * - graph traversal
 * - using a queue (FIFO) for BFS
 * - keeping a visited array to avoid repeated processing
 * - exploring nodes level-by-level
 *
 * BFS is widely used in:
 * - shortest path in unweighted graphs
 * - checking connectivity
 * - solving puzzles or grid problems
 * - network broadcasting simulation
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        ArrayList<Integer>[] graph = new ArrayList[vertices];

        // initialize adjacency list
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u); // undirected graph
        }

        System.out.print("Enter starting vertex for BFS: ");
        int start = sc.nextInt();

        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        // begin BFS
        queue.add(start);
        visited[start] = true;

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {
            int node = queue.remove();
            System.out.print(node + " ");

            // visit neighbors
            for (int neighbor : graph[node]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
