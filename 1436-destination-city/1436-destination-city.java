class Solution {
    public String destCity(List<List<String>> paths) {
        HashMap<String, String> map = new HashMap<>();

        for(int i = 0; i < paths.size(); i++){
            List<String> list = paths.get(i);
            map.put(list.get(0), list.get(1));
        }

        String ans = new String();
        for(String key : map.keySet()){
            if(!map.containsKey(map.get(key))){
                ans = map.get(key);
                break;
            }
        }

        return ans;
    }
}