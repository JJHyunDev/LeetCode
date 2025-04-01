class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len-1; i >= 0; i--){
            if(digits[i]<9){
                digits[i] += 1;
                return digits;
            }else if(digits[i]==9){
                digits[i] = 0;
                if(i == 0){
                    int[] answer = new int[len + 1];
                    Arrays.fill(answer, 0);
                    answer[0] = 1;
                    return answer;
                }
            }
        }
        return digits;
    }
}