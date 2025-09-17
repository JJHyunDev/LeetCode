class Solution {
    public int halveArray(int[] nums) {
        PriorityQueue<Double> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        double sum = 0;
        for(int i : nums) {
            sum += (double) i;
            pq.add((double) i);
        }

        double temp = sum;
        int cnt = 0;
        while(temp > (sum / 2.0)) {
            double num = pq.remove();
            num /= 2.0;

            temp -= num;
            pq.add(num);
            cnt++;
        }

        return cnt;
    }
}