class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int left = 0; left < n - 2; left++) {
            if(left > 0 && nums[left] == nums[left - 1]) continue;
            int mid = left + 1;
            int right = n - 1;

            while(mid < right) {    
                int temp = nums[left] + nums[mid] + nums[right];

                if(temp == 0) {
                    ans.add(Arrays.asList(nums[left], nums[mid], nums[right]));
                    mid++;
                    right--;
                    while(mid < right && nums[mid] == nums[mid - 1]) mid++;
                    while(mid < right && nums[right] == nums[right + 1]) right--;
                } else if(temp > 0) {
                    right--;
                } else if(temp < 0) {
                    mid++;
                }
            }
        }

        return ans;
    }
}
