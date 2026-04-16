import java.util.*;

class MinStack {
    Stack<Integer> s;
    Stack<Integer> min;

    public MinStack() {
        s = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        s.push(val);
        if (min.isEmpty() || min.peek() >= val) {
            min.push(val);
        }
    }
    
    public void pop() {
        if (!s.isEmpty()) {
            int val = s.pop();  
            if (!min.isEmpty() && min.peek() == val) {
                min.pop();
            }
        }
    }
    
    public int top() {
        if (s.isEmpty()) return -1;
        return s.peek();
    }
    
    public int getMin() {
        if (min.isEmpty()) return -1;
        return min.peek();
    }
}