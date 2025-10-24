class Solution {
    List<List<Integer>> allPaths;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        allPaths = new ArrayList<>();

        List<Integer> currentPath = new ArrayList<>();

        int targetNode = graph.length - 1;

        currentPath.add(0);

        dfs(graph, 0, targetNode, currentPath);

        return allPaths;
    }

    public void dfs(int[][] graph, int currentNode, int targetNode, List<Integer> currentPath) {
        if(currentNode == targetNode) {
            allPaths.add(new ArrayList<>(currentPath));

            return;
        }

        for(int neighbor : graph[currentNode]) {
            currentPath.add(neighbor);

            dfs(graph, neighbor, targetNode, currentPath);

            currentPath.remove(currentPath.size() - 1);
        }
    }
}