class StockSpanner {
            Stack<int[]> st; // pair of price and span

    public StockSpanner() {
        st = new Stack<>();
    }
    
    public int next(int price) {
        int span = 1 ;  // currently span is of price  is 1 which is itself
        while(!st.isEmpty() && st.peek()[0] <= price){
            span += st.peek()[1];
            st.pop();
        }
        st.push(new int[]{price, span});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */