class Solution {
    public List<Integer> intersection(int[][] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i[] : nums) {
            for(int j : i){
                map.put(j, map.getOrDefault(j, 0) + 1);
            }
        }

        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        for(int i : map.keySet()) {
            if(map.get(i) == n) {
                ans.add(i);
            }
        }

        return ans;
    }
}