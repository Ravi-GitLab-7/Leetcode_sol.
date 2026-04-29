import java.util.*;

class Solution {
    public void rearrangeQueue(Queue<Integer> q) {

        int n = q.size();
        Stack<Integer> st = new Stack<>();

        // Step 1: Push first half into stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        // Step 2: Add stack back to queue
        while (!st.isEmpty()) {
            q.add(st.pop());
        }

        // Step 3: Move first half to back
        for (int i = 0; i < n / 2; i++) {
            q.add(q.remove());
        }

        // Step 4: Again push first half into stack
        for (int i = 0; i < n / 2; i++) {
            st.push(q.remove());
        }

        // Step 5: Interleave
        while (!st.isEmpty()) {
            q.add(st.pop());
            q.add(q.remove());
        }
    }
}