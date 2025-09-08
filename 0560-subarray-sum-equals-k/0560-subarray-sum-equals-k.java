class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int curr = 0;
        int ans = 0;

        for(int num : nums) {
            curr += num;
            ans += map.getOrDefault(curr - k, 0);
            map.put(curr, map.getOrDefault(curr, 0) + 1); 
        }

        return ans;
    }
}