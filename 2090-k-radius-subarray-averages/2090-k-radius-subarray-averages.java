class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int size = 2 * k + 1;
        int ans[] = new int[n];
        Arrays.fill(ans, -1);
        if(n < size) {
            return ans;
        }

        long sum = 0;
        int left = 0;
        for(int right = 0; right < n; right++) {
            sum += nums[right];

            if(right - left + 1 > size) {
                sum -= nums[left];
                left++;
            }

            if(right - left + 1 == size) {
                ans[k++] = (int) (sum / (right - left + 1));
            }
        }
        
        return ans;
    }
}