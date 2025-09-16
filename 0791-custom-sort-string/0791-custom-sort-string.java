class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < order.length(); i++) {
            char c = order.charAt(i);
            if(!map.containsKey(c)) {
                continue;
            }

            int num = map.get(c);
            for(int j = 0; j < num; j++) {
                sb.append(c);
            }
            map.remove(c);
        }

        for(Character key : map.keySet()) {
            int num = map.get(key);
            for(int j = 0; j < num; j++) {
                sb.append(key);
            }
        }

        return sb.toString();
    }
}