class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int answer = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length - 2; i++){
                if(i > 0 && nums[i] == nums[i-1]) continue;
                
                int left = i + 1;
                int right = nums.length - 1;
                
                while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                int temp = Math.abs(target - sum);
                int curr = Math.abs(target - answer);

                if(temp == 0) {
                    return sum;
                } else if(curr > temp) {
                    answer = sum;
                }
                
                if(target - sum > 0){
                    left++;
                } else if(target - sum < 0) {
                    right--;
                }
            }
        }

        return answer;        
    }
}