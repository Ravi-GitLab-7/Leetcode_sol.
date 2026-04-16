class Solution {

    public boolean isPalindrome(ListNode head) {

        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;

        // Push all values into stack
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        // Compare values
        while (head != null) {
            if (stack.pop() != head.val) {
                return false;
            }
            head = head.next;
        }

        return true;
    }
}
   //method 1
    // public boolean isPalindrome(ListNode head) {
    //     if(head == null || head.next == null) return true;
    //      create copy list
    //     ListNode newHead = new ListNode(head.val);
    //     ListNode t1 = head.next;
    //     ListNode t2 = newHead;

    //     while(t1 != null){
    //         ListNode temp = new ListNode(t1.val);
    //         t2.next = temp;
    //         t2 = t2.next;
    //         t1 = t1.next;
    //     }

    //     // reverse copy
    //     newHead = reverseList(newHead);

    //     // compare
    //     t1 = head;
    //     t2 = newHead;

    //     while(t1 != null){
    //         if(t1.val != t2.val) return false;
    //         t1 = t1.next;
    //         t2 = t2.next;
    //     }
    //     return true;
    // }
    //     ListNode curr = head;
    //     ListNode prev = null;
    //     while(curr != null){
    //        ListNode next = curr.next;
    //        curr.next = prev;
    //        prev = curr;
    //        curr = next; 
    //     }
    //     return prev;
    // }

    // public boolean isPalindrome(ListNode head) {
    //     // method 2
    //     if(head == null || head.next == null) return true;

    //     // Step 1: find middle
    //     ListNode slow = head;
    //     ListNode fast = head;

    //     while(fast != null && fast.next != null){
    //         slow = slow.next;
    //         fast = fast.next.next;
    //     }

    //     // Step 2: reverse second half
    //     ListNode j = reverseList(slow);

    //     // Step 3: compare both halves
    //     ListNode i = head;

    //     while(j != null){
    //         if(i.val != j.val) return false;
    //         i = i.next;
    //         j = j.next;
    //     }

    //     return true;
    // }
