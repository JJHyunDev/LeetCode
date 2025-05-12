class SmallestInfiniteSet {

    private PriorityQueue<Integer> heap; // 가장 작은 정수가 필요하기에 오름차순
    private Set<Integer> set;
    private int current;
    public SmallestInfiniteSet() {
        this.heap = new PriorityQueue<>();
        this.set = new HashSet<>();
        this.current = 1;
    }
    
    public int popSmallest() { 
        if(!heap.isEmpty()){ // addBack 이 일어나면 heap 에 가장 낮은 숫자가 저장되어 있기에 remove + return
            int min = heap.remove();
            set.remove(min);
            return min;
        }
        return current++; // addBack 이 일어나지 않으면 current 를 계속 증가시키며 return 
    }
    
    public void addBack(int num) { // 양의 정수 num이 집합에 없는 경우 다시 추가
        if(num < current && !set.contains(num)){ // num 이 current 보다 낮아야 하는 이유는 current 보다 크거나 같다면 아직 pop 되지 않았기 때문
            heap.add(num);
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */