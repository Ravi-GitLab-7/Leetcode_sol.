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
    //  public ListNode reverseList(ListNode head) {
    //     // by iterative method
    //     ListNode curr = head;
    //     ListNode prev = null;
    //     ListNode next = null;

    //     while(curr != null){
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }
    //  }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        //create node 3
      ListNode a= null,b= null,c=bull,d= null;
      int poss = 1;
      ListNode temp = head;
      if(poss == left-1) temp =a;
      if(poss == left) temp =b;
      if(poss == right) temp =c;
      if(poss == right+1) temp =d;
    temp = temp.next;
    poss++;
    //now split the list
    if(a!= null) a.next = null;
    if(c!= null) c.next = null;
    //reverse
    reverseList(b);
    //now link
    if(a!= null) a.next = c;
    b.next = d;
    if(a==null) return c;
    return head;
    }
}