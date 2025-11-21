class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        Queue<Integer> pq = new PriorityQueue<>();

        for(int n : nums) {
            pq.offer(n);
        }

        while(k-- > 0) {
            int min = pq.remove();
            int num = 0;
            int idx = 0;
            for(int i = 0; i < nums.length; i++) {
                if(min == nums[i]) {
                    num = nums[i];
                    idx = i;
                    break;
                }
            }
            num *= multiplier;
            nums[idx] = num;
            pq.offer(num);
        }
    
        return nums;
    }
}