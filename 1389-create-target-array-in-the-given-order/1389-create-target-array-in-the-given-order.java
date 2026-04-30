class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int idx = index[i];
            target.add(idx, num);
        }

        return target.stream().mapToInt(i -> i).toArray();
    }
}