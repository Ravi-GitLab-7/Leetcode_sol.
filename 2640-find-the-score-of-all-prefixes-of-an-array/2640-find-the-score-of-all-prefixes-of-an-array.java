class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long max = 0;
        long sum = 0;
        long[] ans = new long[n];
        for (int i = 0; i < n; i++) {
            // Find maximum element till current index
            max = Math.max(max, nums[i]);
            // Calculate converted value and add to prefix score
            sum += nums[i] + max;
            // Store the prefix score
            ans[i] = sum;
        }

        return ans;
    }
}