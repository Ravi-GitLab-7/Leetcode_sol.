class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int lo = 0, hi= n-1;
        while(lo<=hi){
            int mid = lo + (hi - lo)/2;
            int missed = arr[mid]-(mid+1);
            if(missed < k) lo = mid + 1;
            else hi = mid - 1;
        }
        return k + lo; // lo = hi + 1  also use k + (hi+1)
    }
}