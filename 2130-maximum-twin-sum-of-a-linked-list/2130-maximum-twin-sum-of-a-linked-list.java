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
    ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        return prev;
    }
    public int pairSum(ListNode head) {
        // find middle 
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //reverse secondHalf
        ListNode secondHalf = reverseList(slow);
        //find maxSum
        ListNode firstHalf = head;
        int maxSum = 0;

        while(secondHalf != null){
            int sum = firstHalf.val + secondHalf.val;
            maxSum = Math.max(maxSum,sum);
             firstHalf =firstHalf.next;
        secondHalf =secondHalf.next;
        }
           return maxSum;
    }
}