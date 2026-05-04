class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for(String word : words) {
            int currentWeightSum = 0;

            for(char c : word.toCharArray()) {
                currentWeightSum += weights[c - 'a'];
            }

            int modValue = currentWeightSum % 26;

            char mappedChar = (char) ('z' - modValue);

            sb.append(mappedChar);
        }

        return sb.toString();
    }
}