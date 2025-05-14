// class Solution {
//     public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//         PriorityQueue<int[]> heap = new PriorityQueue<>((a,b) -> 
//         {
//             return (a[0] + a[1]) - (b[0] + b[1]);
//         });

//         List<List<Integer>> answer = new ArrayList<>();

//         for(int i : nums2){
//             heap.offer(new int[] {nums1[0], i});
//         }

//         while(k > 0 && !heap.isEmpty()){
//             k--;
//             List<Integer> list = new ArrayList<>();
//             int[] arr = heap.poll();
//             list.add(arr[0]);
//             list.add(arr[1]);

//             if(idx + 1 < nums1.length){
//                 idx++;
//                 heap.offer(new int[] {nums1[idx], arr[1]});
//             }

//             answer.add(list);
//         }
        
//         return answer;
//     }
// }

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) {
            return result;
        }
        
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> 
            (nums1[a[0]] + nums2[a[1]]) - (nums1[b[0]] + nums2[b[1]]));
        
        for (int j = 0; j < nums2.length; j++) {
            heap.offer(new int[]{0, j});
        }
        
        while (k-- > 0 && !heap.isEmpty()) {
            int[] indices = heap.poll();
            int i = indices[0];
            int j = indices[1];
            result.add(Arrays.asList(nums1[i], nums2[j]));
            
            if (i + 1 < nums1.length) {
                heap.offer(new int[]{i + 1, j});
            }
        }
        
        return result;
    }
}
