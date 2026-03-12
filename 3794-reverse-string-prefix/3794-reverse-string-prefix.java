class Solution {
    public String reversePrefix(String s, int k) {
        String prefix = s.substring(0, k);
        String postfix = s.substring(k);
        String temp = "";
        String[] arr = prefix.split("");

        for(int i = k - 1; i >= 0; i--) {
            temp += arr[i];
        }

        return temp + postfix;
    }
}