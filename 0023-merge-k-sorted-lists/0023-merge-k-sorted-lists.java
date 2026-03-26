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

    // Merge two sorted lists
    ListNode mergeTwo(ListNode L1, ListNode L2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (L1 != null && L2 != null) {
            if (L1.val < L2.val) {
                curr.next = L1;
                L1 = L1.next;
            } else {
                curr.next = L2;
                L2 = L2.next;
            }
            curr = curr.next;
        }

        // attach remaining
        curr.next = (L1 != null) ? L1 : L2;

        return dummy.next;
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        return merge(lists, 0, lists.length - 1);
    }

    // Divide and Conquer
    ListNode merge(ListNode[] lists, int left, int right) {
        if (left == right) return lists[left];

        int mid = left + (right - left) / 2;

        ListNode L1 = merge(lists, left, mid);
        ListNode L2 = merge(lists, mid + 1, right);

        return mergeTwo(L1, L2);
    }
}