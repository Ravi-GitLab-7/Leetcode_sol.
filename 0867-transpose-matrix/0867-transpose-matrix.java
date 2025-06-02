class Solution {
    public int[][] transpose(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int[][] transpose = new int[n][m];

        // Compute the transpose
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                transpose[j][i] = arr[i][j];
            }
        }
        return  transpose;
    }
}