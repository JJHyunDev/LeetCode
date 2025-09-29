class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        int left = 0;
        int right = costs.length - 1;

        long ans = 0;
        while(k > 0) {
            k--;
            while(pq1.size() < candidates && left <= right) {
                pq1.add(costs[left++]);
            }
            while(pq2.size() < candidates && left <= right) {
                pq2.add(costs[right--]);
            }

            int temp1 = pq1.size() > 0 ? pq1.peek() : Integer.MAX_VALUE;
            int temp2 = pq2.size() > 0 ? pq2.peek() : Integer.MAX_VALUE;

            if(temp1 <= temp2) {
                ans += temp1;
                pq1.poll();
            } else {
                ans += temp2;
                pq2.poll();
            }
        }

        return ans;
    }
}