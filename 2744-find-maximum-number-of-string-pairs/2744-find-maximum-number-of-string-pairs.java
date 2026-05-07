class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new HashSet<>();

        int ans = 0;
        for(String word : words) {
            String str = new StringBuilder(word).reverse().toString();
            if(set.contains(str)) {
                set.remove(str);
                ans++;
            } else {
                set.add(word);
            }
        }

        return ans;
    }
}