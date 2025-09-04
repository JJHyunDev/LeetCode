class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder sb = new StringBuilder();
        int right = s.length() - 1;

        for(int left = 0; left < s.length(); left++) {
            if(Character.isLetter(s.charAt(left))) {
                while(!Character.isLetter(s.charAt(right))){
                    right--;
                }
                sb.append(s.charAt(right--));
            } else {
                sb.append(s.charAt(left));
            }
        }

        return sb.toString();
    }
}