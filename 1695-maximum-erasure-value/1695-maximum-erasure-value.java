class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        int sum = 0;
        
        while(right < nums.length) {
            int num = nums[right++];
            sum += num;

            map.put(num, map.getOrDefault(num, 0) + 1);

            while(map.get(num) > 1) {
                int temp = nums[left++];
                sum -= temp;
                map.put(temp, map.get(temp) - 1);
            }

            max = Math.max(max, sum);
        }

        return max;     
    }
}