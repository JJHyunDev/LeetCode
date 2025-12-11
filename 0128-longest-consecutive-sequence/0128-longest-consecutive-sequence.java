class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }

        if(nums.length == 1) {
            return 1;
        }

        Arrays.sort(nums);

        int ans = 1;
        int len = 1;
        int temp = nums[0];
        for(int i = 1; i < nums.length; i++) {
            temp += 1;
            if(temp == nums[i]) {
                len++;
                ans = Math.max(ans, len);
            } else if(temp < nums[i]){
                ans = Math.max(ans, len);
                len = 1;
            }
            temp = nums[i];
        }

        return ans;
    }
}