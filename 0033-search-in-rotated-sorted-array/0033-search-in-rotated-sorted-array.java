class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;        
        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (nums[mid] == target) return mid;

            // Right part sorted
            else if (nums[mid] <= nums[hi]) {  
                if (target > nums[mid] && target <= nums[hi]) lo = mid + 1;
                else hi = mid - 1;
            } 
            // Left part sorted
            else {  
                if (target >= nums[lo] && target < nums[mid]) hi = mid - 1;
                else lo = mid + 1;
            }
        }
        return -1;
    }
}
