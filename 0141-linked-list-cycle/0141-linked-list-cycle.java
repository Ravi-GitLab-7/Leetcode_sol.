/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && fast.next.next != null && fast.next.next.next != null) {

            slow = slow.next; // move 1 step
            fast = fast.next.next.next; // move 3 steps

            if (slow == fast) {
                return true; // cycle detected
            }
        }

        return false; // no cycle
    }
}