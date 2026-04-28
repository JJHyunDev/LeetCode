class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] ans = new int[n + 1];
        char[] carr = s.toCharArray();

        int low = 0;
        int high = n;

        for(int i = 0; i < carr.length; i++) {
            if(carr[i] == 'I') {
                ans[i] = low++;
            } else {
                ans[i] = high--;
            }
        }

        ans[n] = low;

        return ans;
    }
}