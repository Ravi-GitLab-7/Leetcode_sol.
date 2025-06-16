class Solution {
    public void setZeroes(int[][] arr) {
       int m = arr.length, n = arr[0].length;
        boolean[] row = new boolean[m];
        boolean[] coln = new boolean[n];

        // Mark the rows and columns where 0s are present
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    coln[j] = true;
                }
            }
        }

        // Set the rows to 0
        for (int i = 0; i < m; i++) {
            if (row[i]) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Set the columns to 0
        for (int j = 0; j < n; j++) {
            if (coln[j]) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}