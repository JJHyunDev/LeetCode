class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) {
            return 0;
        }

        int answer = 0;
        int left = 0;
        int temp = 1;

        for(int right = 0; right < nums.length; right++) {
            temp *= nums[right];
            
            while(temp >= k) {
                temp /= nums[left];
                left++;
            }

            answer += right - left + 1;
        }

        return answer;
    }
}