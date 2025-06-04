class Solution {
    public int[][] generateMatrix(int n) {
       int[][] matrix = new int[n][n];

        int minr = 0, maxr = n - 1;
        int minc = 0, maxc = n - 1;
        int val = 1;

        while (minr <= maxr && minc <= maxc) {
            // left to right
            for (int j = minc; j <= maxc; j++) {
                matrix[minr][j] = val++;
            }
            minr++;

            // top to bottom
            if (minr > maxr || minc > maxc)
                break;
            for (int i = minr; i <= maxr; i++) {
                matrix[i][maxc] = val++;
            }
            maxc--;

            // right to left
            if (minr > maxr || minc > maxc)
                break;
            for (int j = maxc; j >= minc; j--) {
                matrix[maxr][j] = val++;
            }
            maxr--;

            // bottom to top
            if (minr > maxr || minc > maxc)
                break;
            for (int i = maxr; i >= minr; i--) {
                matrix[i][minc] = val++;
            }
            minc++;
        }
        return matrix;
    }
}