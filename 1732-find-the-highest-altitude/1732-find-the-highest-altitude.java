class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];

        arr[0] = 0;
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i-1] + gain[i-1];
        }

        int answer = 0;
        for(int i : arr){
            answer = Math.max(answer, i);
        }

        return answer;
    }
}