class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> counts = new HashMap<>();
        int start = 0;
        int maxCount = 0;
        int maxLength = 0;

        for(int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            counts.put(endChar, counts.getOrDefault(endChar, 0) + 1);

            maxCount = Math.max(maxCount, counts.get(endChar));

            if (end - start + 1 - maxCount > k) {
                char startChar = s.charAt(start);
                counts.put(startChar, counts.get(startChar) - 1);
                start++;
            }

            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}
