class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for(int[] row : grid) {
            Arrays.sort(row);
        }

        int answer = 0;
        int m = grid.length;
        int n = grid[0].length;

        for(int j = 0; j < n; j++) {
            int maxInCol = 0;
            for(int i = 0; i < m; i++) {
                maxInCol = Math.max(maxInCol, grid[i][j]);
            }

            answer += maxInCol;
        }

        return answer;
    }
}