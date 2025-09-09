class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(String s : strs) {
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String temp = String.valueOf(arr);

            if(map.containsKey(temp)) {
                map.get(temp).add(s);
            } else {
                map.put(temp, new ArrayList<String>());
                map.get(temp).add(s);
            }
        }

        for(String s : map.keySet()) { 
            ans.add(map.get(s));
        }

        return ans;
    }
}