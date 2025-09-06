class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();
        char arr[] = sentence.toCharArray();

        for(char c : arr) {
            set.add(c);
        }

        return set.size() == 26;
    }
}