class Solution {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long prefix[] = new long[n];
        int ans = 0;

        prefix[0] = nums[0];
        for(int i = 1; i < n ; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }

        for(int i = 0; i < n - 1; i++) {
            long left = prefix[i];
            long right = prefix[n - 1] - prefix[i];

            if(left >= right) {
                ans++;
            }
        }

        return ans;
    }
}