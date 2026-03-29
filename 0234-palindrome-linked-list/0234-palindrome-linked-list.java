class Solution {

    public ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
           ListNode next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next; 
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        // Step 1: find middle
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: reverse second half
        ListNode j = reverseList(slow);

        // Step 3: compare both halves
        ListNode i = head;

        while(j != null){
            if(i.val != j.val) return false;
            i = i.next;
            j = j.next;
        }

        return true;
    }
}