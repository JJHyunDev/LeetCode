class Solution {
    public int smallestNumber(int n) {
        if(n == 1) {
            return 1;
        }

        int temp = 1;
        int ans = 0;
        while(ans < n) {
            ans += temp;
            temp *= 2;
        }

        return ans;
    }
}