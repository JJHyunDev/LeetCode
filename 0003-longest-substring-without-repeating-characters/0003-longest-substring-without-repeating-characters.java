class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            if(map.containsKey(c) && map.get(c) >= left){// 기존에 c가 있다면 
                left = map.get(c) + 1;
            }

            map.put(c, right); //c의 value 최신화
            max = Math.max(max, right - left + 1); // 최대 길이 갱신
        }
    
        return max;
    
    }
}