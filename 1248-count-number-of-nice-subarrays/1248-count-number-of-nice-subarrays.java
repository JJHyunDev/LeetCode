class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer, Integer> counts = new HashMap<>();
        counts.put(0, 1);

        int ans = 0;
        int temp = 0;

        for(int num : nums) {
            temp += num % 2;
            ans += counts.getOrDefault(temp - k, 0);
            counts.put(temp, counts.getOrDefault(temp, 0) + 1);
        }

        return ans;
    }
}