class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);

        int ans = 0;
        for(int i = 0; i < seats.length; i++) {
            int temp = seats[i] - students[i];
            ans += Math.abs(temp);
        }

        return ans;
    }
}