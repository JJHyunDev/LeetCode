class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();

        for(int i : nums) {
            set.add(i);
        }

        int ans = 0;
        for(int num : nums) {
            int i = num;
            int j = num + diff;
            int k = j + diff;

            if(set.contains(j) && set.contains(k)) {
                ans++;
            }
        }

        return ans;
    }
}