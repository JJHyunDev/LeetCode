class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int ans = 0;
        int temp = 0;
        
        for(int num : nums) {
            temp += num;
            ans += map.getOrDefault(temp - k, 0);
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }
        return ans;
    }
}