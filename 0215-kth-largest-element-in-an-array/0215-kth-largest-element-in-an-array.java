class Solution {
    static int ans;
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Partition Algorithm
    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo];
        int pivotIdx = lo;
        int smallerCount = 0;
        // count smaller elements
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] < pivot)
                smallerCount++;
        }
        int correctIdx = pivotIdx + smallerCount;
        swap(arr, pivotIdx, correctIdx); // pivot at correct position
        // partition process
        int i = lo, j = hi;
        while (i < correctIdx && j > correctIdx) {
            if (arr[i] < pivot)
                i++;
            else if (arr[j] >= pivot)
                j--;
            else {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return correctIdx;
    }
    // Quickselect Algorithm (similar to quicksort)
    public static void quickselect(int[] arr, int lo, int hi, int k) {
        if (lo > hi)
            return;
        int idx = partition(arr, lo, hi);
        if (idx == k) {
            ans = arr[idx];
            return;
        } else if (k < idx)
            quickselect(arr, lo, idx - 1, k);
        else
            quickselect(arr, idx + 1, hi, k);
    }
    public int findKthLargest(int[] arr, int k) {
        ans = -1;
        int n = arr.length;
        // convert kth largest to kth smallest index
        int targetIdx = n - k;
        quickselect(arr, 0, n - 1, targetIdx);
        return ans;
    }
}
