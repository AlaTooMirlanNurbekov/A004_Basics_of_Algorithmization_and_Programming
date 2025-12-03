/*
 * Task 0070 : topological sort (Kahn’s Algorithm)
 *
 * Description:
 * This task performs a topological sort on a directed graph using Kahn’s
 * algorithm. A topological order is only possible when the graph has no
 * cycles (it must be a Directed Acyclic Graph — DAG).
 *
 * The program:
 * - takes a directed graph as input using adjacency lists
 * - calculates the in-degree of each vertex
 * - uses a queue to repeatedly remove vertices with in-degree 0
 * - prints the resulting topological order
 *
 * Concept explained:
 * - directed graphs (edges have direction)
 * - in-degree of a vertex (how many edges come into it)
 * - using a queue for BFS-style processing
 * - detecting cycles (if no valid topological order exists)
 *
 * Topological sorting is used in:
 * - dependency resolution (build tools, package managers)
 * - task scheduling
 * - ordering steps in workflows
 * - compiler design for ordering instructions
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter number of directed edges: ");
        int edges = sc.nextInt();
        ArrayList<Integer>[] graph = new ArrayList[vertices];

        // initialize adjacency list
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }

        int[] inDegree = new int[vertices];

        System.out.println("Enter directed edges (u v) meaning u -> v:");

        // read edges and compute in-degree
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            inDegree[v]++;
        }
        //queue for all vertices with in-degree 0
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < vertices; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        ArrayList<Integer> topoOrder = new ArrayList<>();

        //this is the Kahn's algorithm
        while (!queue.isEmpty()) {
            int node = queue.remove();
            topoOrder.add(node);

            // decrease in-degree of neighbors
            for (int neighbor : graph[node]) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }

        //if topoOrder doesn't include all vertices, graph has a cycle
        if (topoOrder.size() != vertices) {
            System.out.println("The graph contains a cycle. Topological order is not possible.");
        } else {
            System.out.println("Topological order:");
            for (int v : topoOrder) {
                System.out.print(v + " ");
            }
        }
    }
}
