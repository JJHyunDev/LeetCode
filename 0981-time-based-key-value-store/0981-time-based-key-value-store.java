class TimeMap {
    Map<String, List<Node>> map;

    class Node {
        int t;
        String emotion;

        public Node(String value, int timestamp) {
            this.t = timestamp;
            this.emotion = value;
        }
    }

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)) {
            List<Node> list = map.get(key);
            list.add(new Node(value, timestamp));
            map.put(key, list);
        } else {
            List<Node> list = new ArrayList<>();
            list.add(new Node(value, timestamp));
            map.put(key, list);
        }
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) {
            return "";
        }

        List<Node> list = map.get(key);
        return binarySearch(list, timestamp);
    }

    public String binarySearch(List<Node> list, int timestamp) {
        int left = 0;
        int right = list.size() - 1;
        String res = "";

        while(left <= right) {
            int mid = left + (right - left) / 2;

            if(list.get(mid).t <= timestamp) {
                res = list.get(mid).emotion;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return res;
    }
}
