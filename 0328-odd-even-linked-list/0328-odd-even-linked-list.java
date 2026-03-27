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
    public ListNode oddEvenList(ListNode head) {
        //edge case
        if(head == null || head.next == null){
            return head;
        }
        // made three pointer
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        // now traverse and rearrage 
        while(even != null && even.next != null){
            odd.next = even.next;            // link odd to even
            odd = odd.next;

            even.next = odd.next;
            even = even.next;        // link even to odd
        }
        // attach in odd to even
        odd.next = evenHead;

        return head;
    }
}