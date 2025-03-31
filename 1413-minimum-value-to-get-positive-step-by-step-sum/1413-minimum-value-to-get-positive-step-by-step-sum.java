class Solution {
    public int minStartValue(int[] nums) {
        int startValue = 1;

        while(true){
            int temp = startValue;
            for(int i = 0; i < nums.length; i++){
                temp += nums[i];
                if(temp < 1){
                    break;
                }
                if(i == nums.length-1){
                    return startValue;
                }
            }
            startValue++;
        }
    }
}