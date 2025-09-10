class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int ans = 0;
        int idx = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(map.containsKey(c) && map.get(c) >= idx) {
                idx = map.get(c) + 1;
            } 

            map.put(c, i);
            ans = Math.max(ans, i - idx + 1);
        }
        
        return ans;
    }
}