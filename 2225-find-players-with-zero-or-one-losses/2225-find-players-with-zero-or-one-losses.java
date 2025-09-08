class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, Integer> winneri = new HashMap<>();
        HashMap<Integer, Integer> loseri = new HashMap<>();

        for(int i= 0; i < matches.length; i++) {
            int winner = matches[i][0];
            int loser = matches[i][1];

            winneri.put(winner, winneri.getOrDefault(winner, 0) + 1);
            loseri.put(loser, loseri.getOrDefault(loser, 0) + 1);
        }

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> winTemp = new ArrayList<>();
        for(int i : winneri.keySet()) {
            if(!loseri.containsKey(i)) {
                winTemp.add(i);
            }
        }  
        Collections.sort(winTemp);
        answer.add(winTemp);

        List<Integer> loseTemp = new ArrayList<>();
        for(int i : loseri.keySet()) {
            if(loseri.get(i) == 1) {
                loseTemp.add(i);
            }
        }
        Collections.sort(loseTemp);
        answer.add(loseTemp);

        return answer;
    }
}