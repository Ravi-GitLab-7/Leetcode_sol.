class Solution {
    public static void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int i = 0;
        while(i < n){
            if(nums[i] == i || nums[i] == n){
                i++;
            } else {
                swap(i, nums[i], nums);
            }
        }
        for(i = 0; i < n; i++){
            if(nums[i] != i) return i;
        }
        return i;
    }
}