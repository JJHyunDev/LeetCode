class Solution {
    public boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();

        int x = 0;
        int y = 0;
        for(char c : path.toCharArray()) {
            switch(c){
                case 'N': 
                    y++;
                    break;
                case 'S': 
                    y--;
                    break;
                case 'E': 
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
            String str = x + "," + y;
            if(set.contains(str)) {
                return true;
            } 

            set.add(str);
        }

        return false;
    }
}