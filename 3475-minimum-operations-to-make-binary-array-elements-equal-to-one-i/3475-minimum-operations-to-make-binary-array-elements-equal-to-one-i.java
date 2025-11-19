class Solution {
    public int minOperations(int[] nums) {
        int cnt = 0;

        for(int i = 0; i < nums.length - 2; i++) {
            if(nums[i] == 0) {
                for(int j = i; j <= i + 2; j++) {
                    if(nums[j] == 0) {
                        nums[j] = 1;
                    } else {
                        nums[j] = 0;
                    }
                }
                cnt++;
            }
        }

        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        if(sum != nums.length) {
            cnt = -1;
        }

        return cnt;
    }
}