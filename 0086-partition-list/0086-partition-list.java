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
    public ListNode partition(ListNode head, int x) {
        // Create two dummy lists
        ListNode smallDummy = new ListNode(0);
        ListNode largeDummy = new ListNode(0);

        // Pointers
        ListNode small = smallDummy;
        ListNode large = largeDummy;

        // Traverse the list
        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }

        // End the large list (VERY IMPORTANT)
        large.next = null;

        // Connect both lists
        small.next = largeDummy.next;

        // Return result
        return smallDummy.next;
    }
}