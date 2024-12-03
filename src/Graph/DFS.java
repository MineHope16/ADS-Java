package Graph;
import java.util.*;

public class DFS {
    public static void main(String[] args) {
        // Example graph as adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 4));
        graph.put(2, Arrays.asList(1, 3, 5));
        graph.put(3, Arrays.asList(2));
        graph.put(4, Arrays.asList(1));
        graph.put(5, Arrays.asList(2));

        // Set to track visited nodes
        Set<Integer> visited = new HashSet<>();

        // Perform DFS starting from node 1
        System.out.println("DFS Traversal (Recursive):");
        dfs(graph, 1, visited);
    }

    public static void dfs(Map<Integer, List<Integer>> graph, int node, Set<Integer> visited) {
        // Mark the node as visited
        visited.add(node);
        System.out.print(node + " ");

        // Recur for all unvisited neighbors
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfs(graph, neighbor, visited);
            }
        }
    }
}

