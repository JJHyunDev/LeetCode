class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> ans = new ArrayList<>();
        int p1 = 0, p2 = 0;
        int n1 = nums1.length, n2 = nums2.length;

        while(p1 < n1 && p2 < n2) {
            int id1 = nums1[p1][0], val1 = nums1[p1][1];
            int id2 = nums2[p2][0], val2 = nums2[p2][1];

            if(id1 == id2) {
                ans.add(new int[]{id1, val1 + val2});
                p1++;
                p2++;
            } else if(id1 < id2) {
                ans.add(new int[]{id1, val1});
                p1++;
            } else {
                ans.add(new int[]{id2, val2});
                p2++;
            }
        }

        while(p1 < n1) {
            ans.add(nums1[p1++]);
        }

        while(p2 < n2) {
            ans.add(nums2[p2++]);
        }
        
        return ans.toArray(new int[ans.size()][]);
    }
}