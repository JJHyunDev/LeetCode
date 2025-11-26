class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];
        if(k == 0) {
            return arr;
        }

        for(int i = 0; i < code.length; i++) {
            if(k > 0) {
                int sum = 0;
                for(int j = i + 1; j <= i + k; j++) {
                    sum += code[j % code.length];
                }
                arr[i] = sum;
            }

            if(k < 0) {
                int sum = 0;
                int idx = code.length + i;
                for(int j = idx - Math.abs(k); j < idx; j++) {
                    sum += code[j % code.length];
                }
                arr[i] = sum;
            }
        }

        return arr;
    }
}