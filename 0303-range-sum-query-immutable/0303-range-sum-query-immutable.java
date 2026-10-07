class NumArray {
        int[] arr;
    public NumArray(int[] nums) {  // this the constr5octor so that we intialise arr outside
        arr = Arrays.copyOf(nums,nums.length); // for deep copy if given dont change
        for(int i = 1;i<nums.length;i++){
            arr[i] += arr[i -1];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left ==  0 ) return arr[right];
        return arr[right] - arr[left - 1];
    }        
}
  // tc prerfix sum array = o(n)
  // tc for m query = 0(m)
  // total c = (m+n)
  // sc = 0(n), AS = 0(n)
/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */