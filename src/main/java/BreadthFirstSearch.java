
public class BreadthFirstSearch {

    /** bfs will take an Adjacency List as input and return an array containing the order of nodes traversed via a Breadth First Search.
     *
     * @param graph - an Adjacency List
     * @return - an array containing the order of nodes traversed via a Breadth First Search.
     */
    public static int[] bfs(int[][] graph) {

            CISQueue<Integer> queue = new CISQueue<>(0);
            queue.enqueue(0);

            boolean[] visited = new boolean[graph.length];
            visited[0] = true;

            int[] bfsPath = new int[graph.length];
            int bfsPathIndex = 0;
            bfsPath[bfsPathIndex++] = 0;

            while (!queue.isEmpty()) {
                int currentNode = queue.poll();

                for (int neighbor : graph[currentNode]) {
                    if (!visited[neighbor]) {
                        visited[neighbor] = true;
                        queue.enqueue(neighbor);
                        bfsPath[bfsPathIndex++] = neighbor;
                    }
                }
            }

            return bfsPath;
        }
}
