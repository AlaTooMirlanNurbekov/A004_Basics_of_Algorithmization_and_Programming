/*
 * Task 0069 : detect cycle in an undirected graph (DFS)
 *
 * Description:
 * This task checks whether an undirected graph contains a cycle.
 * The graph is represented with an adjacency list. The user enters:
 * - number of vertices
 * - number of edges
 * - each edge as a pair of vertices (u, v)
 *
 * The program uses depth-first search (DFS) with a "parent" parameter.
 * In an undirected graph, a cycle exists if we ever visit an already visited
 * vertex that is not the direct parent of the current vertex.
 *
 * Concept explained:
 * - DFS on graphs
 * - visited array for tracking explored vertices
 * - parent tracking to distinguish a real cycle from the edge back to parent
 * - cycle detection logic in undirected graphs
 *
 * Cycle detection is used in network design, dependency checking, and
 * many graph algorithms where you must know whether a structure is
 * tree-like or not.
 */

import java.util.*;

public class Main {

    // DFS helper to detect cycle
    public static boolean hasCycleDFS(int node, int parent,
                                      ArrayList<Integer>[] graph,
                                      boolean[] visited) {
        visited[node] = true;

        for (int neighbor : graph[node]) {
            // if neighbor not visited, explore deeper
            if (!visited[neighbor]) {
                if (hasCycleDFS(neighbor, node, graph, visited)) {
                    return true; // cycle found in deeper call
                }
            }
            // if neighbor is visited and not the parent, cycle exists
            else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }

    public static boolean hasCycle(ArrayList<Integer>[] graph, int vertices) {
        boolean[] visited = new boolean[vertices];

        // graph may be disconnected, so check all components
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (hasCycleDFS(i, -1, graph, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

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
        System.out.println("Enter edges (u v) for an undirected graph:");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u].add(v);
            graph[v].add(u); // undirected: add both directions
        }
        boolean hasCycle = hasCycle(graph, vertices);
        if (hasCycle) {
            System.out.println("The graph contains a cycle.");
        } else {
            System.out.println("The graph does NOT contain a cycle.");
        }
    }
}
