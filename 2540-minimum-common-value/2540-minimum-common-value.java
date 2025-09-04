class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int answer = -1;

        while(true) {
            if(nums1.length == i || nums2.length == j) {
                break;
            }
            if(nums1[i] == nums2[j]) {
                answer = nums1[i];
                break;
            } else if(nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        return answer;
    }
}