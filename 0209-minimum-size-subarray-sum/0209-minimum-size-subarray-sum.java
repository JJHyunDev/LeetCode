class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int answer = nums.length;
        int left = 0;
        int sum = 0;
        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                answer = Math.min(answer, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if(left == 0 && sum != target){ // 
            answer = 0;
        }
        return answer;
    }
}