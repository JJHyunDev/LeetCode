class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> smap = new HashMap<>();
        Map<Character, Integer> tmap = new HashMap<>();

        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();

        if(sarr.length != tarr.length) {
            return false;
        } 

        for(int i = 0; i < sarr.length; i++) {
            smap.put(sarr[i], smap.getOrDefault(sarr[i], 0) + 1);
            tmap.put(tarr[i], tmap.getOrDefault(tarr[i], 0) + 1);
        }

        for(char key : smap.keySet()) {
            int snum = smap.get(key);
            int tnum = tmap.getOrDefault(key, 0);

            if(snum != tnum) {
                return false;
            }
        }

        return true;
    }
}