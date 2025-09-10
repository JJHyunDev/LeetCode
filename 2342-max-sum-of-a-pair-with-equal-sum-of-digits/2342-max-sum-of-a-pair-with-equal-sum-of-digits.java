class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for(int num : nums) {
            int sum = 0;
            int temp = num;


            while(temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if(!map.containsKey(sum)) {
                map.put(sum, new ArrayList<>());
            }

            map.get(sum).add(num);
        }

        int max = -1;
        for(int i : map.keySet()) {
            List<Integer> list = map.get(i);
            if(list.size() > 1) {
                Collections.sort(list, Collections.reverseOrder());
                max = Math.max(max, list.get(0) + list.get(1));
            }
        }

        return max;
    }
}