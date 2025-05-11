class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();

        for(String s : words){ // words 돌면서 map 초기화
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        PriorityQueue<HashMap.Entry<String, Integer>> heap = new PriorityQueue<>((a, b) ->
            {
                if(b.getValue() -a.getValue() != 0){
                    return b.getValue() -a.getValue();
                }
                return a.getKey().compareTo(b.getKey());
    });

        for(HashMap.Entry<String, Integer> entry : map.entrySet()){
            heap.add(entry);
        }

        List<String> ans = new ArrayList<>();
        while(k > 0){
            String s = heap.remove().getKey();
            ans.add(s);
            k--;
        }
    
        return ans;
    }
}