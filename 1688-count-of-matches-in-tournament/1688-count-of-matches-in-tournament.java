class Solution {
    public int numberOfMatches(int n) {
        int cnt = 0;
        while(n > 1) {
            int temp = 0;
            if(n % 2 == 0) {
                temp = n / 2;
                n = temp;
                cnt += temp;
            } else {
                temp = ((n - 1) / 2);
                n = temp + 1;
                cnt += temp;
            }
        }

        return cnt;
    }
}