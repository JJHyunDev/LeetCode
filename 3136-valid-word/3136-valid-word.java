class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;

        int vowels = 0;
        int consonants = 0;

        for(char c : word.toCharArray()){
            if(!Character.isLetterOrDigit(c)) return false;

            if(Character.isLetter(c)){
                char lowwer = Character.toLowerCase(c);
                if(lowwer == 'a' || lowwer == 'e' || lowwer == 'i' || lowwer == 'o' || lowwer == 'u'){
                    vowels++;
                } else{
                    consonants++;
                }
            }
        }
        return vowels > 0 && consonants > 0;
    }
}