class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(Character.isLetter(c)) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        for(char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}