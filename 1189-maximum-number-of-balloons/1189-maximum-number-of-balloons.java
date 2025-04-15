class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "balloon";
        for(int i = 0; i < s.length(); i++){ // balloon 을 key로 하는 map 초기화
            map.put(s.charAt(i), 0);
        }
        char[] text_arr = text.toCharArray();

        for(char c : text_arr){ // text_arr 를 순회하며 balloon 알파벳에 해당하는 key의 value + 1
            if(map.containsKey(c)){ // text_arr 요소가 balloon 중에 있다면
                map.put(c, map.get(c) + 1); // 해당 key의 value + 1
            }
        }

        map.put('o', map.get('o') / 2); // 'o', 'l' 은 2번 씩 등장해야 하기에 / 2
        map.put('l', map.get('l') / 2);

        int answer = Integer.MAX_VALUE;
        for(int i : map.values()){
            answer = Math.min(answer, i); // 가장 낮은 등장 횟수를 answer에 저장
        }

        return answer;
    }
}