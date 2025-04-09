class Solution {
    public int maxVowels(String s, int k) {
        String vowelSet = "aeiou";
        int vowelCount = 0;

        // Initialize the first window
        for (int i = 0; i < k; i++) {
            if (vowelSet.indexOf(s.charAt(i)) != -1) vowelCount++;
        }

        int maxVowelCount = vowelCount;

        // Slide the window across the string
        for (int i = k; i < s.length(); i++) {
            if (vowelSet.indexOf(s.charAt(i)) != -1) vowelCount++;   // Add new character
            if (vowelSet.indexOf(s.charAt(i - k)) != -1) vowelCount--; // Remove old character

            maxVowelCount = Math.max(maxVowelCount, vowelCount);
            if (maxVowelCount == k) return k; // Early exit if max possible reached
        }

        return maxVowelCount;
    }
}