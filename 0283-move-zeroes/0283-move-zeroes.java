class Solution {
    public void moveZeroes(int[] arr) {
        int n = arr.length;
        int noz = 0;

        for(int ele: arr) {
            if(ele==0) noz++;
        }

        for(int x =0;x<noz;x++){  
            for (int i = 0; i <n-1-x ; i++) {
                if(arr[i]==0){
                    int temp = arr[i];
                    arr[i]= arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
}