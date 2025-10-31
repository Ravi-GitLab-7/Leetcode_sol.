class Solution {
    public void swap(int i,int j, int[]arr){
        int temp = arr[i];
        arr[i] = arr[j];       
        arr[j] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n= arr.length;
        int i = 0;        
        while(i<n){
            int ele = arr[i]; // ele should be an ele-1 index 
            if(arr[i]==i+1 || arr[i]== arr [ele-1]) i++;
            else{
                swap(i,ele-1,arr);
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(i =0;i<n;i++){
            if(arr[i] != i+1) ans.add(i+1);
        }
            return ans;
    }
}