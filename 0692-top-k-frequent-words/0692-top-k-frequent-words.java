class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> {
            if(b.getValue() - a.getValue() != 0) {
                return b.getValue() - a.getValue();
            }
            return a.getKey().compareTo(b.getKey());
        });

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            pq.add(entry);
        }

        List<String> answer = new ArrayList<>();
        for(int i = 0; i < k; i++) {
            answer.add(pq.remove().getKey());
        }

        return answer;
    }
}