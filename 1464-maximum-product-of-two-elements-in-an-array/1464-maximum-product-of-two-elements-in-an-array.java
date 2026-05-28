class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : nums) {
            queue.offer(num);
        }

        int a = queue.remove() - 1;
        int b = queue.remove() - 1;

        return a * b;
    }
}