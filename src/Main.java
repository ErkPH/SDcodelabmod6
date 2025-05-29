import java.util.*;

class LogisticsGraph {
    private static final int N = 5; // Jumlah gudang A-E
    private int[][] adjacencyMatrix = new int[N][N];
    private char[] nodes = {'A', 'B', 'C', 'D', 'E'};

    // Tambahkan edge dari gudang asal ke tujuan
    public void addEdge(char from, char to) {
        int i = from - 'A';
        int j = to - 'A';
        adjacencyMatrix[i][j] = 1;
    }

    // Tampilkan adjacency matrix
    public void printAdjacencyMatrix() {
        System.out.println("Adjacency Matrix:");
        System.out.print("  ");
        for (char c : nodes) System.out.print(c + " ");
        System.out.println();

        for (int i = 0; i < N; i++) {
            System.out.print(nodes[i] + " ");
            for (int j = 0; j < N; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // BFS traversal dari node awal
    public void bfs(char startChar) {
        boolean[] visited = new boolean[N];
        Queue<Integer> queue = new LinkedList<>();
        int start = startChar - 'A';

        visited[start] = true;
        queue.offer(start);

        System.out.print("BFS dari " + startChar + ": ");
        while (!queue.isEmpty()) {
            int current = queue.poll();
            System.out.print(nodes[current] + " ");

            for (int i = 0; i < N; i++) {
                if (adjacencyMatrix[current][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
        System.out.println();
    }

    // DFS traversal dari node awal
    public void dfs(char startChar) {
        boolean[] visited = new boolean[N];
        int start = startChar - 'A';
        System.out.print("DFS dari " + startChar + ": ");
        dfsHelper(start, visited);
        System.out.println();
    }

    private void dfsHelper(int current, boolean[] visited) {
        visited[current] = true;
        System.out.print(nodes[current] + " ");
        for (int i = 0; i < N; i++) {
            if (adjacencyMatrix[current][i] == 1 && !visited[i]) {
                dfsHelper(i, visited);
            }
        }
    }

    public static void main(String[] args) {
        LogisticsGraph graph = new LogisticsGraph();

        // Tambahkan 7 jalur antar gudang (directed)
        graph.addEdge('A', 'B');
        graph.addEdge('A', 'C');
        graph.addEdge('B', 'D');
        graph.addEdge('C', 'D');
        graph.addEdge('C', 'E');
        graph.addEdge('D', 'E');
        graph.addEdge('E', 'A');

        // Tampilkan adjacency matrix
        graph.printAdjacencyMatrix();

        // Jalankan BFS dan DFS dari gudang A
        graph.bfs('A');
        graph.dfs('A');
    }
}
