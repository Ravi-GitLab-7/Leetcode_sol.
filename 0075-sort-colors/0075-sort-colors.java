class Solution {
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void sortColors(int[] arr) {
//         int n = arr.length;
//         int noOfZeros = 0, NoOfOnes = 0;
//  for(int i =0;i<n;i++){
//           if(arr[i]==0) noOfZeros++;
//           if(arr[i]==1) NoOfOnes++;
//       }
//       //sorting array
//         for(int i =0;i<n;i++){
//             if(i<noOfZeros) arr[i] = 0;
//             else if(i<noOfZeros+NoOfOnes) arr[i]= 1;
//             else arr[i]=2;
//         }
        int n = arr.length;
        int mid = 0, low = 0, high = n - 1;

        while(mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            }
            else if(arr[mid] == 1) {
                mid++;
            }
            else {  // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}