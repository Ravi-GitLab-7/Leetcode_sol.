class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0;
        // total sum
        for(int i = 0;i<nums.length;i++){
            total += nums[i];
        }
        // now rightsumand left sum and compare
        int leftSum = 0;
        for(int i = 0;i<nums.length;i++){
            int rightSum = total - leftSum - nums[i];

            // now check is equall or not
            if(leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}