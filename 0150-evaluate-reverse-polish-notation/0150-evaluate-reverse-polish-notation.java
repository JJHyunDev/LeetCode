class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums = new Stack<>();

        for (String token : tokens) {
            // 1. 연산자인지 확인 (String 비교는 equals 사용)
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                // 2. 순서 중요: 먼저 꺼낸 것이 뒤에 오는 피연산자(b)
                int b = nums.pop();
                int a = nums.pop();
                
                if (token.equals("+")) {
                    nums.push(a + b);
                } else if (token.equals("-")) {
                    nums.push(a - b); // 순서 주의 (a - b)
                } else if (token.equals("*")) {
                    nums.push(a * b);
                } else if (token.equals("/")) {
                    nums.push(a / b); // 순서 주의 (a / b)
                }
            } else {
                // 3. 연산자가 아니면 숫자로 변환하여 push
                nums.push(Integer.parseInt(token));
            }
        }
        
        // 4. 마지막에 남은 하나가 결과값
        return nums.pop();
    }
}