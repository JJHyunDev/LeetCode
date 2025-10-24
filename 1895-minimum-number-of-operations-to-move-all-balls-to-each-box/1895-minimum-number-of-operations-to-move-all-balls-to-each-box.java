class Solution {
    public int[] minOperations(String boxes) {
        char[] arr = boxes.toCharArray();

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '1') {
                set.add(i);
            }
        }

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