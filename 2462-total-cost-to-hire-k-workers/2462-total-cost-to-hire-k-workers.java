class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        int left = 0;
        int right = costs.length - 1;
        PriorityQueue<Integer> heap1 = new PriorityQueue<>(); // 왼쪽
        PriorityQueue<Integer> heap2 = new PriorityQueue<>(); // 오른쪽

        long ans = 0;
        while (k > 0) { // k 명 근로자를 뽑기 위해 k 번 반복
            k--;
            while (heap1.size() < candidates && left <= right) { // left와 right가 겹치지 않고, heap 사이즈가 candidates를 넘기 않을때까지 인덱스 0부터 offer
                heap1.offer(costs[left++]);
            }
            while (heap2.size() < candidates && left <= right) { // " " " 마지막 인덱스부터 offer
                heap2.offer(costs[right--]);
            }

            int temp1 = heap1.size() > 0 ? heap1.peek() : Integer.MAX_VALUE; 
            int temp2 = heap2.size() > 0 ? heap2.peek() : Integer.MAX_VALUE;

            if (temp1 <= temp2) { // 각 heap 최소 값 비교 후 ans 에 누적합
                ans += temp1;
                heap1.poll();
            } else {
                ans += temp2;
                heap2.poll();
            }
        }
        return ans;
    }
}