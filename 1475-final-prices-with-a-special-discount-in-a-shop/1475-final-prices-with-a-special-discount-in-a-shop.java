class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> st = new Stack<>();
        for(int i= n-1;i>=0;i--){
            int curr = prices[i];
            while(!st.isEmpty() && st.peek() > curr){
                st.pop();
            }
            if(!st.isEmpty()) prices[i] = curr - st.peek();
            else prices[i] = curr;

            st.push(curr);
        }
        return prices;
    }
}