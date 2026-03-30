class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        int carry = 0;

        while(l1 != null || l2 != null){   // same as your loop

            int val1 = 0, val2 = 0;

            if(l1 != null) val1 = l1.val; 
            if(l2 != null) val2 = l2.val;   

            int num = val1 + val2 + carry;

            ListNode node = new ListNode(num % 10);  
            temp.next = node;
            temp = temp.next;

            if(num > 9) carry = 1;   // same logic
            else carry = 0;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry == 1){   // kept your carry block
            ListNode node = new ListNode(1);
            temp.next = node;
            temp = temp.next;
        }

        return dummy.next;
    }
}