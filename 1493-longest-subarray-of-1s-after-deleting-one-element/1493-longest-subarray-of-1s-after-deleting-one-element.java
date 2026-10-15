class Solution {
    public int longestSubarray(int[] arr) {
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
            while (zeroes > 1) {
                if (arr[i] == 0) {
                    zeroes--;
                }
                i++;
            }
            // Delete exactly one element
            // Therefore, subtract 1 from window length
            maxLen = Math.max(maxLen, j - i);
        }
        return maxLen;
    }
}


// class Solution {
//     public int longestSubarray(int[] arr) {
//         int n = arr.length, i = 0, j = 0;
//         int zeroes = 0, maxLen = 0;

//         // Count total zeroes
//         int z = 0;
//         for (int ele : arr) {
//             if (ele == 0) z++;
//         }

//         // If all elements are zero, answer is 0
//         if (z == n) return 0;

//         // If all elements are one, delete one element
//         if (z == 0) return n - 1;

//         // Skip leading zeroes
//         while (i < n && arr[i] == 0) i++;

//         j = i;

//         while (j < n) {
//             if (arr[j] == 1) {
//                 j++;
//             } else {
//                 if (zeroes == 0) {
//                     j++;
//                     zeroes++;
//                 } else {
//                     int len = j - i - 1;
//                     maxLen = Math.max(maxLen, len);

//                     // Move i past the previous zero
//                     while (i < j && arr[i] == 1) i++;
//                     i++;
//                     zeroes--;

//                     // Continue from the current position
//                 }
//             }
//         }
//         // Check the remaining window
//         int len = j - i - 1;
//         maxLen = Math.max(maxLen, len);
//         return maxLen;
//     }
// }

