class Solution {
    // Function to calculate length of linked list
    int lengthOfList(ListNode head) {
        int n = 0;
        ListNode temp = head;
        // Traverse entire list and count nodes
        while (temp != null) {
            temp = temp.next;
            n++;
        }
        return n; // total number of nodes
    }

    public ListNode[] splitListToParts(ListNode head, int k) {
        int n = lengthOfList(head); // total nodes
        int size = n / k;  // minimum nodes in each part
        int extra = n % k; // extra nodes to distribute
        ListNode[] arr = new ListNode[k]; // result array
        int idx = 0; // index for array
        ListNode temp = head;
        int len = 1; // current part length counter
        // Traverse the list
        while (temp != null) {
            int s = size; // base size of current part
            // If extra nodes are left, increase size by 1
            if (extra > 0) s++;
            // If starting of a new part, store its head
            if (len == 1) arr[idx++] = temp;
            // If current part reached required size
            if (len == s) {
                ListNode a = temp.next; // store next node
                temp.next = null; // break the list (end current part)
                temp = a; // move to next part
                len = 1; // reset length for next part
                extra--; // reduce extra nodes
            } 
            else {
                // continue traversing current part
                len++;
                temp = temp.next;
            }
        }
        return arr; // return k parts
    }
}