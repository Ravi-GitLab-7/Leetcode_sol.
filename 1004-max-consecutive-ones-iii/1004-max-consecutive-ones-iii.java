class Solution {
    public int longestOnes(int[] arr, int k) {
         int n = arr.length;
        int i = 0, zeroes = 0;
        int maxLen = 0;
        for (int j = 0; j < n; j++) {
            // Count zeros in the current window
            if (arr[j] == 0) {
                zeroes++;
            }
            // If there are more than one zero,
            // shrink the window from the left
            while (zeroes > k) {
                if (arr[i] == 0) {
                    zeroes--;
                }
                i++;
            }
            // Delete exactly one element
            // Therefore, subtract 1 from window length
            maxLen = Math.max(maxLen, j - i + 1);
        }
        return maxLen;
    }
}

