class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];
        int start = 0;
        int end = numbers.length-1;

        while(start <= end){
            int sum = numbers[start] + numbers[end];            
            if(sum == target){
                answer[0] = start+1;
                answer[1] = end+1;
                break;
            }else if(sum > target){
                end--;
            }else if(sum < target){
                start++;
            }
        }
        return answer;
    }
}