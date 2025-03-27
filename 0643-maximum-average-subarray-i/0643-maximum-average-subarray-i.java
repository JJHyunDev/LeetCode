class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double curr = 0;
        double answer = 0;

        for(int i = 0; i < k; i++){
            curr += nums[i];
        }

        answer = curr / k;

        for(int right = k; right < nums.length; right++){
            curr += nums[right];
            while(right - left + 1 > k){
                curr -= nums[left];
                left++;
            }
            answer = Math.max(answer, curr / k);
        }

        return answer;
    }
}