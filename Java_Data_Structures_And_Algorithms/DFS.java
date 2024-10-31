import java.util.*;

class Graph {
    private int vertices; // Number of vertices
    private LinkedList<Integer> adjList[]; // Adjacency List

    // Constructor
    Graph(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge to graph
    void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // Helper method for DFS
    private void dfsUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");

        // Recur for all the vertices adjacent to this vertex
        for (int n : adjList[v]) {
            if (!visited[n]) {
                dfsUtil(n, visited);
            }
        }
    }

    // The DFS traversal method
    void dfs(int v) {
        // Mark all the vertices as not visited
        boolean visited[] = new boolean[vertices];

        // Call the recursive helper method to print DFS traversal
        dfsUtil(v, visited);
    }

    // Driver code
    public static void main(String args[]) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println("Depth First Traversal starting from vertex 2:");
        graph.dfs(2);
    }
}
