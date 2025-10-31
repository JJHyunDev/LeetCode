class Solution {
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n + 1];
        return solve(n);
    }

    public int solve(int n) {
        if(n == 1) {
            return 1;
        }

        if(n == 2) {
            return 2;
        }

        if(memo[n] != 0) {
            return memo[n];
        }

        memo[1] = 1;
        memo[2] = 2;

        int way = solve(n - 1) + solve(n - 2);

        memo[n] = way;
        return way;
    }
}