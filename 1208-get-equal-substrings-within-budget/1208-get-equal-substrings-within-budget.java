class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int answer = 0;
        int temp = 0;
        int left = 0;
        for(int right = 0; right < s.length(); right++){
            temp += Math.abs(s.charAt(right) - t.charAt(right));
            while(temp > maxCost){
                temp -= Math.abs(s.charAt(left) - t.charAt(left));
                left++;
            }
            answer = Math.max(answer, right - left + 1);
        }

        return answer;
    }
}