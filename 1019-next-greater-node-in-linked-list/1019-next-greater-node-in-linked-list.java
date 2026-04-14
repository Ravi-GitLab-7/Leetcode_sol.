import java.util.*;

class Solution {
    public int[] nextLargerNodes(ListNode head) {
        
        //  Step 1: Convert Linked List to Array
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        int n = list.size();
        int[] res = new int[n];

        //  Step 2: Monotonic Decreasing Stack
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= list.get(i)) {
                st.pop();
            }

            if (st.isEmpty()) res[i] = 0;
            else res[i] = st.peek();

            st.push(list.get(i));
        }

        return res;
    }
}