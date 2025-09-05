class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        // maxCost -= Math.abs(sarr[i] - tarr[i])
        // Math.max(max, len);
        // maxCost < 0 left++; maxCost += Math.abs(sarr[i] - tarr[i]); len--;
        char sarr[] = s.toCharArray();
        char tarr[] = t.toCharArray();
        int left = 0;
        int len = 0;
        int max = 0;

        for(int right = 0; right < sarr.length; right++) {
            maxCost -= Math.abs(sarr[right] - tarr[right]);

            while(maxCost < 0) {
                maxCost += Math.abs(sarr[left] - tarr[left]);
                left++;
            }
            len = right - left + 1;

            if(maxCost >= 0) {
                max = Math.max(max, len);
            }           
        }

        return max;
    }
}