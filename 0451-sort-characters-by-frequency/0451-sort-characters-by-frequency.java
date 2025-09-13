class Solution {
    public String frequencySort(String s) {
        char arr[] = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, (a, b) -> {
            int compare = b.getValue().compareTo(a.getValue());
            if(compare != 0) return compare;
            return b.getKey().compareTo(a.getKey());
        });

        for(Map.Entry<Character, Integer> entry : entries) {
            char c = entry.getKey();
            int cnt = entry.getValue();
            sb.append(String.valueOf(c).repeat(cnt));
        }

        return sb.toString();
    }
}