class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            map.put(key, i);
        }

        int ans = 0;
        for(int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            int val = map.get(key);

            ans += Math.abs(val - i);
        }

        return ans;
    }
}