import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphLinkedTraverse {
    private LinkedList<Integer>[] adj;
    private int V; // number of vertices
    private int E; // number of edges

    public GraphLinkedTraverse(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices, " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + ": ");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs(int s) {
        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);

        while (!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");

            for (int v : adj[u]) {
                if (!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }

    public void dfs(int s){
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        stack.push(s);

        while (!stack.isEmpty()) {
            int u = stack.pop();
            if(!visited[u]){
                visited[u] = true;
                System.out.print(u + " ");

                for (int v : adj[u]) {
                    if (!visited[v]) {
                        stack.push(v);
                    }
                }
            }
        }
    }

    public void dfs_r(){
        boolean[] visited = new boolean[V];
        for (int v = 0; v < V; v++) {
            if (!visited[v]) {
                dfs_r(v, visited);
            }
        }
    }

    public void dfs_r(int v, boolean[] visited){
        visited[v] = true;
        System.out.print(v + " ");
        for (int w : adj[v]) {
            if(!visited[w]){
                dfs_r(w, visited);
            }
        }
    }

    public LinkedList<Integer> getAdj0(){
        return adj[0];
    }

    public static void main(String[] args) {
        GraphLinkedTraverse g = new GraphLinkedTraverse(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2, 4);
        g.bfs(0);
        System.out.println();
        System.out.print(g.getAdj0());
        g.dfs(0);
        System.out.println();
        //System.out.print(g.getAdj0());
        //System.out.println();
        g.dfs_r();
        //System.out.println(g);
    }

}
