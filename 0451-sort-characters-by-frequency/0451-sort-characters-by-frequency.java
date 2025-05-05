class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){ // map 초기화
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        // Map.Entry로 key-value 쌍을 하나의 객체로
        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet()); 
        Collections.sort(entries, (a, b) -> { // Collections.sort() 커스텀 sort로 내림차순 구현 
        // (Collections.sort()는 내부적으로 TimSort를 사용하며 평균/최악 시간 복잡도가 동일하게 m log m 을 가진다.)
            int compare = b.getValue().compareTo(a.getValue());
            if(compare != 0) return compare;
            return b.getKey().compareTo(a.getKey()); // 비교한 value가 서로 같은 경우 key로 비교한다.
        });

        StringBuilder sb = new StringBuilder(); // StringBuilder에 value 만큼 key를 반복해서 쌓는다.
        for(Map.Entry<Character, Integer> entry : entries){
            char c = entry.getKey();
            int count = entry.getValue();
            sb.append(String.valueOf(c).repeat(count));
        }

        return sb.toString();
    }
}