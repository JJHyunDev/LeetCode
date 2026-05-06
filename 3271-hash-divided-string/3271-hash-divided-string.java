class Solution {
    public String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toCharArray();

        int cnt = 0;
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            temp += (arr[i] - 'a');
            cnt++;
            if(cnt == k) {
                sb.append((char) (temp % 26 + 'a'));
                cnt = 0;
                temp = 0;
            }
        }

        return sb.toString();
    }
}