class Solution {
    public  void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int majorityElement(int[] arr) {
        // Arrays.sort(arr);
        // return arr[arr.length/2];
        for (int i = 1; i < arr.length; i++) {  //for passing n-1 passes
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]){
                swap(arr, j, j - 1);
                j--;
            }
        }
        return arr[arr.length/2];
    }
}