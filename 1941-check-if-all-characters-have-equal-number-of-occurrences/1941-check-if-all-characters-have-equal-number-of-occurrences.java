class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        char arr[] = s.toCharArray();

        if(arr.length == 1) {
            return true;
        }

        for(char c : arr)  {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int temp = map.get(arr[0]);
        for(char c : map.keySet()) {            
            if(map.get(c) != temp) {
                return false;
            }
        }

        return true;
    }
}