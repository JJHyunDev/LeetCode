class Solution {
    public boolean isPalindrome(String s) {
                s = s.toLowerCase();
    
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }

        String str = sb.toString();
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            if(arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}