class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // edge case
        if (head == null || head.next == null) {
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // delete middle node
        prev.next = slow.next;
        return head;
    }
}
