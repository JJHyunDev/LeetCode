class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        
        for(int i : piles) {
            pq.add(i);
        }

        while(k > 0) {
            pq.add(pq.peek() - pq.remove() / 2);
            k--;
        }
        
        int ans = 0;
        while(!pq.isEmpty()) {
            ans += pq.remove();
        }
        
        return ans;
    }
}