import java.util.*;

class DFS {

    List<List<Integer>> graph;
    boolean[] visited;
    List<Integer> dfsOrder = new ArrayList<>();
    List<Integer> bfsOrder = new ArrayList<>();

    public static void main(String[] args) {

        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D", "E"));
        graph.put("C", Arrays.asList("F"));
        graph.put("D", Arrays.asList());
        graph.put("E", Arrays.asList());
        graph.put("F", Arrays.asList());

        dfs("A");
        bfs("A");

        System.out.println("DFS Traversal: " + traversalOrder);
        System.out.println("BFS Traversal: " + bfsOrder);
    }

    GraphInt(int n) {
        graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        visited = new boolean[n];
    }

    void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u); // ถ้าเป็น undirected
    }

    void dfs(int node) {
        if (!visited[node]) {
            visited[node] = true;
            dfsOrder.add(node);
            for (int neighbor : graph.get(node)) {
                dfs(neighbor);
            }
        }
    }

    void bfs(int start) {
        Queue<Integer> q = new ArrayDeque<>();
        Arrays.fill(visited, false);
        bfsOrder.clear();

        visited[start] = true;
        q.add(start);

        while (!q.isEmpty()) {
            int node = q.poll();
            bfsOrder.add(node);
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }

}