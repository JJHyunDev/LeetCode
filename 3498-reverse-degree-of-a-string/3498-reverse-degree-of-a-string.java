class Solution {
    public int reverseDegree(String s) {
        char[] arr = s.toCharArray();

        int ans = 0;
        int num = 1;
        for(char c : arr) {
            ans += ((26 - (c - 'a')) * num);
            num++;
        }

        return ans;
    }
}