class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        HashMap<Character, Integer> map = new HashMap<>();
        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> {
            return b - a;
        });

        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char c : map.keySet()) {
            pq.add(c);
        }

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()) {
            char key = pq.remove();
            int n = map.get(key);
            int temp = Math.min(n, repeatLimit);

            for(int i = 0; i < temp; i++) {
                sb.append(key);
            }

            map.put(key, map.get(key) - temp);

            if(map.get(key) > 0) {
                if(pq.isEmpty()) {
                    break;
                }
                char next = pq.remove();
                sb.append(next);
                map.put(next, map.get(next) - 1);
                if(map.get(next) > 0) {
                    pq.add(next);
                }

                pq.add(key);
            }
        }

        return sb.toString();
    }
}