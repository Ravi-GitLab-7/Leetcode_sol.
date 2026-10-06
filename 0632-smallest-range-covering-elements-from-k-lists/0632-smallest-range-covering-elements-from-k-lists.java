import java.util.*;

class Solution {

    // Triplet stores:
    // ele = element value
    // row = which list this element belongs to
    // col = index of element inside that list
    public static class Triplet implements Comparable<Triplet> {

        int ele;
        int row;
        int col;

        // Constructor
        Triplet(int ele, int row, int col) {
            this.ele = ele;
            this.row = row;
            this.col = col;
        }

        // PriorityQueue will use this method
        // to make a Min Heap based on ele
        @Override
        public int compareTo(Triplet t) {
            return this.ele - t.ele;
        }
    }

    public int[] smallestRange(List<List<Integer>> nums) {

        // Answer range
        // Initially, keep a very large range
        int[] ans = {0, Integer.MAX_VALUE};

        // Min Heap
        // Smallest element will come at the top
        PriorityQueue<Triplet> pq = new PriorityQueue<>();

        // Number of lists
        int k = nums.size();

        // Stores the maximum element
        // among the current elements
        int max = Integer.MIN_VALUE;


        // ---------------------------------------
        // Put first element of every list
        // into the Min Heap
        // ---------------------------------------

        for (int i = 0; i < k; i++) {

            // Get first element of current list
            int ele = nums.get(i).get(0);

            // Add element along with
            // its row and column
            pq.add(new Triplet(ele, i, 0));

            // Update maximum
            max = Math.max(max, ele);
        }


        // ---------------------------------------
        // Process the heap
        // ---------------------------------------

        while (true) {

            // Remove the smallest element
            Triplet top = pq.remove();

            // Get its value
            int ele = top.ele;

            // Get its row
            int row = top.row;

            // Get its column
            int col = top.col;


            // ---------------------------------------
            // Current range is:
            //
            // [ele, max]
            // ---------------------------------------

            // Check whether current range
            // is smaller than our answer
            if (max - ele < ans[1] - ans[0]) {

                // Update left side
                ans[0] = ele;

                // Update right side
                ans[1] = max;
            }


            // ---------------------------------------
            // Move to next element of same row
            // ---------------------------------------

            // If there is no next element,
            // we cannot continue
            if (col + 1 >= nums.get(row).size()) {
                break;
            }


            // Get next element from same row
            int next = nums.get(row).get(col + 1);


            // Add next element to Min Heap
            pq.add(new Triplet(next, row, col + 1));


            // Update maximum
            max = Math.max(max, next);
        }


        // Return smallest range
        return ans;
    }
}