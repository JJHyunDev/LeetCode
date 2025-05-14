class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] arr = new int[26];
        for(char c : s.toCharArray()){ // 문자열 s 각 알파벳 등장 횟수 초기화
            arr[c - 'a']++; // a 라면 인덱스 0, b라면 인덱스 1을 가르킨다.
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < 26; i++){
            if(arr[i] > 0){ // 알파벳이 등장 한다면
                heap.add(i); // 해당 알파벳 인덱스를 heap에 저장
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!heap.isEmpty()){
            int temp = heap.poll(); // 현재 가장 큰 알파벳
            int cnt = Math.min(arr[temp], repeatLimit); // 반복 횟수

            for(int i = 0; i < cnt; i++){ // 반복 횟수만큼
                sb.append((char) (temp + 'a')); // 알파벳을 붙인다.
            }
            arr[temp] -= cnt; // 반복 횟수만큼 arr에서 해당 알파벳 등장 횟수를 빼준다.

            if(arr[temp] > 0){ // 현재 가장 큰 알파벳의 등장 횟수가 남았을 때
                if(heap.isEmpty()) break; // repeatLimit을 끊어줄 요소가 heap에 더 이상 없다면 break;

                int next = heap.poll(); // 있다면 poll해서
                sb.append((char) (next + 'a')); // temp의 repeatLimit을 끊어준다.
                arr[next]--; 

                if(arr[next] > 0){ // 두 번째로 큰 요소가 남아있다면
                    heap.add(next); // 다시 heap에 넣어주고
                }
                heap.add(temp); // arr[temp] > 0 이므로 temp도 heap에 넣어준다.
            }
        }

        return sb.toString();
    }
}