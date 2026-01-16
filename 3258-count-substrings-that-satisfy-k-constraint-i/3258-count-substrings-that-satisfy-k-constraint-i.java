class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int ans = 0;

        for(int i = 0; i < n; i++) {
            int oneCount = 0;
            int zeroCount = 0;  
            for(int j = i; j < n; j++) {
                if(s.charAt(j) == '0') {
                    zeroCount++;
                } else {
                    oneCount++;
                }

                if(zeroCount <= k || oneCount <= k) {
                    ans++;
                } else {
                    break;
                }
            }
        } 

        return ans;
    }
}