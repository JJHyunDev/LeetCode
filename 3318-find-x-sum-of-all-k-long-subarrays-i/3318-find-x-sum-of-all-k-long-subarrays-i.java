class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        int[] answer = new int[n - k + 1];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            if(i >= k) {
                int outNum = nums[i - k];
                if(map.get(outNum) == 1) {
                    map.remove(outNum);
                } else {
                    map.put(outNum, map.get(outNum) - 1);
                }
            }

            if(i >= k - 1) {
                answer[i - k + 1] = calculateSum(map, x);
            }
        }

        return answer;
    }

    private int calculateSum(Map<Integer, Integer> map, int x) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if(a[1] != b[1]) return b[1] - a[1];
            return b[0]  - a[0];
        });

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pq.offer(new int[]{entry.getKey(), entry.getValue()});
        }

        int sum = 0;
        for(int i = 0; i < x && !pq.isEmpty(); i++) {
            int[] top = pq.poll();
            sum += top[0] * top[1];
        }

        return sum;
    }
}