class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> heap = new PriorityQueue<>(Comparator.reverseOrder());

        double sum = 0;
        for(int i : nums){
            heap.add((double)i);
            sum += i;
        }

        int cnt = 0;
        double target = sum / 2;
        while(sum > target){
            cnt++;
            double temp = (heap.remove() / 2);
            heap.add(temp);
            sum -= temp;
        }
    
        return cnt;
    }
}