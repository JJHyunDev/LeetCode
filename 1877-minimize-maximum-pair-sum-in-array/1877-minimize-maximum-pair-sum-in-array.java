class Solution {
    public int minPairSum(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        Arrays.sort(nums);

        int max = 0;
        while(l < r) {
            max = Math.max(max, nums[l] + nums[r]);
            l++;
            r--;
        }

        return max;
    }
}