class Solution {
    public String reverseWords(String s) {
        // split(" ");
        // 문자열 배열을 만들고
        // 각 배열 요소를 reverse한 후 StringBuilder.append 한다.
        String arr[] = s.split(" ");
        String answer = "";

        for(String str : arr) {
            StringBuilder sb = new StringBuilder();

            sb.append(str);
            sb.reverse();

            answer += sb + " ";            
        }

        return answer.trim();
    }
}