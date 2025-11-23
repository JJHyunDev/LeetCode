class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character, Integer> vow = new HashMap<>();
        HashMap<Character, Integer> con = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vow.put(c, vow.getOrDefault(c, 0) + 1);
            } else {
                con.put(c, con.getOrDefault(c, 0) + 1);
            }
        }
        
        int vMax = 0;
        int cMax = 0;
        for(char c : vow.keySet()) {
            vMax = Math.max(vMax, vow.get(c));
        }

        for(char c : con.keySet()) {
            cMax = Math.max(cMax, con.get(c));
        }

        return vMax + cMax;
    }
}