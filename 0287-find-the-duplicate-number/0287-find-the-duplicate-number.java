class Solution {
    public void swap(int i,int j, int[]arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int findDuplicate(int[] arr) {
        while(true){
            int ele = arr[0];
            if(arr[ele]==ele) return ele;
            swap(0,ele,arr);
        }
    }
}