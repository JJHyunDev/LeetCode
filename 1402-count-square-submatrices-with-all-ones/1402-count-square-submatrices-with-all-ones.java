class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == 1){
                    if(i > 0 && j > 0) {
                        int top = matrix[i - 1][j];
                        int left = matrix[i][j - 1];
                        int topleft = matrix[i - 1][j - 1];

                        matrix[i][j] = Math.min(top, Math.min(left, topleft)) + 1;
                    }
                }
                ans += matrix[i][j];
            }
        }

        return ans;
    }
}