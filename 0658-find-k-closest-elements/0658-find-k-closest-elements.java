class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(
            (n1, n2) -> {
                if(Math.abs(n1 - x) == Math.abs(n2 - x)){
                return n2 - n1;
            }
            return Math.abs(n2 - x) - Math.abs(n1 - x);
    });

        for(int i : arr){
           heap.add(i);
           if(heap.size() > k){
            heap.remove();
           }
        }

        List<Integer> ans = new ArrayList<>();
        while(k > 0){
            ans.add(heap.remove());
            k--;
        }
        Collections.sort(ans);

        return ans;
    }
}