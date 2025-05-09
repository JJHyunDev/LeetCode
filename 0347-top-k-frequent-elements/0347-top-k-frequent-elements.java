class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int i : map.keySet()){
            heap.add(i);
            if(heap.size() > k){
                heap.remove();
            }
        }

        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = heap.remove();
        }

        return ans;
    }
}