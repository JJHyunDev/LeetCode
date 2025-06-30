class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int answer = 0;

        while(left <= right){
            int mid = (left + right) / 2;
            answer = mid;
            if(nums[mid] == target) return mid;

            if(left == right && nums[mid] < target){
                answer = mid + 1;
            } else {
                if(mid == 0){
                    answer = 0;
                }
            }

            if(nums[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return answer;    
    }
}