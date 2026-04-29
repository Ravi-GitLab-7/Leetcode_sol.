import java.util.*;
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int[] result = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            // Step 1: Remove out of window indices
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }
            // Step 2: Remove smaller elements from back
            while (!dq.isEmpty() && nums[i] > nums[dq.peekLast()]) {
                dq.pollLast();
            }
            // Step 3: Add current index
            dq.offerLast(i);
            // Step 4: Store result
            if (i >= k - 1) {
                result[i - (k - 1)] = nums[dq.peekFirst()];
            }
        }
        return result;
    }
}