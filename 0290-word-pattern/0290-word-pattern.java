class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String arr[] = s.split(" ");
        int n = pattern.length();

        if(arr.length != n) {
            return false;
        }

        for(int i = 0; i < n; i++) {

            char c = pattern.charAt(i);
            String word = arr[i];

            if(map.containsKey(c)) {
                if(!map.get(c).equals(word)) {
                    return false;
                }
            } else if(map.containsValue(word)) {
                return false;
            }
            map.put(c, word);
        }

        return true;
    }
}