class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < allowed.length(); i++) {
            set.add(allowed.charAt(i));
        }

        int cnt = 0;
        for(String s : words) {
            int temp = 1;
            for(int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if(!set.contains(c)) {
                    temp = 0;
                }
            }
            cnt += temp;
        }

        return cnt;
    }
}