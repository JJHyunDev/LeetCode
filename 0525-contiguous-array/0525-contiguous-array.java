class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxlen = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            count += (nums[i] == 1 ? 1 : -1);

            if(count == 0){
                maxlen = i + 1;
            }
            if(map.containsKey(count)){
                maxlen = Math.max(maxlen, i - map.get(count));
            }else{
                map.put(count, i);
            }
        }

        return maxlen;
    }
}