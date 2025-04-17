class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] arr = s.toCharArray(); // 문자열 s를 정렬하는 과정
            Arrays.sort(arr); 

            String temp = new String(arr);
            if(map.containsKey(temp)){
                map.get(temp).add(s);
            }else{
                map.put(temp, new ArrayList<>());
                map.get(temp).add(s);
            }
        }

        List<List<String>> answer = new ArrayList<>();
        for(String s : map.keySet()){
            answer.add(map.get(s));
        }

        return answer;
    }
}