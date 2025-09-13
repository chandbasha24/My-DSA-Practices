import java.util.*;

public class DFSExaample {

    // Recursive DFS function
    public static void dfs(int node, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        // Mark the current node as visited
        visited.add(node);
        System.out.print(node + " "); // Print the current node

        // Recur for all neighbors of the current node
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, graph, visited);
            }
        }
    }

    public static void main(String[] args) {
        // Define the graph as an adjacency list
        Map<Integer, List<Integer>> graph = new HashMap<>();
        graph.put(0, Arrays.asList(1, 2));
        graph.put(1, Arrays.asList(3, 4));
        graph.put(2, Arrays.asList(5));
        graph.put(3, Arrays.asList());
        graph.put(4, Arrays.asList());
        graph.put(5, Arrays.asList());

        // Track visited nodes
        Set<Integer> visited = new HashSet<>();

        // Perform DFS starting from node 0
        System.out.println("DFS Traversal:");
        dfs(0, graph, visited);
    }
}
