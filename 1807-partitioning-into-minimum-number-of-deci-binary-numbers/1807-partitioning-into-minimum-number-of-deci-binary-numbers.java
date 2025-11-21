class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        char[] arr = n.toCharArray();

        for(char c : arr) {
            int num = c - '0';
            ans = Math.max(ans, num);
        }

        return ans;
    }
}