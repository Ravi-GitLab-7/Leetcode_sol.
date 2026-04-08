import java.util.Stack;
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (!st.isEmpty() && st.peek() == c) {
                st.pop();   // remove duplicate
            } else {
                st.push(c); // add new character
            }
        }
        // Build result string
        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}