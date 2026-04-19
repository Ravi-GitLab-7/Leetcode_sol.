import java.util.*;
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String op : operations) {
            if (op.equals("C")) {
                st.pop(); // remove last element
            }
            else if (op.equals("D")) {
                st.push(st.peek() * 2); // double last
            }
            else if (op.equals("+")) {
                int v1 = st.pop();
                int v2 = st.peek();
                st.push(v1); // restore
                st.push(v1 + v2); // push sum
            }
            else {
                st.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int val : st) {
            sum += val;
        }
        return sum;
    }
}