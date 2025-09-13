class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x;
        int lo = 0,hi= x;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(mid == x / mid) return mid;
            else if(mid > x / mid) hi = mid - 1;
            else lo = mid + 1;
        }
        return hi;
    }
}