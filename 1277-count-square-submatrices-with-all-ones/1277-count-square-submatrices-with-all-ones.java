class Solution {
    public int countSquares(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int ans = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 1){
                    if(i > 0 && j > 0) {
                        int left = matrix[i][j - 1];
                        int top = matrix[i - 1][j];
                        int topLeft = matrix[i - 1][j - 1];

                        matrix[i][j] = Math.min(left, Math.min(top, topLeft)) + 1;
                    }
                }
                ans += matrix[i][j];
            }
        }

        return ans;
    }
}