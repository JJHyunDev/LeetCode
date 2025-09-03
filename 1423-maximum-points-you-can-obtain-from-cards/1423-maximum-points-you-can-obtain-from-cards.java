class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = 0;
        int sum = 0;
        int n = cardPoints.length - 1;

        for(int i = 0; i < k; i++) {
            sum += cardPoints[i];
            max = Math.max(max, sum);
        }

        for(int i = k - 1; i >= 0; i--) {
            sum -= cardPoints[i];
            sum += cardPoints[n--];
            max = Math.max(max, sum);
        }

        return max;
    }
}