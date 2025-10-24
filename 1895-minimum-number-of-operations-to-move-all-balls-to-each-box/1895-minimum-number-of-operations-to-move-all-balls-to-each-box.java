class Solution {
    public int[] minOperations(String boxes) {
        char[] arr = boxes.toCharArray();

        int[] ans = new int[arr.length];
        for(int i = 0; i < ans.length; i++) {
            int temp = 0;
            for(int j = 0; j < arr.length; j++) {
                if(arr[j] == '1') {
                    temp += Math.abs(i - j);
                }
            }
            ans[i] = temp;
        }

        return ans;
    }
}