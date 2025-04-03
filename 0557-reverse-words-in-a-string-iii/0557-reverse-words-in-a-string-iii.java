class Solution {
    public String reverseWords(String s) {
        String answer = "";
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length; i++){
            if(i>0){
                sb.append(" ");
            }
            int right = str[i].length()-1;
            while(right>=0){
                sb.append(str[i].charAt(right));
                right--;
            }
            answer += sb.toString();
            sb.setLength(0);
        }
        return answer;
    }
}