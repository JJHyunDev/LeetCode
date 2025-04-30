import java.util.HashMap;

class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String, Integer> map = new HashMap<>();
        int n = grid.length;
        
        // 모든 행을 문자열로 변환해 카운트
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                sb.append(grid[i][j]).append(",");
            }
            String key = sb.toString();
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        
        int ans = 0;
        
        //  모든 열을 문자열로 변환 후 행 맵과 비교
        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(grid[i][j]).append(",");
            }
            String key = sb.toString();
            ans += map.getOrDefault(key, 0); // 일치하는 행의 개수 누적
        }
        
        return ans;
    }
}