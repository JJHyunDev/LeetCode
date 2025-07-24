class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int mul = 1;
        int m = n;
        
        while(n > 0) {
            int temp = n % 10;
            sum += temp;
            mul *= temp;
            n /= 10;
        }

        return (m % (sum + mul)) == 0;

    }
}