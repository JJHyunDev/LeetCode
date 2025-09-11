class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int ans = 0;
        for(int key : map.keySet()) {
            int num = map.get(key);
            if(num == 1) {
                ans += key;
            }
        }

        return ans;
    }
}