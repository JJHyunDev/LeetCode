class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        int letter = arr.length - 1;
        int special = arr.length - 1;

        StringBuilder sb = new StringBuilder();
        for(char c : arr) {
            if(Character.isLetter(c)) {
                while(!Character.isLetter(arr[letter])) {
                    letter--;
                }
                sb.append(arr[letter]);
                letter--;
            } else {
                while(Character.isLetter(arr[special])) {
                    special--;
                }
                sb.append(arr[special]);
                special--;
            }
        }        

        return sb.toString();
    }
}