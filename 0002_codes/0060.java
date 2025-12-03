/*
 * Task 0060 : graph representation with adjacency list
 * Description:
 * This task introduces a basic way to represent a graph using an adjacency list.
 * The user enters:
 * - the number of vertices
 * - the number of edges
 * - each edge as a pair of vertices (u, v)
 *
 * The program then builds an adjacency list and prints it. In this version, the
 * graph is treated as an undirected graph, so every edge (u, v) is stored in
 * both lists: u's neighbors and v's neighbors.
 *
 * Concept explained:
 * - representing a graph in memory using lists
 * - understanding vertices and edges
 * - building an adjacency list with ArrayList
 * - seeing how graphs can be stored in a flexible structure
 *
 * Adjacency lists are commonly used in graph algorithms such as BFS, DFS,
 * shortest path algorithms, and many network or map-based problems.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();
        // create adjacency list
        ArrayList<Integer>[] graph = new ArrayList[vertices];
        for (int i = 0; i < vertices; i++) {
            graph[i] = new ArrayList<>();
        }
        System.out.println("Enter edges (u v) as pairs of vertex indexes:");
        System.out.println("Example: 0 1 means an edge between vertex 0 and vertex 1.");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            // add edge for undirected graph
            graph[u].add(v);
            graph[v].add(u);
        }
        // print adjacency list
        System.out.println("\nAdjacency list representation of the graph:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : graph[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }}
    }
