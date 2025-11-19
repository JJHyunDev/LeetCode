class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] arr = new int[code.length];

        if(k == 0) {
            return arr;
        }

        for(int i = 0; i < code.length; i++) {
            if(k > 0) {
                for(int j = i + 1; j < i + k + 1; j++) {
                    arr[i] += code[j % code.length];
                }
            } else {
                for(int j = i - Math.abs(k); j < i; j++) {
                    arr[i] += code[(j + code.length) % code.length];
                }
            }
        }
        return arr;
    }
}