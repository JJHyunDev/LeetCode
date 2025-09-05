class Solution {
    public int maxVowels(String s, int k) {
        HashSet set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        // right ++ , right - left + 1 > k -> left++
        // subarray에 편입할 때 해당 알파벳과 편출하는 알파벳을 검사? 아니면 매번 subarray 전체 검사?
        // 편입할 때 검사하는게 쉬울 것 같다.
        char arr[] = s.toCharArray();
        int left = 0;
        int cnt = 0;
        int max = 0;

        for(int right = 0; right < arr.length; right++) {
            int len = right - left + 1;
            
            if(set.contains(arr[right])) {
                cnt++;
            }

            if(len > k) {
                if(set.contains(arr[left])) {
                    cnt--;
                }
                left++;
            }

            max = Math.max(max, cnt);
        }

        return max;
    }
}