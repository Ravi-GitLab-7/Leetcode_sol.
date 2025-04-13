class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;  
        reverse(nums, 0, nums.length - 1);     //full reverse
        reverse(nums, 0, k - 1);               // split reverse
        reverse(nums, k, nums.length - 1);     // after k steps rotateArray
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
