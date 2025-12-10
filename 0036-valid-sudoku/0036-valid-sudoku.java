class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        Set<String> set = new HashSet<>();

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                char num = board[i][j];
                if(num != '.') {
                    if(
                        !set.add(num + "in row " + i) ||
                        !set.add(num + "in col " + j) ||
                        !set.add(num + "in box " + i/3 + "-" + j/3)
                    ){
                        return false;
                    }
                }
            }
        }

        return true;
    }
}