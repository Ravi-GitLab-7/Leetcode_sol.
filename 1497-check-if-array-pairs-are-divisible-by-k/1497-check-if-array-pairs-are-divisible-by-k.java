class Solution {
    public boolean canArrange(int[] arr, int k) {

        // Count frequency of each remainder
        int[] freq = new int[k];

        for (int num : arr) {
            int rem = ((num % k) + k) ;
            freq[rem]++;
        }

        // Remainder 0 must have even frequency
        if (freq[0] % 2 != 0) {
            return false;
        }

        // Check remainder pairs
        for (int i = 1; i <= (k - 1) / 2; i++) {

            if (freq[i] != freq[k - i]) {
                return false;
            }
        }

        // If k is even, k/2 must have even frequency
        if (k % 2 == 0 && freq[k / 2] % 2 != 0) {
            return false;
        }

        return true;
    }
}