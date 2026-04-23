class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int left = 0;
        int right = 0;
        int idx = 0;
        while(idx < n) {
            if(idx % 2 == 0) {
                while(nums[right] < 0) {
                    right++;
                }

                ans[idx++] = nums[right++];         
            } else {
                while(nums[left] >= 0) {
                    left++;
                } 

                ans[idx++] = nums[left++];
            }
        }

        return ans;
    }
}