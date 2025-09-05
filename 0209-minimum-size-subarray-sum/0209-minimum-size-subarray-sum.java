class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // left, right target 보다 크거나 같으면 length = right - left + 1, 같거나 작아질 때까지 left++
        // right++ 은 작을 때만

        int left = 0;
        int len = Integer.MAX_VALUE;
        int sum = 0;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];

            while(sum >= target) {
                len = Math.min(len, right - left + 1);
                sum -= nums[left++];
            }
        }

        if(len == Integer.MAX_VALUE) {
            return 0;
        }

        return len;
    }
}