class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        int n = s.length();
        for(int i = 0; i < n; i++) {

            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(map.containsKey(sc)) {
                if(map.get(sc) != tc) {
                    return false;
                } 
            } else if (map.containsValue(tc)) {
                    return false;
                }
            map.put(sc, tc);
        }

        return true;
    }
}