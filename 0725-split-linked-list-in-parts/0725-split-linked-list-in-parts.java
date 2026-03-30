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
    ListNode lengthOfList(ListNode head){
        int n = 0;
        ListNode temp = head;
        while(temp!= null){
            temp = temp.next;
            n++;
        }
        return n;
    }
   public ListNode[] splitListToParts(ListNode head, int k) {
    int n = lengthOfList(head);

    int size = n / k;       // base size of each part
    int extra = n % k;      // extra nodes to distribute

    ListNode[] result = new ListNode[k];
    ListNode current = head;

    for (int i = 0; i < k; i++) {
        if (current == null) {
            result[i] = null;
            continue;
        }

        result[i] = current;

        int currentPartSize = size + (extra > 0 ? 1 : 0);
        extra--;

        // move to the last node of this part
        for (int j = 1; j < currentPartSize; j++) {
            current = current.next;
        }

        // break the list
        ListNode nextPart = current.next;
        current.next = null;
        current = nextPart;
    }

    return result;
}