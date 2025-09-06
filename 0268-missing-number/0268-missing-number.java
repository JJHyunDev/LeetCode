class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <= n; i ++) {
            map.put(i, 0);
        }

        for(int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int ans = 0;
        for(int i = 0; i <= n; i++) {
            if(map.get(i) == 0) {
                ans = i;
            }
        }

        return ans;
    }
}