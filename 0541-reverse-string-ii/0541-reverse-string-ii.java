class Solution {
    public String reverseStr(String s, int k) {
        String[] arr = s.split("");
        for(int i = 0; i < s.length(); i += 2 * k){
            int start = i;
            int end = Math.min(i + k -1, arr.length-1);
            while(start<end){
                String temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        return String.join("", arr);
    }
}