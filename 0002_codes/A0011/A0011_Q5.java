import java.util.Arrays;
import java.util.Scanner;

public class Q5Dijkstra {

    // In this solution I represent the graph as an adjacency matrix.
    // I keep a distance array and at each step I pick the vertex with minimum distance.
    // The "min distance" selection plays the same role as a priority queue and
    // helps to always expand the closest vertex first.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = scanner.nextInt();

        int[][] graph = new int[n][n];

        System.out.println("Enter adjacency matrix (0 for no edge, positive weight for edge):");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter starting vertex (0-based index): ");
        int src = scanner.nextInt();

        int[] dist = dijkstra(graph, src);

        System.out.println("Shortest distances from vertex " + src + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("To " + i + " = " + dist[i]);
        }
    }

    private static int[] dijkstra(int[][] graph, int src) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        // initialize distances
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int count = 0; count < n - 1; count++) {
            int u = findMinVertex(dist, visited);

            if (u == -1) break; // no reachable remaining vertex

            visited[u] = true;

            // update distances of neighbors
            for (int v = 0; v < n; v++) {
                if (!visited[v] && graph[u][v] > 0 && dist[u] != Integer.MAX_VALUE) {
                    int newDist = dist[u] + graph[u][v];
                    if (newDist < dist[v]) {
                        dist[v] = newDist;
                    }
                }
            }
        }

        return dist;
    }

    // finds the vertex with minimum tentative distance that is not visited yet
    private static int findMinVertex(int[] dist, boolean[] visited) {
        int minVal = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < minVal) {
                minVal = dist[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}
