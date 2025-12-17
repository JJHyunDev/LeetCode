class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        if(s.length() % 2 != 0) {
            return false;
        }

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(c == '[' || c == '(' || c == '{') {
                stack.push(c);
            }

            if(c == ']' || c == ')' || c == '}') {
                if(stack.isEmpty()) {
                    return false;
                }
                char temp = stack.pop();

                if(temp == '[') {
                    if(c != ']') return false;
                } else if(temp == '(') {
                    if(c != ')') return false;
                } else {
                    if(c != '}') return false;
                }
            }
        }

        if(!stack.isEmpty()) {
            return false;
        }

        return true;
    }
}