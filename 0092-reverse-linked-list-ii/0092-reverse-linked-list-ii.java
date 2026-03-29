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
        // by iterative method
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
     }
       public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode a = null, b = null, c = null, d = null;
        int poss = 1;
        ListNode temp = head;
        // traverse properly
        while(temp != null){
            if(poss == left - 1) a = temp;
            if(poss == left) b = temp;
            if(poss == right) c = temp;
            if(poss == right + 1) d = temp;

            temp = temp.next;
            poss++;
        }

        // split
        if(a != null) a.next = null;
        if(c != null) c.next = null;

        // reverse
        ListNode newHead = reverseList(b);
        //reconnect
        if(a != null) a.next = newHead;
        b.next = d;
        //handle left = 1
        if(a == null) return newHead;
        return head;
    }
}
