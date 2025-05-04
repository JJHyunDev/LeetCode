class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i : arr){   // arr 를 돌면서 해당 요소 등장 횟수를 map 에 초기화
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>(map.values());

        return map.size() == set.size();
    }
}