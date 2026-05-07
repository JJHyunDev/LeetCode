class Solution {
    public boolean hasSameDigits(String s) {
        int n = s.length();
        int[] digits = new int[n];
        
        for(int i = 0; i < n; i++) {
            digits[i] = s.charAt(i) - '0';
        }

        for(int i = n - 1; i > 1; i--) {
            for(int j = 0; j < i; j++) {
                digits[j] = (digits[j] + digits[j + 1]) % 10;
            }
        }

        return digits[0] == digits[1];
    }
}