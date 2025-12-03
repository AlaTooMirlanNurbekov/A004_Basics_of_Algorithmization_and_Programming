/*
 * Task 0063 : dijkstra's shortest path algorithm (simple version)
 * Description:
 * This task asks the user to enter a weighted graph using an adjacency matrix,
 * and then computes the shortest path from a chosen starting vertex to all
 * other vertices using Dijkstra’s algorithm.
 * Concept explained:
 * - working with weighted graphs
 * - using a distance array to store shortest known distances
 * - selecting the next unvisited vertex with the smallest distance
 * - updating (relaxing) distances to neighboring vertices
 *
 * Dijkstra’s algorithm is one of the most important algorithms in computer
 * science. It is used in:
 * - GPS navigation
 * - network routing
 * - shortest paths in maps or graphs
 *
 * This is a simple version for teaching purposes.
 */

import java.util.*;

public class Main {
    public static int findMinVertex(int[] distance, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int vertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visited[i] && distance[i] < min) {
                min = distance[i];
                vertex = i;
            }
        }
        return vertex;
    }
    public static void dijkstra(int[][] graph, int start) {
        int n = graph.length;
        int[] distance = new int[n];  
        boolean[] visited = new boolean[n];
        // initialize distances
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;
        // main algorithm loop
        for (int i = 0; i < n - 1; i++) {
            int u = findMinVertex(distance, visited);
            visited[u] = true;
            for (int v = 0; v < n; v++) {
                if (graph[u][v] != 0 && !visited[v]) {
                    int newDist = distance[u] + graph[u][v];
                    if (newDist < distance[v]) {
                        distance[v] = newDist;
                    }
                }
            }
        }

        // print results
        System.out.println("Shortest distances from vertex " + start + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("To vertex " + i + ": " + distance[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();
        int[][] graph = new int[n][n];

        System.out.println("Enter adjacency matrix (0 means no edge):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter starting vertex: ");
        int start = sc.nextInt();
        dijkstra(graph, start);
    }
}
