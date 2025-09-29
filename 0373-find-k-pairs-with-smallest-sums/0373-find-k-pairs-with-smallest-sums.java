class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> answer = new ArrayList<>();
        if(nums1.length == 0 || nums2.length == 0 || k == 0) {
            return answer;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> 
        (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]]));

        for(int j = 0; j < nums2.length; j++) {
            pq.offer(new int[]{0, j});
        }

        while(k-- > 0 && !pq.isEmpty()) {
            int[] arr = pq.poll();
            int i = arr[0];
            int j = arr[1];
            answer.add(Arrays.asList(nums1[i], nums2[j]));

            if(i + 1 < nums1.length) {
                pq.offer(new int[]{i + 1, j});
            }
        }

        return answer;
    }
}