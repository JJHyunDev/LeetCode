class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) ->
            (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
        );

        for(int[] i : points) {
            pq.add(i);
            if(pq.size() > k) {
                pq.remove();
            }
        }

        int[][] ans = new int[k][2];
        int idx = 0;
        while(!pq.isEmpty()) {
            ans[idx++] = pq.remove();
        }

        return ans;
    }
}