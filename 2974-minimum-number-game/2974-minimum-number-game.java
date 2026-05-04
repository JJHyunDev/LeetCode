class Solution {
    public int[] numberGame(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int[] arr = new int[n];
        int idx = 0;
        while(idx < n) {
            int alice = nums[idx];
            arr[idx + 1] = alice;
            int bob = nums[++idx];
            arr[idx - 1] = bob;
            idx++;
        }

        return arr;
    }
}