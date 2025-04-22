class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] j = jewels.toCharArray(); // 종류라고 했으니 최대 1개만 나올거라 생각해서 Map이 아닌 array로
        HashMap<Character, Integer> s = new HashMap<>();

        for(char c : stones.toCharArray()){
            s.put(c, s.getOrDefault(c, 0) + 1);
        }

        int ans = 0;
        for(char c : j){
            if(s.containsKey(c)){
                ans += s.get(c);
            }
        }

        return ans;
        
    }
}