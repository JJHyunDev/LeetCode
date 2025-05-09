class Solution {
    public int minStoneSum(int[] piles, int k) {
        Queue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);

        int ans = 0;
        for(int pile : piles){
            heap.add(pile);
            ans += pile;
        }
        
        while(k > 0){
            int pile = heap.poll();
            heap.add(pile - (pile/2));
            ans -= (pile/2);
            k--; 
        }

        return ans;
    }
}