class Solution {
    public boolean checkIfPangram(String sentence) {
        String[] arr = sentence.split("");
        HashSet<String> set = new HashSet<>();

        for(String s : arr){
            set.add(s);
        }

        return (set.size()==26);
    }
}