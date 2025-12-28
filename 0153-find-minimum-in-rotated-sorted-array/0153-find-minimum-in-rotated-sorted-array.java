class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length - 1;

        if(nums[left] < nums[right]) {
            return nums[left];
        }

        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            } if(nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } if (nums[mid] < nums[nums.length - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }
}