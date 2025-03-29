class Solution {
    public int[] getAverages(int[] nums, int k) {
        int left = 0;
        int n = nums.length;
        int size = (2 * k) + 1;
        int[] avg = new int[n];
        Arrays.fill(avg, -1);
        if(n < size){
            return avg;
        }

        long sum = 0;
        for(int right = 0; right < n; right++){
            sum += nums[right];

            if(right - left + 1 > size ){
                sum -= nums[left];
                left++;
            }

            if(right - left + 1 == size){
                avg[k++] = (int)(sum / (right - left + 1));
            }
        }
        return avg;
    }
}