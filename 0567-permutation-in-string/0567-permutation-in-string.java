class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> s1Map = new HashMap<>();

        for(char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> s2Map = new HashMap<>();
        
        int left = 0;
        for(int right = 0; right < s2.length(); right++) {
            char rightChar = s2.charAt(right);
            s2Map.put(rightChar , s2Map.getOrDefault(rightChar, 0) + 1);

            if(right - left + 1 == s1.length()) {
                if(s1Map.equals(s2Map)) {
                    return true;
                }

                char leftChar = s2.charAt(left);
                s2Map.put(leftChar, s2Map.get(leftChar) - 1);
                if(s2Map.get(leftChar) == 0) {
                    s2Map.remove(leftChar);
                }

                left++;
            }
        }

        return false;
    }
}