class Solution {
    public int countVowelStrings(int n) {
        int[] dp = {1, 1, 1, 1, 1};

        for(int i = 1; i < n; i++) {
            for(int v = 1; v < dp.length; v++) {
                dp[v] += dp[v - 1];
            }
        }

        int ans = 0;
        for(int i : dp) {
            ans += i;
        }

        return ans;
    }
}