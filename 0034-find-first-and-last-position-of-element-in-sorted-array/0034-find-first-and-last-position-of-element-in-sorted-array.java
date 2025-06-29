class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int[] answer = {-1, -1};

        while(left <= right){
            if(nums[left] == target && nums[right] == target){
                answer[0] = left;
                answer[1] = right;
                break;
            }
            if(nums[left] < target) left++;
            if(nums[right] > target) right--;
        }

          return answer;
    }
}