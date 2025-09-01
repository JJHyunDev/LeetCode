class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int temp = 0;
        
        while(i < s.length()) {
            while(j < t.length()) {
                if(s.charAt(i) == t.charAt(j)) {
                    temp++;
                    j++;
                    break;
                }
                j++;
            }
            i++;
        }
        
        return temp == s.length();
    }
}