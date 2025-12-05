class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        boolean ans = false;

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(map.containsKey(num)) {
                int temp = map.get(nums[i]);
                
                ans =  (Math.abs(temp - i) <= k);
                if(ans) {
                    return ans;
                }
            }
            map.put(num, i);
        }

        return ans;
    }
}