class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = 0;
        int left = 0;

        for(int right = 0; right < nums.length; right++) {
            int val = nums[right];
            map.put(val, map.getOrDefault(val, 0) + 1);

            while(map.get(val) > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                left++;
            }

            len = Math.max(len, right - left + 1);
        }

        return len;
    }
}