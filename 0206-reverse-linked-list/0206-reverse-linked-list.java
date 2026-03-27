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
    public ListNode reverseList(ListNode head) {
        // // by iterative method
        // ListNode curr = head;
        // ListNode prev = null;
        // ListNode next = null;

        // while(curr != null){
        //     next = curr.next;
        //     curr.next = prev;
        //     prev = curr;
        //     curr = next;
        // }
        // return prev;

        // by cursive method
        if(head == null || head.next == null){
            return head;
        }
        ListNode a = head.next;
        ListNode newHead =  reverseList(a);
        a.next = head;
        head.next = null;
        return newHead;
    }
}