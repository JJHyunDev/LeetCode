class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] arr = new int[friends.length];

        Set<Integer> set = new HashSet<>();
        for(int key : friends) {
            set.add(key);
        }

        int idx = 0;
        for(int i = 0; i < order.length; i++) {
            int n = order[i];
            if(set.contains(n)) {
                arr[idx++] = n;
            }
        }

        return arr;
    }
}