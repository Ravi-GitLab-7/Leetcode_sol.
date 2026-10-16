
class Solution {
    public int maxSatisfied(int[] arr, int[] grumpy, int k) {
        int n = arr.length, i = 0, j = k - 1, unSatisfied = 0;
        int a = 0, b = j, maxSatisfied = 0;

        // First window
        for (int x = 0; x <= j; x++) {
            if (grumpy[x] == 1) {
                unSatisfied += arr[x];
            }
        }
        maxSatisfied = unSatisfied;
        // Sliding window
        while (j < n - 1) {
            i++;
            j++;
            // Add the new element
            if (grumpy[j] == 1) {
                unSatisfied += arr[j];
            }
            // Remove the element leaving the window
            if (grumpy[i - 1] == 1) {
                unSatisfied -= arr[i - 1];
            }
            // Store the best window
            if (unSatisfied > maxSatisfied) {
                maxSatisfied = unSatisfied;
                a = i;
                b = j;
            }
        }
        // Recover the maximum number of customers
        for (int x = a; x <= b; x++) {
            grumpy[x] = 0;
        }
        int satisfied = 0;
        for (int x = 0; x < n; x++) {
            if (grumpy[x] == 0) {
                satisfied += arr[x];
            }
        }
        return satisfied;
    }
}
