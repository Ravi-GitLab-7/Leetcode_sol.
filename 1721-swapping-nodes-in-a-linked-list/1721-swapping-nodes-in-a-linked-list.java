class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode temp = head;

        //MOve first and temp k steps
        for(int i = 1;i<k;i++){
            first = first.next;
        }
        temp = first;
        //fidn kth node from end
        while(temp.next != null){
            second = second.next;
            temp = temp.next;
        }
        // now swapping the values
        int swap = first.val;
        first.val = second.val;
        second.val = swap;

        return head;
    }
}