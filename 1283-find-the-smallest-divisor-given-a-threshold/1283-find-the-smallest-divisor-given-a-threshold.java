class Solution {
    public boolean isLess(int mid, int[] arr, int t) {
        int sum = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % mid == 0) 
                sum += arr[i] / mid;
            else 
                sum += arr[i] / mid + 1;
        }
        if (sum <= t) return true;
        return false;
    }

    public int smallestDivisor(int[] arr, int t) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;

        // find max element
        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        int d = 1;
        int lo = 1, hi = max;

        // binary search
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (isLess(mid, arr, t)) {
                d = mid;       
                hi = mid - 1;
            } else {
                lo = mid + 1;   
            }
        }
        return d;
    }
}
