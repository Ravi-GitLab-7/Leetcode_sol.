class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;  // In case k is larger than the array length
        reverse(nums, 0, nums.length - 1);     // Reverse the whole array
        reverse(nums, 0, k - 1);               // Reverse first part
        reverse(nums, k, nums.length - 1);     // Reverse second part
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
