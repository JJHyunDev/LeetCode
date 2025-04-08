class Solution {
    public int pivotIndex(int[] nums) {
        int answer = -1;
        int[] arr = new int[nums.length];
        arr[0] = nums[0];

        for(int i = 1; i < nums.length; i++){
            arr[i] = arr[i-1] + nums[i];
        }
        
        for(int i = 0; i < arr.length; i++){
            int left = arr[i] - nums[i];
            int right = arr[arr.length-1] - arr[i];
            if(left == right){
                answer = i;
                break;
            }
        }
        return answer;
    }
}