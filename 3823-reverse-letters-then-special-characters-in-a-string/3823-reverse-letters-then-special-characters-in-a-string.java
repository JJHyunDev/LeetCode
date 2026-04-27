class Solution {
    public String reverseByType(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;

        StringBuilder sb = new StringBuilder();

        int letter = n - 1;
        int special = n - 1;
        for(int i = 0; i < n; i++) {
            if(Character.isLowerCase(arr[i])) {
                while(!Character.isLowerCase(arr[letter])) {
                    letter--;
                }

                sb.append(arr[letter--]);
            } else {
                while(Character.isLowerCase(arr[special])) {
                    special--;
                }

                sb.append(arr[special--]);
            }
        }

        return sb.toString();
    }
}