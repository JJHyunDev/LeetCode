class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;

        Arrays.sort(deck);

        Queue<Integer> indexQueue = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            indexQueue.add(i);
        }

        int[] ans = new int[n];

        for(int card : deck) {
            ans[indexQueue.poll()] = card;

            if(!indexQueue.isEmpty()) {
                indexQueue.add(indexQueue.poll());
            }
        }

        return ans;
    }
}