class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int zero = 0;
        int one = 0;
        int ans = 0;
        
        int left = 0;
        for(int right = 0; right < n; right++) {
            char c = s.charAt(right);

            if(c == '1') {
                one++;
            } else {
                zero++;
            }

            while(one > k && zero > k) {
                char ch = s.charAt(left);
                if(ch == '1') {
                    one--;
                } else {
                    zero--;
                }
                left++;
            }
            ans += (right - left + 1); 
        }
        return ans;
    }
}