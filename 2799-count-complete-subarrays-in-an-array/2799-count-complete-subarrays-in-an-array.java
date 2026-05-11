class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;

        Set<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int totalDistinct = set.size();

        int count = 0;
        int left = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int right = 0; right < n; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            while(map.size() == totalDistinct) {
                count += (n - right);

                int leftNum = nums[left];
                map.put(leftNum, map.get(leftNum) - 1);
                if(map.get(leftNum) == 0) {
                    map.remove(leftNum);
                }
                left++;
            }
        }

        return count;
    }
}