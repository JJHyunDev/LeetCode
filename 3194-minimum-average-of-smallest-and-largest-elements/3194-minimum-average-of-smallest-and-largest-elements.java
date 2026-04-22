class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int iter = nums.length / 2;
        double[] avgs = new double[iter];

        int minIdx = 0;
        int maxIdx = nums.length - 1;
        int idx = 0;
        while(minIdx < maxIdx) {
            avgs[idx++] = (double) (nums[minIdx++] + nums[maxIdx--]) / 2;
        }

        Arrays.sort(avgs);

        return avgs[0];
    }
}