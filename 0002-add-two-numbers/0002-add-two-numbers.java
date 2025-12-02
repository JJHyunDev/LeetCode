/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 결과 리스트의 시작을 쉽게 하기 위한 더미 노드 생성
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        // l1이 남았거나, l2가 남았거나, 마지막 올림수가 남아있는 경우 계속 반복
        while (l1 != null || l2 != null || carry > 0) {
            // 리스트가 끝났으면 0으로 처리
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            // 두 수의 합 + 이전 올림수
            int sum = x + y + carry;

            // 새로운 올림수 계산 (10 이상이면 1, 아니면 0)
            carry = sum / 10;

            // 현재 자릿수 (1의 자리) 노드 생성 및 연결
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            // 포인터 이동
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // 더미 노드의 다음 노드(실제 결과의 시작) 반환
        return dummy.next;
    }
}