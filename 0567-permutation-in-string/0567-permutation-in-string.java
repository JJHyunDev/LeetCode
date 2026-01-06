class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();

        if(s1.length() > s2.length()) {
            return false;
        }

        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        for(int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            s2Map.put(c, s2Map.getOrDefault(c, 0) + 1);

            if(i - left + 1 == s1.length()) {
                if(s1Map.equals(s2Map)) {
                return true;
                }

                
                char ch = s2.charAt(left);
                s2Map.put(ch, s2Map.get(ch) - 1);
                if(s2Map.get(ch) == 0) {
                    s2Map.remove(ch);
                }
                left++;
                
            }
        }

        return s1Map.equals(s2Map);
    }
}