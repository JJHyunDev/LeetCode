class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < grid.length; i++) {
            String col = "";
            for(int j = 0; j < grid[i].length; j++) {
                col += grid[i][j] + ",";
            }

            map.put(col, map.getOrDefault(col, 0) + 1);
        }

        int ans = 0;
        for(int i = 0; i < grid.length; i++) {
            String col = "";
            for(int j = 0; j < grid[i].length; j++) {
                col += grid[j][i] + ",";
            }

            ans += map.getOrDefault(col, 0);            
        }

        return ans;
    }
}