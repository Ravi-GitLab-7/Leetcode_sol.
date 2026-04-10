class Solution {
    public int largestRectangleArea(int[] heights) {
    // public int largestRectangleArea(int[] heights) {

        // int n = heights.length;
        // int maxArea = 0;

        // for (int i = 0; i < n; i++) {
        //     int height = heights[i];

        //     int left = i;
        //     int right = i;

        //     // left expand
        //     while (left >= 0 && heights[left] >= height) {
        //         left--;
        //     }

        //     // right expand
        //     while (right < n && heights[right] >= height) {
        //         right++;
        //     }

        //     int width = right - left - 1;
        //     int area = height * width;

        //     maxArea = Math.max(maxArea, area);
        // }
        // return maxArea;

   int n = heights.length;
        Stack<Integer> st = new Stack<>();

        // Next Smaller Element (Right)
        int[] nse = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) nse[i] = n;
            else nse[i] = st.peek();

            st.push(i);
        }

        // clear stack
        st.clear();

        // Previous Smaller Element (Left)
        int[] pge = new int[n];
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.isEmpty()) pge[i] = -1;
            else pge[i] = st.peek();

            st.push(i);
        }

        // Calculate max area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nse[i] - pge[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}