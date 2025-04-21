class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<String, Integer> r = new HashMap<String, Integer>();
        HashMap<String, Integer> m = new HashMap<String, Integer>();

        for(String s : ransomNote.split("")){
            r.put(s, r.getOrDefault(s, 0) + 1);
        }

        for(String s : magazine.split("")){
            m.put(s, m.getOrDefault(s, 0) + 1);
        }

        for(String s : r.keySet()){
            if(!m.containsKey(s)){
                return false;
            }

            if(r.get(s) > m.get(s)){
                return false;
            }
        }

        return true;
    }
}