class Solution {
    public int[] rearrangeArray(int[] nums) {
        int idx1 = 0, idx2 = 1, i = 0, n = nums.length;
        int[] ans = new int[n];

        while(i < n) {
            if(nums[i] >= 0) {
                ans[idx1] = nums[i];
                idx1 += 2;
            } else {
                ans[idx2] = nums[i];
                idx2 += 2;
            }
            i++;
        }

        return ans;
    }
}