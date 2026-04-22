class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int index = 0;

        for(int x : nums) {
            if(x < pivot) {
                ans[index++] = x;
            }
        }

        for(int x : nums) {
            if(x == pivot) {
                ans[index++] = x;
            }
        }

        for(int x : nums) {
            if(x > pivot) {
                ans[index++] = x;
            }
        }

        return ans;
        
    }
}