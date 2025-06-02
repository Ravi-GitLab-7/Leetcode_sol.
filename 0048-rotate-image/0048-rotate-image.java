class Solution {
    public void rotate(int[][] arr) {
        int m = arr.length;
       //transpose
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j<=i ; j++) {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i] = temp;
            }
        }
       //rotate --> reverse each row --> reverse the whole array
        for (int i = 0; i <m ; i++) {
            int a =0,b = m-1;
          while(a<b){
              //swap arr[i][a]=arr[i][b]
              int temp = arr[i][a];
              arr[i][a] = arr[i][b];
              arr[i][b] = temp;
              a++;
              b--;
          }
        }
    }
}