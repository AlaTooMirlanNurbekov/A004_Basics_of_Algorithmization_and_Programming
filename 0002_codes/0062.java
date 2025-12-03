/*
 * Task 0062 : depth-first search (DFS)
 *
 * Description:
 * This task performs a DFS traversal on a graph represented using an adjacency
 * list. DFS explores as far as possible along one branch before backtracking.
 * The user enters:
 * - number of vertices
 * - number of edges
 * - each edge as a pair (undirected graph)
 * - a starting vertex for DFS
 *
 * The program prints the order of nodes visited during DFS.
 *
 * Concept explained:
 * - recursive DFS traversal
 * - using a visited array to avoid repeated visits
 * - exploring deep paths first (opposite of BFS)
 *
 * DFS is commonly used for:
 * - detecting cycles
 * - connected components
 * - pathfinding
 * - topological sorting
 * - solving maze or puzzle structures
 */

import java.util.*;

public class Main {

    public static void dfs(int node, ArrayList<Integer>[] graph, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
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

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u].add(v);
            graph[v].add(u); // undirected graph
        }
        System.out.print("Enter starting vertex for DFS: ");
        int start = sc.nextInt();
        boolean[] visited = new boolean[vertices];
        System.out.print("DFS Traversal: ");
        dfs(start, graph, visited);
    }
}
