class Solution {
    public int numSub(String s) {
        int MOD = 1_000_000_007;
        long ans = 0;
        long cnt = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '1') {
                cnt++;
                ans = (ans + cnt) % MOD;
            } else {
                cnt = 0;
            }
        }

        return (int) ans;
    }
}