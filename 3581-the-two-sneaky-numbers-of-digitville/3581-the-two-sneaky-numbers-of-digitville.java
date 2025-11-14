class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        Set<Integer> set = new HashSet<>();

        int idx = 0;
        for(int i : nums) {
            if(set.contains(i)) {
                ans[idx] = i;
                idx++;
            }
            set.add(i);
        }

        return ans;
    }
}