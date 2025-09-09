class Solution {
    public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int[] ans = new int[2];

        // first position 
        int fp = -1, lo = 0, hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                if (mid > 0 && arr[mid] == arr[mid - 1]) hi = mid - 1;
                else {
                    fp = mid;
                    break;
                }
            } else if (arr[mid] < target) lo = mid + 1;
            else if (arr[mid] > target) hi = mid - 1;
        }

        // second position
        int lp = -1; lo = 0; hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] == target) {
                if (mid + 1 < n && arr[mid] == arr[mid + 1]) lo = mid + 1;
                else {
                    lp = mid;
                    break;
                }
            } else if (arr[mid] < target) lo = mid + 1;
            else if (arr[mid] > target) hi = mid - 1;
        }

        ans[0] = fp;
        ans[1] = lp;
        return ans;
    }
}
