class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();

        for(int num : nums) {
            if(num < pivot) {
                ans.add(num);
            }
        } 

        for(int num : nums) {
            if(num == pivot) {
                ans.add(num);
            }
        }

        for(int num : nums) {
            if(num > pivot) {
                ans.add(num);
            }
        }

        return ans.stream().mapToInt(i -> i).toArray();
    }
}