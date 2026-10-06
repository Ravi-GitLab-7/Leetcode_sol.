class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        // Array to store running sum
        int[] prev = new int[n];

        // First element remains same
        prev[0] = nums[0];

        // Start from index 1
        for (int i = 1; i < n; i++) {

            // Current running sum
            prev[i] = nums[i] + prev[i - 1];
        }

        return prev;
    }
}