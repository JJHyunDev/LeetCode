class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            // arr[left] 가 a-z or A-Z가 아니라면
            if(!((arr[left] >= 'a' && arr[left] <= 'z') || (arr[left] >= 'A' && arr[left] <= 'Z'))){
                left++;
            }
            // arr[right] 가 a-z or A-Z가 아니라면
            else if(!((arr[right] >= 'a' && arr[right] <= 'z') || (arr[right] >= 'A' && arr[right] <= 'Z'))){
                right--;
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } 
        }
        String answer = "";
        for(char c : arr){
            answer += c;
        }
        return answer;
    }
}