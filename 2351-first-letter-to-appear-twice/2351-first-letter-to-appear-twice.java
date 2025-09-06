class Solution {
    public char repeatedCharacter(String s) {
        char arr[] = s.toCharArray();
        Set<Character> set = new HashSet<>();

        for(char c : arr) {
            if(set.contains(c)) {
                return c;
            } else {
                set.add(c);
            }   
        }

        return 'A';
    }
}