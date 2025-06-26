class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right){
            int len = right - left;
            int min = Math.min(height[left], height[right]);
            int area = len * min;
            max = Math.max(max, area);
            if(height[left] < height[right]){
                left++;
            }else {
                right--;
            }
        }

        return max;
    }
}