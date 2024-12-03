package Graph;
import java.util.*;

public class BFS {
    public static void main(String[] args) {
        // Example graph using adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(1, Arrays.asList(2, 4));
        graph.put(2, Arrays.asList(1, 3, 5));
        graph.put(3, Arrays.asList(2));
        graph.put(4, Arrays.asList(1));
        graph.put(5, Arrays.asList(2));

        // Perform BFS starting from node 1
        System.out.println("BFS Traversal starting from node 1:");
        bfs(graph, 1);
    }

    public static void bfs(Map<Integer, List<Integer>> graph, int startNode) {
        // Queue for BFS
        Queue<Integer> queue = new LinkedList<>();

        // Set to keep track of visited nodes
        Set<Integer> visited = new HashSet<>();

        // Start with the source node
        queue.add(startNode);
        visited.add(startNode);

        while (!queue.isEmpty()) {
            // Dequeue a node from the queue
            int currentNode = queue.poll();
            System.out.print(currentNode + " ");

            // Visit all unvisited neighbors
            List<Integer> neighbors = graph.getOrDefault(currentNode, new ArrayList<>());
            for (int neighbor : neighbors) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}
