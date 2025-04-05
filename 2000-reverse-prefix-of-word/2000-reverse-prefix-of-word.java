class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int right = 0;
        int left = 0;
        while (right < arr.length) {
            if (arr[right] == ch) {
                break;
            }
            right++;
        }

        while (right < arr.length && left < right) {
            char temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right--;
            left++;
        }

        return new String(arr);
    }
}