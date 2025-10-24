class Solution {
    List<List<Integer>> answer;
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        answer = new ArrayList<>();

        List<Integer> currentPath = new ArrayList<>();
        currentPath.add(0);

        int target = graph.length - 1;
        
        dfs(graph, 0, target, currentPath);

        return answer;
    }

    public void dfs(int[][] graph, int currentNode, int targetNode, List<Integer> currentPath) {
        if(currentNode == targetNode) {
            answer.add(new ArrayList<>(currentPath));
            return;   
        }

        for(int neighbor : graph[currentNode]) {
            currentPath.add(neighbor);

            dfs(graph, neighbor, targetNode, currentPath);

            currentPath.remove(currentPath.size() - 1);
        }
    }
}