// This is a Java file

public void dfs(List<List<Integer>> graph, boolean[] vis, int src) {
    vis[src] = true;
    for (int i = 0; i < graph.get(src).size(); i++) {
        int neighbor = graph.get(src).get(i);
        if (!vis[neighbor]) {
            dfs(graph, vis, neighbor);
        }
    }
}
public void bfs(List<List<Integer>> graph, boolean[] vis, int src) {
        Queue<Integer> queue=new LinkedList<>();
        vis[src] = true;
        queue.add(src);
        while (!queue.isEmpty()) {
            int node = queue.remove();
            // Process the node
            // Traverse all the adjacent nodes of the current node
            for (int neighbor : graph.get(node)) {
                // If the neighbor is not visited, mark it visited and enqueue it
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
}
