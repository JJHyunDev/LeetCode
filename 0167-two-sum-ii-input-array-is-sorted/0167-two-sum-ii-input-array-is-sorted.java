class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
         int answer[] = new int[2];

        while(left < right) {
            int temp = numbers[left] + numbers[right];
            if(temp == target) {
                answer[0] = left + 1;
                answer[1] = right + 1;
                break;
            } else if(temp < target) {
                left++;
            } else {
                right--;
            }
        }

        return answer;
    }
}