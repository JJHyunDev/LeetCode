class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double answer = 0.0;
        int left = 0;
        int temp = 0;
        
        for(int i = 0; i < k; i++) {
            temp += nums[i];
        }

        answer = (double) temp / k;
        for(int i = k; i < nums.length; i++) {
            temp += nums[i] - nums[i - k];

            answer = Math.max(answer, (double) temp / k);
        }

        return answer;
    }
}