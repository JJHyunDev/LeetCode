class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) ->
            (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1])
        );

        for(int[] i : points){
            heap.add(i);
            if(heap.size() > k){
                heap.remove();
            }
        }

        int[][] ans = new int[k][2];
        int idx = 0;
        while(!heap.isEmpty()){
            ans[idx++] = heap.remove();
        }

        return ans;
    }
}